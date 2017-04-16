/**
 */
package com.vainolo.phd.opm.model.impl;

import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMThing;
import com.vainolo.phd.opm.model.OpmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OPM Thing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.vainolo.phd.opm.model.impl.OPMThingImpl#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link com.vainolo.phd.opm.model.impl.OPMThingImpl#getOutgoingLinks <em>Outgoing Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OPMThingImpl extends MinimalEObjectImpl.Container implements OPMThing {
	/**
	 * The cached value of the '{@link #getIncomingLinks() <em>Incoming Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<OPMLink> incomingLinks;

	/**
	 * The cached value of the '{@link #getOutgoingLinks() <em>Outgoing Links</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingLinks()
	 * @generated
	 * @ordered
	 */
	protected OPMLink outgoingLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OPMThingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpmPackage.Literals.OPM_THING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OPMLink> getIncomingLinks() {
		if (incomingLinks == null) {
			incomingLinks = new EObjectResolvingEList<OPMLink>(OPMLink.class, this, OpmPackage.OPM_THING__INCOMING_LINKS);
		}
		return incomingLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMLink getOutgoingLinks() {
		if (outgoingLinks != null && outgoingLinks.eIsProxy()) {
			InternalEObject oldOutgoingLinks = (InternalEObject)outgoingLinks;
			outgoingLinks = (OPMLink)eResolveProxy(oldOutgoingLinks);
			if (outgoingLinks != oldOutgoingLinks) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpmPackage.OPM_THING__OUTGOING_LINKS, oldOutgoingLinks, outgoingLinks));
			}
		}
		return outgoingLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMLink basicGetOutgoingLinks() {
		return outgoingLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoingLinks(OPMLink newOutgoingLinks) {
		OPMLink oldOutgoingLinks = outgoingLinks;
		outgoingLinks = newOutgoingLinks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpmPackage.OPM_THING__OUTGOING_LINKS, oldOutgoingLinks, outgoingLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpmPackage.OPM_THING__INCOMING_LINKS:
				return getIncomingLinks();
			case OpmPackage.OPM_THING__OUTGOING_LINKS:
				if (resolve) return getOutgoingLinks();
				return basicGetOutgoingLinks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpmPackage.OPM_THING__INCOMING_LINKS:
				getIncomingLinks().clear();
				getIncomingLinks().addAll((Collection<? extends OPMLink>)newValue);
				return;
			case OpmPackage.OPM_THING__OUTGOING_LINKS:
				setOutgoingLinks((OPMLink)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OpmPackage.OPM_THING__INCOMING_LINKS:
				getIncomingLinks().clear();
				return;
			case OpmPackage.OPM_THING__OUTGOING_LINKS:
				setOutgoingLinks((OPMLink)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OpmPackage.OPM_THING__INCOMING_LINKS:
				return incomingLinks != null && !incomingLinks.isEmpty();
			case OpmPackage.OPM_THING__OUTGOING_LINKS:
				return outgoingLinks != null;
		}
		return super.eIsSet(featureID);
	}

} //OPMThingImpl
