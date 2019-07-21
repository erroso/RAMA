/**
 */
package mindMapDomainModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mindMapDomainModel.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link mindMapDomainModel.Entity#getEntities <em>Entities</em>}</li>
 *   <li>{@link mindMapDomainModel.Entity#getOclRules <em>Ocl Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see mindMapDomainModel.MindMapDomainModelPackage#getEntity()
 * @model annotation="gmf.node label='nodeText' label.placement='internal' resizable='false'"
 * @generated
 */
public interface Entity extends Node
{
  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link mindMapDomainModel.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see mindMapDomainModel.MindMapDomainModelPackage#getEntity_Attributes()
   * @model containment="true" required="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link mindMapDomainModel.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see mindMapDomainModel.MindMapDomainModelPackage#getEntity_Entities()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getEntities();

  /**
   * Returns the value of the '<em><b>Ocl Rules</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ocl Rules</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ocl Rules</em>' attribute.
   * @see #setOclRules(String)
   * @see mindMapDomainModel.MindMapDomainModelPackage#getEntity_OclRules()
   * @model
   * @generated
   */
  String getOclRules();

  /**
   * Sets the value of the '{@link mindMapDomainModel.Entity#getOclRules <em>Ocl Rules</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ocl Rules</em>' attribute.
   * @see #getOclRules()
   * @generated
   */
  void setOclRules(String value);

} // Entity
