/**
 */
package com.vainolo.phd.opm.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.vainolo.phd.opm.model.OpmFactory
 * @model kind="package"
 * @generated
 */
public interface OpmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "opm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.vainolo.com/phd/opm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "opm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpmPackage eINSTANCE = com.vainolo.phd.opm.model.impl.OpmPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opm.model.impl.ObjectProcessDiagramImpl <em>Object Process Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opm.model.impl.ObjectProcessDiagramImpl
	 * @see com.vainolo.phd.opm.model.impl.OpmPackageImpl#getObjectProcessDiagram()
	 * @generated
	 */
	int OBJECT_PROCESS_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROCESS_DIAGRAM__OBJECTS = 0;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROCESS_DIAGRAM__PROCESSES = 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROCESS_DIAGRAM__LINKS = 2;

	/**
	 * The number of structural features of the '<em>Object Process Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROCESS_DIAGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Object Process Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROCESS_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opm.model.impl.OPMThingImpl <em>OPM Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opm.model.impl.OPMThingImpl
	 * @see com.vainolo.phd.opm.model.impl.OpmPackageImpl#getOPMThing()
	 * @generated
	 */
	int OPM_THING = 1;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING__INCOMING_LINKS = 0;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING__OUTGOING_LINKS = 1;

	/**
	 * The number of structural features of the '<em>OPM Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>OPM Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opm.model.impl.OPMObjectImpl <em>OPM Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opm.model.impl.OPMObjectImpl
	 * @see com.vainolo.phd.opm.model.impl.OpmPackageImpl#getOPMObject()
	 * @generated
	 */
	int OPM_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT__INCOMING_LINKS = OPM_THING__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT__OUTGOING_LINKS = OPM_THING__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT__NAME = OPM_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opd</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT__OPD = OPM_THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT__CONSTRAINTS = OPM_THING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>OPM Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT_FEATURE_COUNT = OPM_THING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>OPM Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT_OPERATION_COUNT = OPM_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opm.model.impl.OPMProcessImpl <em>OPM Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opm.model.impl.OPMProcessImpl
	 * @see com.vainolo.phd.opm.model.impl.OpmPackageImpl#getOPMProcess()
	 * @generated
	 */
	int OPM_PROCESS = 3;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS__INCOMING_LINKS = OPM_THING__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS__OUTGOING_LINKS = OPM_THING__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS__NAME = OPM_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opd</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS__OPD = OPM_THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OPM Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS_FEATURE_COUNT = OPM_THING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>OPM Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS_OPERATION_COUNT = OPM_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opm.model.impl.OPMLinkImpl <em>OPM Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opm.model.impl.OPMLinkImpl
	 * @see com.vainolo.phd.opm.model.impl.OpmPackageImpl#getOPMLink()
	 * @generated
	 */
	int OPM_LINK = 4;

	/**
	 * The feature id for the '<em><b>Opd</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_LINK__OPD = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_LINK__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_LINK__TARGET = 2;

	/**
	 * The number of structural features of the '<em>OPM Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_LINK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>OPM Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_LINK_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '<em>Rectangle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @see com.vainolo.phd.opm.model.impl.OpmPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 5;


	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opm.model.ObjectProcessDiagram <em>Object Process Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Process Diagram</em>'.
	 * @see com.vainolo.phd.opm.model.ObjectProcessDiagram
	 * @generated
	 */
	EClass getObjectProcessDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vainolo.phd.opm.model.ObjectProcessDiagram#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see com.vainolo.phd.opm.model.ObjectProcessDiagram#getObjects()
	 * @see #getObjectProcessDiagram()
	 * @generated
	 */
	EReference getObjectProcessDiagram_Objects();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vainolo.phd.opm.model.ObjectProcessDiagram#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processes</em>'.
	 * @see com.vainolo.phd.opm.model.ObjectProcessDiagram#getProcesses()
	 * @see #getObjectProcessDiagram()
	 * @generated
	 */
	EReference getObjectProcessDiagram_Processes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vainolo.phd.opm.model.ObjectProcessDiagram#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see com.vainolo.phd.opm.model.ObjectProcessDiagram#getLinks()
	 * @see #getObjectProcessDiagram()
	 * @generated
	 */
	EReference getObjectProcessDiagram_Links();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opm.model.OPMThing <em>OPM Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OPM Thing</em>'.
	 * @see com.vainolo.phd.opm.model.OPMThing
	 * @generated
	 */
	EClass getOPMThing();

	/**
	 * Returns the meta object for the reference list '{@link com.vainolo.phd.opm.model.OPMThing#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Links</em>'.
	 * @see com.vainolo.phd.opm.model.OPMThing#getIncomingLinks()
	 * @see #getOPMThing()
	 * @generated
	 */
	EReference getOPMThing_IncomingLinks();

	/**
	 * Returns the meta object for the reference '{@link com.vainolo.phd.opm.model.OPMThing#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing Links</em>'.
	 * @see com.vainolo.phd.opm.model.OPMThing#getOutgoingLinks()
	 * @see #getOPMThing()
	 * @generated
	 */
	EReference getOPMThing_OutgoingLinks();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opm.model.OPMObject <em>OPM Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OPM Object</em>'.
	 * @see com.vainolo.phd.opm.model.OPMObject
	 * @generated
	 */
	EClass getOPMObject();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opm.model.OPMObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.vainolo.phd.opm.model.OPMObject#getName()
	 * @see #getOPMObject()
	 * @generated
	 */
	EAttribute getOPMObject_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.vainolo.phd.opm.model.OPMObject#getOpd <em>Opd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Opd</em>'.
	 * @see com.vainolo.phd.opm.model.OPMObject#getOpd()
	 * @see #getOPMObject()
	 * @generated
	 */
	EReference getOPMObject_Opd();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opm.model.OPMObject#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints</em>'.
	 * @see com.vainolo.phd.opm.model.OPMObject#getConstraints()
	 * @see #getOPMObject()
	 * @generated
	 */
	EAttribute getOPMObject_Constraints();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opm.model.OPMProcess <em>OPM Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OPM Process</em>'.
	 * @see com.vainolo.phd.opm.model.OPMProcess
	 * @generated
	 */
	EClass getOPMProcess();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opm.model.OPMProcess#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.vainolo.phd.opm.model.OPMProcess#getName()
	 * @see #getOPMProcess()
	 * @generated
	 */
	EAttribute getOPMProcess_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.vainolo.phd.opm.model.OPMProcess#getOpd <em>Opd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Opd</em>'.
	 * @see com.vainolo.phd.opm.model.OPMProcess#getOpd()
	 * @see #getOPMProcess()
	 * @generated
	 */
	EReference getOPMProcess_Opd();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opm.model.OPMLink <em>OPM Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OPM Link</em>'.
	 * @see com.vainolo.phd.opm.model.OPMLink
	 * @generated
	 */
	EClass getOPMLink();

	/**
	 * Returns the meta object for the container reference '{@link com.vainolo.phd.opm.model.OPMLink#getOpd <em>Opd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Opd</em>'.
	 * @see com.vainolo.phd.opm.model.OPMLink#getOpd()
	 * @see #getOPMLink()
	 * @generated
	 */
	EReference getOPMLink_Opd();

	/**
	 * Returns the meta object for the reference '{@link com.vainolo.phd.opm.model.OPMLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see com.vainolo.phd.opm.model.OPMLink#getSource()
	 * @see #getOPMLink()
	 * @generated
	 */
	EReference getOPMLink_Source();

	/**
	 * Returns the meta object for the reference '{@link com.vainolo.phd.opm.model.OPMLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.vainolo.phd.opm.model.OPMLink#getTarget()
	 * @see #getOPMLink()
	 * @generated
	 */
	EReference getOPMLink_Target();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rectangle</em>'.
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @model instanceClass="org.eclipse.draw2d.geometry.Rectangle"
	 * @generated
	 */
	EDataType getRectangle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OpmFactory getOpmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opm.model.impl.ObjectProcessDiagramImpl <em>Object Process Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opm.model.impl.ObjectProcessDiagramImpl
		 * @see com.vainolo.phd.opm.model.impl.OpmPackageImpl#getObjectProcessDiagram()
		 * @generated
		 */
		EClass OBJECT_PROCESS_DIAGRAM = eINSTANCE.getObjectProcessDiagram();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROCESS_DIAGRAM__OBJECTS = eINSTANCE.getObjectProcessDiagram_Objects();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROCESS_DIAGRAM__PROCESSES = eINSTANCE.getObjectProcessDiagram_Processes();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROCESS_DIAGRAM__LINKS = eINSTANCE.getObjectProcessDiagram_Links();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opm.model.impl.OPMThingImpl <em>OPM Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opm.model.impl.OPMThingImpl
		 * @see com.vainolo.phd.opm.model.impl.OpmPackageImpl#getOPMThing()
		 * @generated
		 */
		EClass OPM_THING = eINSTANCE.getOPMThing();

		/**
		 * The meta object literal for the '<em><b>Incoming Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPM_THING__INCOMING_LINKS = eINSTANCE.getOPMThing_IncomingLinks();

		/**
		 * The meta object literal for the '<em><b>Outgoing Links</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPM_THING__OUTGOING_LINKS = eINSTANCE.getOPMThing_OutgoingLinks();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opm.model.impl.OPMObjectImpl <em>OPM Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opm.model.impl.OPMObjectImpl
		 * @see com.vainolo.phd.opm.model.impl.OpmPackageImpl#getOPMObject()
		 * @generated
		 */
		EClass OPM_OBJECT = eINSTANCE.getOPMObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPM_OBJECT__NAME = eINSTANCE.getOPMObject_Name();

		/**
		 * The meta object literal for the '<em><b>Opd</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPM_OBJECT__OPD = eINSTANCE.getOPMObject_Opd();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPM_OBJECT__CONSTRAINTS = eINSTANCE.getOPMObject_Constraints();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opm.model.impl.OPMProcessImpl <em>OPM Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opm.model.impl.OPMProcessImpl
		 * @see com.vainolo.phd.opm.model.impl.OpmPackageImpl#getOPMProcess()
		 * @generated
		 */
		EClass OPM_PROCESS = eINSTANCE.getOPMProcess();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPM_PROCESS__NAME = eINSTANCE.getOPMProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Opd</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPM_PROCESS__OPD = eINSTANCE.getOPMProcess_Opd();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opm.model.impl.OPMLinkImpl <em>OPM Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opm.model.impl.OPMLinkImpl
		 * @see com.vainolo.phd.opm.model.impl.OpmPackageImpl#getOPMLink()
		 * @generated
		 */
		EClass OPM_LINK = eINSTANCE.getOPMLink();

		/**
		 * The meta object literal for the '<em><b>Opd</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPM_LINK__OPD = eINSTANCE.getOPMLink_Opd();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPM_LINK__SOURCE = eINSTANCE.getOPMLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPM_LINK__TARGET = eINSTANCE.getOPMLink_Target();

		/**
		 * The meta object literal for the '<em>Rectangle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Rectangle
		 * @see com.vainolo.phd.opm.model.impl.OpmPackageImpl#getRectangle()
		 * @generated
		 */
		EDataType RECTANGLE = eINSTANCE.getRectangle();

	}

} //OpmPackage
