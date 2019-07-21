/**
 */
package mmbdd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mmbdd.Relationship#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mmbdd.MmbddPackage#getRelationship()
 * @model annotation="gmf.node label='nodeText' label.placement='internal' figure='rectangle'"
 * @generated
 */
public interface Relationship extends Group
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * The literals are from the enumeration {@link mmbdd.NodeTypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see mmbdd.NodeTypes
   * @see #setType(NodeTypes)
   * @see mmbdd.MmbddPackage#getRelationship_Type()
   * @model default="1" required="true"
   * @generated
   */
  NodeTypes getType();

  /**
   * Sets the value of the '{@link mmbdd.Relationship#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see mmbdd.NodeTypes
   * @see #getType()
   * @generated
   */
  void setType(NodeTypes value);

} // Relationship
