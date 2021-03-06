/**
 */
package org.classupplier;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.classupplier.ClassSupplierFactory
 * @model kind="package"
 * @generated
 */
public interface ClassSupplierPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "classupplier";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/classupplier/0.7.6";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "classupplier";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClassSupplierPackage eINSTANCE = org.classupplier.impl.ClassSupplierPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.classupplier.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.classupplier.impl.StateImpl
	 * @see org.classupplier.impl.ClassSupplierPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The meta object id for the '{@link org.classupplier.impl.ContributionImpl <em>Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.classupplier.impl.ContributionImpl
	 * @see org.classupplier.impl.ClassSupplierPackageImpl#getContribution()
	 * @generated
	 */
	int CONTRIBUTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__TIME = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__STAGE = 3;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__PROJECT_NAME = 4;

	/**
	 * The feature id for the '<em><b>Snapshots</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__SNAPSHOTS = 5;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__STATE = 6;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__EPACKAGE = 7;

	/**
	 * The number of structural features of the '<em>Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_FEATURE_COUNT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TIME = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STAGE = 3;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PROJECT_NAME = 4;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EPACKAGE = 5;

	/**
	 * The feature id for the '<em><b>Dynamic EPackage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DYNAMIC_EPACKAGE = 6;

	/**
	 * The feature id for the '<em><b>Runtime EPackage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__RUNTIME_EPACKAGE = 7;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.core.runtime.jobs.ISchedulingRule <em>IScheduling Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.jobs.ISchedulingRule
	 * @see org.classupplier.impl.ClassSupplierPackageImpl#getISchedulingRule()
	 * @generated
	 */
	int ISCHEDULING_RULE = 4;

	/**
	 * The number of structural features of the '<em>IScheduling Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCHEDULING_RULE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.classupplier.impl.WorkspaceImpl <em>Workspace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.classupplier.impl.WorkspaceImpl
	 * @see org.classupplier.impl.ClassSupplierPackageImpl#getWorkspace()
	 * @generated
	 */
	int WORKSPACE = 2;

	/**
	 * The feature id for the '<em><b>Contributions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__CONTRIBUTIONS = ISCHEDULING_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__RESOURCE_SET = ISCHEDULING_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Workspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_FEATURE_COUNT = ISCHEDULING_RULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.classupplier.impl.DateToStateMapEntryImpl <em>Date To State Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.classupplier.impl.DateToStateMapEntryImpl
	 * @see org.classupplier.impl.ClassSupplierPackageImpl#getDateToStateMapEntry()
	 * @generated
	 */
	int DATE_TO_STATE_MAP_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TO_STATE_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TO_STATE_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Date To State Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TO_STATE_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link java.util.concurrent.Future <em>Future</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.concurrent.Future
	 * @see org.classupplier.impl.ClassSupplierPackageImpl#getFuture()
	 * @generated
	 */
	int FUTURE = 5;

	/**
	 * The number of structural features of the '<em>Future</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.classupplier.Phase <em>Phase</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.classupplier.Phase
	 * @see org.classupplier.impl.ClassSupplierPackageImpl#getPhase()
	 * @generated
	 */
	int PHASE = 6;

	/**
	 * The meta object id for the '<em>IProgress Monitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @see org.classupplier.impl.ClassSupplierPackageImpl#getIProgressMonitor()
	 * @generated
	 */
	int IPROGRESS_MONITOR = 7;

	/**
	 * The meta object id for the '<em>Version</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.equinox.p2.metadata.Version
	 * @see org.classupplier.impl.ClassSupplierPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 8;

	/**
	 * Returns the meta object for class '{@link org.classupplier.Contribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contribution</em>'.
	 * @see org.classupplier.Contribution
	 * @generated
	 */
	EClass getContribution();

	/**
	 * Returns the meta object for the attribute '{@link org.classupplier.Contribution#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.classupplier.Contribution#getName()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.classupplier.Contribution#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.classupplier.Contribution#getTime()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_Time();

	/**
	 * Returns the meta object for the attribute '{@link org.classupplier.Contribution#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.classupplier.Contribution#getVersion()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.classupplier.Contribution#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stage</em>'.
	 * @see org.classupplier.Contribution#getStage()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_Stage();

	/**
	 * Returns the meta object for the attribute '{@link org.classupplier.Contribution#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see org.classupplier.Contribution#getProjectName()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_ProjectName();

	/**
	 * Returns the meta object for the map '{@link org.classupplier.Contribution#getSnapshots <em>Snapshots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Snapshots</em>'.
	 * @see org.classupplier.Contribution#getSnapshots()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_Snapshots();

	/**
	 * Returns the meta object for the reference '{@link org.classupplier.Contribution#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see org.classupplier.Contribution#getState()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_State();

	/**
	 * Returns the meta object for the reference '{@link org.classupplier.Contribution#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EPackage</em>'.
	 * @see org.classupplier.Contribution#getEPackage()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_EPackage();

	/**
	 * Returns the meta object for class '{@link org.classupplier.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.classupplier.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link org.classupplier.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.classupplier.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.classupplier.State#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.classupplier.State#getTime()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Time();

	/**
	 * Returns the meta object for the attribute '{@link org.classupplier.State#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.classupplier.State#getVersion()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.classupplier.State#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stage</em>'.
	 * @see org.classupplier.State#getStage()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Stage();

	/**
	 * Returns the meta object for the attribute '{@link org.classupplier.State#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see org.classupplier.State#getProjectName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_ProjectName();

	/**
	 * Returns the meta object for the attribute list '{@link org.classupplier.State#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>EPackage</em>'.
	 * @see org.classupplier.State#getEPackage()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_EPackage();

	/**
	 * Returns the meta object for the containment reference '{@link org.classupplier.State#getDynamicEPackage <em>Dynamic EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dynamic EPackage</em>'.
	 * @see org.classupplier.State#getDynamicEPackage()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_DynamicEPackage();

	/**
	 * Returns the meta object for the containment reference '{@link org.classupplier.State#getRuntimeEPackage <em>Runtime EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runtime EPackage</em>'.
	 * @see org.classupplier.State#getRuntimeEPackage()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_RuntimeEPackage();

	/**
	 * Returns the meta object for class '{@link org.classupplier.Workspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workspace</em>'.
	 * @see org.classupplier.Workspace
	 * @generated
	 */
	EClass getWorkspace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.classupplier.Workspace#getContributions <em>Contributions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contributions</em>'.
	 * @see org.classupplier.Workspace#getContributions()
	 * @see #getWorkspace()
	 * @generated
	 */
	EReference getWorkspace_Contributions();

	/**
	 * Returns the meta object for the attribute '{@link org.classupplier.Workspace#getResourceSet <em>Resource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Set</em>'.
	 * @see org.classupplier.Workspace#getResourceSet()
	 * @see #getWorkspace()
	 * @generated
	 */
	EAttribute getWorkspace_ResourceSet();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Date To State Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date To State Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EDate"
	 *        valueType="org.classupplier.State" valueContainment="true"
	 * @generated
	 */
	EClass getDateToStateMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getDateToStateMapEntry()
	 * @generated
	 */
	EAttribute getDateToStateMapEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getDateToStateMapEntry()
	 * @generated
	 */
	EReference getDateToStateMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.core.runtime.jobs.ISchedulingRule <em>IScheduling Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IScheduling Rule</em>'.
	 * @see org.eclipse.core.runtime.jobs.ISchedulingRule
	 * @model instanceClass="org.eclipse.core.runtime.jobs.ISchedulingRule"
	 * @generated
	 */
	EClass getISchedulingRule();

	/**
	 * Returns the meta object for class '{@link java.util.concurrent.Future <em>Future</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Future</em>'.
	 * @see java.util.concurrent.Future
	 * @model instanceClass="java.util.concurrent.Future" typeParameters="V"
	 * @generated
	 */
	EClass getFuture();

	/**
	 * Returns the meta object for enum '{@link org.classupplier.Phase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Phase</em>'.
	 * @see org.classupplier.Phase
	 * @generated
	 */
	EEnum getPhase();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.IProgressMonitor <em>IProgress Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IProgress Monitor</em>'.
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @model instanceClass="org.eclipse.core.runtime.IProgressMonitor"
	 * @generated
	 */
	EDataType getIProgressMonitor();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.equinox.p2.metadata.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version</em>'.
	 * @see org.eclipse.equinox.p2.metadata.Version
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.Version"
	 * @generated
	 */
	EDataType getVersion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClassSupplierFactory getClassSupplierFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.classupplier.impl.ContributionImpl <em>Contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.classupplier.impl.ContributionImpl
		 * @see org.classupplier.impl.ClassSupplierPackageImpl#getContribution()
		 * @generated
		 */
		EClass CONTRIBUTION = eINSTANCE.getContribution();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__NAME = eINSTANCE.getContribution_Name();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__TIME = eINSTANCE.getContribution_Time();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__VERSION = eINSTANCE.getContribution_Version();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__STAGE = eINSTANCE.getContribution_Stage();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__PROJECT_NAME = eINSTANCE
				.getContribution_ProjectName();

		/**
		 * The meta object literal for the '<em><b>Snapshots</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION__SNAPSHOTS = eINSTANCE
				.getContribution_Snapshots();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION__STATE = eINSTANCE.getContribution_State();

		/**
		 * The meta object literal for the '<em><b>EPackage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION__EPACKAGE = eINSTANCE
				.getContribution_EPackage();

		/**
		 * The meta object literal for the '{@link org.classupplier.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.classupplier.impl.StateImpl
		 * @see org.classupplier.impl.ClassSupplierPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__TIME = eINSTANCE.getState_Time();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__VERSION = eINSTANCE.getState_Version();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__STAGE = eINSTANCE.getState_Stage();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__PROJECT_NAME = eINSTANCE.getState_ProjectName();

		/**
		 * The meta object literal for the '<em><b>EPackage</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__EPACKAGE = eINSTANCE.getState_EPackage();

		/**
		 * The meta object literal for the '<em><b>Dynamic EPackage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__DYNAMIC_EPACKAGE = eINSTANCE
				.getState_DynamicEPackage();

		/**
		 * The meta object literal for the '<em><b>Runtime EPackage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__RUNTIME_EPACKAGE = eINSTANCE
				.getState_RuntimeEPackage();

		/**
		 * The meta object literal for the '{@link org.classupplier.impl.WorkspaceImpl <em>Workspace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.classupplier.impl.WorkspaceImpl
		 * @see org.classupplier.impl.ClassSupplierPackageImpl#getWorkspace()
		 * @generated
		 */
		EClass WORKSPACE = eINSTANCE.getWorkspace();

		/**
		 * The meta object literal for the '<em><b>Contributions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSPACE__CONTRIBUTIONS = eINSTANCE
				.getWorkspace_Contributions();

		/**
		 * The meta object literal for the '<em><b>Resource Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSPACE__RESOURCE_SET = eINSTANCE
				.getWorkspace_ResourceSet();

		/**
		 * The meta object literal for the '{@link org.classupplier.impl.DateToStateMapEntryImpl <em>Date To State Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.classupplier.impl.DateToStateMapEntryImpl
		 * @see org.classupplier.impl.ClassSupplierPackageImpl#getDateToStateMapEntry()
		 * @generated
		 */
		EClass DATE_TO_STATE_MAP_ENTRY = eINSTANCE.getDateToStateMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TO_STATE_MAP_ENTRY__KEY = eINSTANCE
				.getDateToStateMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_TO_STATE_MAP_ENTRY__VALUE = eINSTANCE
				.getDateToStateMapEntry_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.core.runtime.jobs.ISchedulingRule <em>IScheduling Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.jobs.ISchedulingRule
		 * @see org.classupplier.impl.ClassSupplierPackageImpl#getISchedulingRule()
		 * @generated
		 */
		EClass ISCHEDULING_RULE = eINSTANCE.getISchedulingRule();

		/**
		 * The meta object literal for the '{@link java.util.concurrent.Future <em>Future</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.concurrent.Future
		 * @see org.classupplier.impl.ClassSupplierPackageImpl#getFuture()
		 * @generated
		 */
		EClass FUTURE = eINSTANCE.getFuture();

		/**
		 * The meta object literal for the '{@link org.classupplier.Phase <em>Phase</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.classupplier.Phase
		 * @see org.classupplier.impl.ClassSupplierPackageImpl#getPhase()
		 * @generated
		 */
		EEnum PHASE = eINSTANCE.getPhase();

		/**
		 * The meta object literal for the '<em>IProgress Monitor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IProgressMonitor
		 * @see org.classupplier.impl.ClassSupplierPackageImpl#getIProgressMonitor()
		 * @generated
		 */
		EDataType IPROGRESS_MONITOR = eINSTANCE.getIProgressMonitor();

		/**
		 * The meta object literal for the '<em>Version</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.equinox.p2.metadata.Version
		 * @see org.classupplier.impl.ClassSupplierPackageImpl#getVersion()
		 * @generated
		 */
		EDataType VERSION = eINSTANCE.getVersion();

	}

} //ClassSupplierPackage
