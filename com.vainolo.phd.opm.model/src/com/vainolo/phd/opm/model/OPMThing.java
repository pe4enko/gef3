/**
 */
package com.vainolo.phd.opm.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OPM Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vainolo.phd.opm.model.OPMThing#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link com.vainolo.phd.opm.model.OPMThing#getOutgoingLinks <em>Outgoing Links</em>}</li>
 * </ul>
 *
 * @see com.vainolo.phd.opm.model.OpmPackage#getOPMThing()
 * @model
 * @generated
 */
public interface OPMThing extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming Links</b></em>' reference list.
	 * The list contents are of type {@link com.vainolo.phd.opm.model.OPMLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Links</em>' reference list.
	 * @see com.vainolo.phd.opm.model.OpmPackage#getOPMThing_IncomingLinks()
	 * @model
	 * @generated
	 */
	EList<OPMLink> getIncomingLinks();

	/**
	 * Returns the value of the '<em><b>Outgoing Links</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Links</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Links</em>' reference.
	 * @see #setOutgoingLinks(OPMLink)
	 * @see com.vainolo.phd.opm.model.OpmPackage#getOPMThing_OutgoingLinks()
	 * @model
	 * @generated
	 */
	OPMLink getOutgoingLinks();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opm.model.OPMThing#getOutgoingLinks <em>Outgoing Links</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing Links</em>' reference.
	 * @see #getOutgoingLinks()
	 * @generated
	 */
	void setOutgoingLinks(OPMLink value);

} // OPMThing
