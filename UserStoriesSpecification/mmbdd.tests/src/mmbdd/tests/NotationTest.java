/**
 */
package mmbdd.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mmbdd.MmbddFactory;
import mmbdd.Notation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Notation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotationTest extends TestCase
{

  /**
   * The fixture for this Notation test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Notation fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(NotationTest.class);
  }

  /**
   * Constructs a new Notation test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotationTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Notation test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(Notation fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Notation test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Notation getFixture()
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
    setFixture(MmbddFactory.eINSTANCE.createNotation());
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

} //NotationTest
