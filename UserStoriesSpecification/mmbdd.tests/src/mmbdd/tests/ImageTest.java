/**
 */
package mmbdd.tests;

import junit.textui.TestRunner;

import mmbdd.Image;
import mmbdd.MmbddFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImageTest extends NotationTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(ImageTest.class);
  }

  /**
   * Constructs a new Image test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImageTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Image test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Image getFixture()
  {
    return (Image)fixture;
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
    setFixture(MmbddFactory.eINSTANCE.createImage());
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

} //ImageTest
