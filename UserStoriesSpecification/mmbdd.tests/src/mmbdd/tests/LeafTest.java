/**
 */
package mmbdd.tests;

import junit.textui.TestRunner;

import mmbdd.Leaf;
import mmbdd.MmbddFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Leaf</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LeafTest extends NodeTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(LeafTest.class);
  }

  /**
   * Constructs a new Leaf test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeafTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Leaf test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Leaf getFixture()
  {
    return (Leaf)fixture;
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
    setFixture(MmbddFactory.eINSTANCE.createLeaf());
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

} //LeafTest
