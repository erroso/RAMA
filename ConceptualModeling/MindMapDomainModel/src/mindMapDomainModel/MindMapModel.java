/**
 */
package mindMapDomainModel;

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
 *   <li>{@link mindMapDomainModel.MindMapModel#getNodes <em>Nodes</em>}</li>
 *   <li>{@link mindMapDomainModel.MindMapModel#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see mindMapDomainModel.MindMapDomainModelPackage#getMindMapModel()
 * @model annotation="gmf.diagram foo='bar' diagram.extension='ddm' model.extension='mdm'"
 * @generated
 */
public interface MindMapModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
   * The list contents are of type {@link mindMapDomainModel.Node}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' containment reference list.
   * @see mindMapDomainModel.MindMapDomainModelPackage#getMindMapModel_Nodes()
   * @model containment="true"
   * @generated
   */
  EList<Node> getNodes();

  /**
   * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
   * The list contents are of type {@link mindMapDomainModel.Edge}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edges</em>' containment reference list.
   * @see mindMapDomainModel.MindMapDomainModelPackage#getMindMapModel_Edges()
   * @model containment="true"
   * @generated
   */
  EList<Edge> getEdges();

} // MindMapModel
