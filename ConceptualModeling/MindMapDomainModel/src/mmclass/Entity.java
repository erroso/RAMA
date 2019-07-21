/**
 */
package mmclass;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mmclass.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link mmclass.Entity#getEntities <em>Entities</em>}</li>
 *   <li>{@link mmclass.Entity#getOclRules <em>Ocl Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see mmclass.MmclassPackage#getEntity()
 * @model annotation="gmf.node label='nodeText' label.placement='internal' resizable='false'"
 * @generated
 */
public interface Entity extends Node
{
  /**
   * Returns the value of the '<em><b>Attributes</b></em>' reference list.
   * The list contents are of type {@link mmclass.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' reference list.
   * @see mmclass.MmclassPackage#getEntity_Attributes()
   * @model required="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Entities</b></em>' reference list.
   * The list contents are of type {@link mmclass.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' reference list.
   * @see mmclass.MmclassPackage#getEntity_Entities()
   * @model
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
   * @see mmclass.MmclassPackage#getEntity_OclRules()
   * @model
   * @generated
   */
  String getOclRules();

  /**
   * Sets the value of the '{@link mmclass.Entity#getOclRules <em>Ocl Rules</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ocl Rules</em>' attribute.
   * @see #getOclRules()
   * @generated
   */
  void setOclRules(String value);

} // Entity
