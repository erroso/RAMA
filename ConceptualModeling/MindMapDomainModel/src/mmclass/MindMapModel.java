/**
 */
package mmclass;

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
 *   <li>{@link mmclass.MindMapModel#getNodes <em>Nodes</em>}</li>
 *   <li>{@link mmclass.MindMapModel#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see mmclass.MmclassPackage#getMindMapModel()
 * @model annotation="gmf.diagram foo='bar' diagram.extension='ddm' model.extension='mdm'"
 * @generated
 */
public interface MindMapModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
   * The list contents are of type {@link mmclass.Node}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' containment reference list.
   * @see mmclass.MmclassPackage#getMindMapModel_Nodes()
   * @model containment="true"
   * @generated
   */
  EList<Node> getNodes();

  /**
   * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
   * The list contents are of type {@link mmclass.Edge}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edges</em>' containment reference list.
   * @see mmclass.MmclassPackage#getMindMapModel_Edges()
   * @model containment="true"
   * @generated
   */
  EList<Edge> getEdges();

} // MindMapModel
