/**
 */
package com.vainolo.phd.opm.model.test;

import com.vainolo.phd.opm.model.OPMObject;
import com.vainolo.phd.opm.model.OpmFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>OPM Object</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OPMObjectTest extends OPMThingTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OPMObjectTest.class);
	}

	/**
	 * Constructs a new OPM Object test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMObjectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this OPM Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OPMObject getFixture() {
		return (OPMObject)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OpmFactory.eINSTANCE.createOPMObject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //OPMObjectTest
