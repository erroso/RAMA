/**
 */
package mindMapDomainModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mindMapDomainModel.Node#getNodeText <em>Node Text</em>}</li>
 *   <li>{@link mindMapDomainModel.Node#getDescription <em>Description</em>}</li>
 *   <li>{@link mindMapDomainModel.Node#getCustomIcon <em>Custom Icon</em>}</li>
 * </ul>
 * </p>
 *
 * @see mindMapDomainModel.MindMapDomainModelPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject
{
  /**
   * Returns the value of the '<em><b>Node Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Text</em>' attribute.
   * @see #setNodeText(String)
   * @see mindMapDomainModel.MindMapDomainModelPackage#getNode_NodeText()
   * @model
   * @generated
   */
  String getNodeText();

  /**
   * Sets the value of the '{@link mindMapDomainModel.Node#getNodeText <em>Node Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node Text</em>' attribute.
   * @see #getNodeText()
   * @generated
   */
  void setNodeText(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see mindMapDomainModel.MindMapDomainModelPackage#getNode_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link mindMapDomainModel.Node#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Custom Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Custom Icon</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom Icon</em>' attribute.
   * @see #setCustomIcon(String)
   * @see mindMapDomainModel.MindMapDomainModelPackage#getNode_CustomIcon()
   * @model
   * @generated
   */
  String getCustomIcon();

  /**
   * Sets the value of the '{@link mindMapDomainModel.Node#getCustomIcon <em>Custom Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Custom Icon</em>' attribute.
   * @see #getCustomIcon()
   * @generated
   */
  void setCustomIcon(String value);

} // Node
