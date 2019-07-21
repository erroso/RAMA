/**
 */
package mmbdd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mind Map Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mmbdd.MindMapModel#getNodes <em>Nodes</em>}</li>
 *   <li>{@link mmbdd.MindMapModel#getEdges <em>Edges</em>}</li>
 *   <li>{@link mmbdd.MindMapModel#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see mmbdd.MmbddPackage#getMindMapModel()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface MindMapModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
   * The list contents are of type {@link mmbdd.Node}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' containment reference list.
   * @see mmbdd.MmbddPackage#getMindMapModel_Nodes()
   * @model containment="true"
   * @generated
   */
  EList<Node> getNodes();

  /**
   * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
   * The list contents are of type {@link mmbdd.Edge}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edges</em>' containment reference list.
   * @see mmbdd.MmbddPackage#getMindMapModel_Edges()
   * @model containment="true"
   * @generated
   */
  EList<Edge> getEdges();

  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference list.
   * The list contents are of type {@link mmbdd.Content}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference list.
   * @see mmbdd.MmbddPackage#getMindMapModel_Content()
   * @model containment="true" required="true"
   * @generated
   */
  EList<Content> getContent();
  
  
} // MindMapModel
