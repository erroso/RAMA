/**
 */
package mmclass.tests;

import junit.textui.TestRunner;

import mmclass.AssociationEntity;
import mmclass.MmclassFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Association Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssociationEntityTest extends EntityTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(AssociationEntityTest.class);
  }

  /**
   * Constructs a new Association Entity test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssociationEntityTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Association Entity test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected AssociationEntity getFixture()
  {
    return (AssociationEntity)fixture;
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
    setFixture(MmclassFactory.eINSTANCE.createAssociationEntity());
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

} //AssociationEntityTest
