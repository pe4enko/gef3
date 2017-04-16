/**
 */
package com.vainolo.phd.opm.model.impl;

import com.vainolo.phd.opm.model.*;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class OpmFactoryImpl extends EFactoryImpl implements OpmFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static OpmFactory init() {
		try {
			OpmFactory theOpmFactory = (OpmFactory) EPackage.Registry.INSTANCE.getEFactory(OpmPackage.eNS_URI);
			if (theOpmFactory != null) {
				return theOpmFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OpmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public OpmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case OpmPackage.OBJECT_PROCESS_DIAGRAM:
			return createObjectProcessDiagram();
		case OpmPackage.OPM_THING:
			return createOPMThing();
		case OpmPackage.OPM_OBJECT:
			return createOPMObject();
		case OpmPackage.OPM_PROCESS:
			return createOPMProcess();
		case OpmPackage.OPM_LINK:
			return createOPMLink();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case OpmPackage.RECTANGLE:
			return createRectangleFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case OpmPackage.RECTANGLE:
			return convertRectangleToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ObjectProcessDiagram createObjectProcessDiagram() {
		ObjectProcessDiagramImpl objectProcessDiagram = new ObjectProcessDiagramImpl();
		return objectProcessDiagram;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OPMThing createOPMThing() {
		OPMThingImpl opmThing = new OPMThingImpl();
		return opmThing;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OPMObject createOPMObject() {
		OPMObjectImpl opmObject = new OPMObjectImpl();
		return opmObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OPMProcess createOPMProcess() {
		OPMProcessImpl opmProcess = new OPMProcessImpl();
		return opmProcess;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OPMLink createOPMLink() {
		OPMLinkImpl opmLink = new OPMLinkImpl();
		return opmLink;
	}

	/**
	 * <!-- begin-user-doc --> Create a <code>Rectangle</code> instance from a
	 * <code>String</code>. The expected representation is "x,y,width,height".
	 * Illegal representations will return a null value. <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Rectangle createRectangleFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) {
			return null;
		}
		initialValue.replaceAll("\\s", "");
		String[] values = initialValue.split(",");
		if (values.length != 4) {
			return null;
		}

		Rectangle rect = new Rectangle();
		try {
			rect.setLocation(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
			rect.setSize(Integer.parseInt(values[2]), Integer.parseInt(values[3]));
		} catch (NumberFormatException e) {
			EcorePlugin.INSTANCE.log(e);
			rect = null;
		}
		return rect;
	}

	/**
	 * <!-- begin-user-doc --> Convert a <code>Rectangle</code> to a
	 * <code>String</code> representation. The <code>Rectangle</code> is
	 * represented as "x,y,width,heigth". <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String convertRectangleToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) {
			return null;
		}
		Rectangle rect = (Rectangle) instanceValue;
		return rect.x + "," + rect.y + "," + rect.width + "," + rect.height;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OpmPackage getOpmPackage() {
		return (OpmPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OpmPackage getPackage() {
		return OpmPackage.eINSTANCE;
	}

} // OpmFactoryImpl
