/**
 */
package mmbdd.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mmbdd.MindMapModel;
import mmbdd.MmbddFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mind Map Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MindMapModelTest extends TestCase
{

  /**
   * The fixture for this Mind Map Model test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MindMapModel fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(MindMapModelTest.class);
  }

  /**
   * Constructs a new Mind Map Model test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MindMapModelTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Mind Map Model test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(MindMapModel fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Mind Map Model test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MindMapModel getFixture()
  {
    return fixture;
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
    setFixture(MmbddFactory.eINSTANCE.createMindMapModel());
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

} //MindMapModelTest
