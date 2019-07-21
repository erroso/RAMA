/**
 */
package mmbdd.tests;

import junit.textui.TestRunner;

import mmbdd.Center;
import mmbdd.MmbddFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Center</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CenterTest extends GroupTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(CenterTest.class);
  }

  /**
   * Constructs a new Center test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CenterTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Center test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Center getFixture()
  {
    return (Center)fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception
  {
    setFixture(MmbddFactory.eINSTANCE.createCenter());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#tearDown()
   * @generated
   */
  @Override
  protected void tearDown() throws Exception
  {
    setFixture(null);
  }

} //CenterTest
