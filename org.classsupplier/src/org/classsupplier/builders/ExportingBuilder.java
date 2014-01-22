package org.classsupplier.builders;

import java.util.Map;

import org.classsupplier.Artifact;
import org.classsupplier.State;
import org.classsupplier.Version;
import org.classsupplier.export.Exporter;
import org.classsupplier.export.MavenExporter;
import org.classsupplier.impl.OSGi;
import org.classsupplier.impl.PathHelper;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.jobs.Job;

public class ExportingBuilder extends IncrementalProjectBuilder {

	public static final String BUILDER_ID = OSGi.PLUGIN_ID + '.'
			+ "exportBuilder";

	protected Exporter exporter = new MavenExporter();

	@Override
	protected IProject[] build(int kind, Map<String, String> args,
			IProgressMonitor monitor) throws CoreException {
		if (kind != FULL_BUILD)
			return null;
		exporter.setDestination(PathHelper.getDefaultDestination());
		if (exporter.getQualifier() == null) {
			Artifact artifact = OSGi.getClassSupplier().getWorkspace()
					.getArtifact(getProject().getName());
			if (artifact.getState().equals(State.CREATED)
					|| !artifact.getState().equals(State.PROCESSING))
				return null;
			Version version = artifact.getVersion();
			exporter.setQualifier(version.getQualifier());
		}
		exporter.export(getProject(), monitor);
		try {
			Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD,
					monitor);
		} catch (OperationCanceledException e) {
			return null;
		} catch (InterruptedException e) {
			return null;
		}
		return null;
	}
}