/**
 */
package com.vainolo.phd.opm.model;

import org.eclipse.draw2d.geometry.Rectangle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OPM Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vainolo.phd.opm.model.OPMObject#getName <em>Name</em>}</li>
 *   <li>{@link com.vainolo.phd.opm.model.OPMObject#getOpd <em>Opd</em>}</li>
 *   <li>{@link com.vainolo.phd.opm.model.OPMObject#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see com.vainolo.phd.opm.model.OpmPackage#getOPMObject()
 * @model
 * @generated
 */
public interface OPMObject extends OPMThing {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.vainolo.phd.opm.model.OpmPackage#getOPMObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opm.model.OPMObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Opd</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.vainolo.phd.opm.model.ObjectProcessDiagram#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opd</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opd</em>' container reference.
	 * @see #setOpd(ObjectProcessDiagram)
	 * @see com.vainolo.phd.opm.model.OpmPackage#getOPMObject_Opd()
	 * @see com.vainolo.phd.opm.model.ObjectProcessDiagram#getObjects
	 * @model opposite="objects" transient="false"
	 * @generated
	 */
	ObjectProcessDiagram getOpd();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opm.model.OPMObject#getOpd <em>Opd</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opd</em>' container reference.
	 * @see #getOpd()
	 * @generated
	 */
	void setOpd(ObjectProcessDiagram value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute.
	 * @see #setConstraints(Rectangle)
	 * @see com.vainolo.phd.opm.model.OpmPackage#getOPMObject_Constraints()
	 * @model dataType="com.vainolo.phd.opm.model.Rectangle"
	 * @generated
	 */
	Rectangle getConstraints();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opm.model.OPMObject#getConstraints <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' attribute.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(Rectangle value);

} // OPMObject
