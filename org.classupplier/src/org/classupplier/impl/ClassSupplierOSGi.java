package org.classupplier.impl;

import java.util.Dictionary;
import java.util.Hashtable;

import org.classupplier.ClassSupplier;
import org.classupplier.Workspace;
import org.classupplier.di.ServiceFactory;
import org.classupplier.util.ResourceUtil;
import org.eclipse.core.resources.ISaveParticipant;
import org.eclipse.core.resources.ISavedState;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.contexts.IContextFunction;
import org.eclipse.emf.ecore.resource.Resource;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;

public class ClassSupplierOSGi extends Plugin {

	public static final String PLUGIN_ID = "org.classupplier";

	public static final String NATURE_ID = PLUGIN_ID + '.' + "userDomainNature";

	public static final String MODEL_FOLDER_PREF_KEY = "modelFolder";

	public static final String MODEL_RESOURCE_EXT_PREF_KEY = "resourceExt";

	public static final String WORKSPACE_SAVE_FILE = "definition";

	private static ClassSupplierOSGi instance;

	private static ServiceTracker<ClassSupplier, ClassSupplierImpl> tracker;

	private ServiceRegistration<ClassSupplier> reg;

	public static ClassSupplierOSGi getInstance() {
		return instance;
	}

	/**
	 * Only for internal use.
	 * 
	 * @return ClassSupplier service instance
	 */
	public static ClassSupplier getClassSupplier() {
		return tracker.getService();
	}

	public static Object getService(String serviceClass) {
		if (getInstance() == null)
			return null;
		BundleContext context = getInstance().getBundle().getBundleContext();
		ServiceReference<?> reference = context
				.getServiceReference(serviceClass);
		if (reference == null)
			return null;
		Object result = context.getService(reference);
		context.ungetService(reference);
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception {
		instance = this;
		reg = context.registerService(ClassSupplier.class,
				new ClassSupplierImpl(), null);
		Dictionary<String, String> properties = new Hashtable<String, String>();
		properties.put(IContextFunction.SERVICE_CONTEXT_KEY,
				ClassSupplier.class.getName());
		context.registerService(IContextFunction.SERVICE_NAME,
				new ServiceFactory(), properties);
		tracker = new ServiceTracker<ClassSupplier, ClassSupplierImpl>(context,
				ClassSupplier.class, null);
		tracker.open();
		ISaveParticipant saveParticipant = new WorkspaceSaveParticipant();
		ISavedState lastState = ResourcesPlugin.getWorkspace()
				.addSaveParticipant(PLUGIN_ID, saveParticipant);
		if (lastState == null)
			return;
		IPath location = lastState.lookup(new Path(WORKSPACE_SAVE_FILE));
		if (location == null)
			return;
		Resource resource = getClassSupplier()
				.getWorkspace()
				.getResourceSet()
				.getResource(
						ResourceUtil.workspaceResourceURI(location.toString()),
						true);
		if (!resource.getContents().isEmpty())
			getClassSupplier().getWorkspace().init(
					(Workspace) resource.getContents().get(0));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		IProgressMonitor monitor = new NullProgressMonitor();
		Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD, monitor);
		getClassSupplier().getWorkspace().save(monitor);
		tracker.close();
		reg.unregister();
		instance = null;

	}

	public static IStatus createOKStatus(String message) {
		return new Status(IStatus.OK, ClassSupplierOSGi.PLUGIN_ID, message);
	}

	public static IStatus createWarningStatus(String message) {
		return new Status(IStatus.WARNING, ClassSupplierOSGi.PLUGIN_ID, message);
	}

	public static IStatus createWarningStatus(Throwable exception) {
		return new Status(IStatus.WARNING, ClassSupplierOSGi.PLUGIN_ID,
				exception.getLocalizedMessage(), exception);
	}

	public static IStatus createErrorStatus(String message) {
		return new Status(IStatus.ERROR, ClassSupplierOSGi.PLUGIN_ID, message);
	}

	public static IStatus createErrorStatus(Throwable exception) {
		return new Status(IStatus.ERROR, ClassSupplierOSGi.PLUGIN_ID,
				exception.getLocalizedMessage(), exception);
	}

}
