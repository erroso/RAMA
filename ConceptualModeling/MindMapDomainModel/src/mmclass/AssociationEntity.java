/**
 */
package mmclass;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mmclass.AssociationEntity#getAssociations <em>Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @see mmclass.MmclassPackage#getAssociationEntity()
 * @model annotation="gmf.node label='nodeText' label.placement='internal' resizable='false'"
 * @generated
 */
public interface AssociationEntity extends Entity
{
  /**
   * Returns the value of the '<em><b>Associations</b></em>' containment reference list.
   * The list contents are of type {@link mmclass.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Associations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Associations</em>' containment reference list.
   * @see mmclass.MmclassPackage#getAssociationEntity_Associations()
   * @model containment="true" lower="2" upper="2"
   *        annotation="gmf.compartment layout='list' collapsible='true'"
   * @generated
   */
  EList<Entity> getAssociations();

} // AssociationEntity
