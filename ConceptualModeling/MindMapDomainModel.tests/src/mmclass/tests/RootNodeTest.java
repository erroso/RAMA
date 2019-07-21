/**
 */
package mmclass.tests;

import junit.textui.TestRunner;

import mmclass.MmclassFactory;
import mmclass.RootNode;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Root Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RootNodeTest extends NodeTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(RootNodeTest.class);
  }

  /**
   * Constructs a new Root Node test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RootNodeTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Root Node test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected RootNode getFixture()
  {
    return (RootNode)fixture;
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
    setFixture(MmclassFactory.eINSTANCE.createRootNode());
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

} //RootNodeTest
