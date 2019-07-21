/**
 */
package mmclass.tests;

import junit.textui.TestRunner;

import mmclass.FloatNode;
import mmclass.MmclassFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Float Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FloatNodeTest extends NodeTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(FloatNodeTest.class);
  }

  /**
   * Constructs a new Float Node test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatNodeTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Float Node test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected FloatNode getFixture()
  {
    return (FloatNode)fixture;
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
    setFixture(MmclassFactory.eINSTANCE.createFloatNode());
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

} //FloatNodeTest
