/**
 */
package mmbdd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mmbdd.Edge#getSource <em>Source</em>}</li>
 *   <li>{@link mmbdd.Edge#getTarget <em>Target</em>}</li>
 *   <li>{@link mmbdd.Edge#getLogic <em>Logic</em>}</li>
 * </ul>
 * </p>
 *
 * @see mmbdd.MmbddPackage#getEdge()
 * @model annotation="gmf.link source='source' target='target' color='0,0,0' width='2' label.placement='external' target.decoration='none'"
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
   * @see mmbdd.MmbddPackage#getEdge_Source()
   * @model required="true"
   * @generated
   */
  Node getSource();

  /**
   * Sets the value of the '{@link mmbdd.Edge#getSource <em>Source</em>}' reference.
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
   * @see mmbdd.MmbddPackage#getEdge_Target()
   * @model required="true"
   * @generated
   */
  Node getTarget();

  /**
   * Sets the value of the '{@link mmbdd.Edge#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Node value);

  /**
   * Returns the value of the '<em><b>Logic</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * The literals are from the enumeration {@link mmbdd.EgdeLogicTypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logic</em>' attribute.
   * @see mmbdd.EgdeLogicTypes
   * @see #setLogic(EgdeLogicTypes)
   * @see mmbdd.MmbddPackage#getEdge_Logic()
   * @model default="0" required="true"
   * @generated
   */
  EgdeLogicTypes getLogic();

  /**
   * Sets the value of the '{@link mmbdd.Edge#getLogic <em>Logic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Logic</em>' attribute.
   * @see mmbdd.EgdeLogicTypes
   * @see #getLogic()
   * @generated
   */
  void setLogic(EgdeLogicTypes value);

} // Edge
