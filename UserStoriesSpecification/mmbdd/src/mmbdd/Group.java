/**
 */
package mmbdd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mmbdd.Group#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see mmbdd.MmbddPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends Node
{
  /**
   * Returns the value of the '<em><b>Nodes</b></em>' reference list.
   * The list contents are of type {@link mmbdd.Node}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' reference list.
   * @see mmbdd.MmbddPackage#getGroup_Nodes()
   * @model
   * @generated
   */
  EList<Node> getNodes();

} // Group
