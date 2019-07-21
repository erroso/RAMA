/**
 */
package mindMapDomainModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mindMapDomainModel.Edge#getSource <em>Source</em>}</li>
 *   <li>{@link mindMapDomainModel.Edge#getTarget <em>Target</em>}</li>
 *   <li>{@link mindMapDomainModel.Edge#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see mindMapDomainModel.MindMapDomainModelPackage#getEdge()
 * @model annotation="gmf.link label='name' source='source' target='target' color='128,128,128' width='1' label.placement='external'"
 * @generated
 */
public interface Edge extends EObject
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(Node)
   * @see mindMapDomainModel.MindMapDomainModelPackage#getEdge_Source()
   * @model required="true"
   * @generated
   */
  Node getSource();

  /**
   * Sets the value of the '{@link mindMapDomainModel.Edge#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Node value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Node)
   * @see mindMapDomainModel.MindMapDomainModelPackage#getEdge_Target()
   * @model required="true"
   * @generated
   */
  Node getTarget();

  /**
   * Sets the value of the '{@link mindMapDomainModel.Edge#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Node value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see mindMapDomainModel.MindMapDomainModelPackage#getEdge_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link mindMapDomainModel.Edge#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Edge
