/**
 */
package mmclass;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mmclass.Enum#getConstants <em>Constants</em>}</li>
 * </ul>
 * </p>
 *
 * @see mmclass.MmclassPackage#getEnum()
 * @model annotation="gmf.node label='nodeText' label.placement='internal' resizable='false'"
 * @generated
 */
public interface Enum extends FloatNode
{
  /**
   * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
   * The list contents are of type {@link mmclass.Constant}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constants</em>' containment reference list.
   * @see mmclass.MmclassPackage#getEnum_Constants()
   * @model containment="true"
   * @generated
   */
  EList<Constant> getConstants();

} // Enum
