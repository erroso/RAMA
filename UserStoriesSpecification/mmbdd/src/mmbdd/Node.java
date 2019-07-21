/**
 */
package mmbdd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mmbdd.Node#getNodeText <em>Node Text</em>}</li>
 *   <li>{@link mmbdd.Node#getNotation <em>Notation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mmbdd.MmbddPackage#getNode()
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
   * @see mmbdd.MmbddPackage#getNode_NodeText()
   * @model id="true"
   * @generated
   */
  String getNodeText();

  /**
   * Sets the value of the '{@link mmbdd.Node#getNodeText <em>Node Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node Text</em>' attribute.
   * @see #getNodeText()
   * @generated
   */
  void setNodeText(String value);

  /**
   * Returns the value of the '<em><b>Notation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Notation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Notation</em>' reference.
   * @see #setNotation(Notation)
   * @see mmbdd.MmbddPackage#getNode_Notation()
   * @model required="true"
   * @generated
   */
  Notation getNotation();

  /**
   * Sets the value of the '{@link mmbdd.Node#getNotation <em>Notation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Notation</em>' reference.
   * @see #getNotation()
   * @generated
   */
  void setNotation(Notation value);

} // Node
