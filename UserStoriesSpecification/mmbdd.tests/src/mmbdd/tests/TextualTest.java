/**
 */
package mmbdd.tests;

import junit.textui.TestRunner;

import mmbdd.MmbddFactory;
import mmbdd.Textual;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Textual</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextualTest extends NotationTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(TextualTest.class);
  }

  /**
   * Constructs a new Textual test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextualTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Textual test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Textual getFixture()
  {
    return (Textual)fixture;
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
    setFixture(MmbddFactory.eINSTANCE.createTextual());
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

} //TextualTest
