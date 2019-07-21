/**
 */
package mmbdd.impl;

import mmbdd.MmbddPackage;
import mmbdd.Node;
import mmbdd.Notation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mmbdd.impl.NodeImpl#getNodeText <em>Node Text</em>}</li>
 *   <li>{@link mmbdd.impl.NodeImpl#getNotation <em>Notation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends EObjectImpl implements Node
{
  /**
   * The default value of the '{@link #getNodeText() <em>Node Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeText()
   * @generated
   * @ordered
   */
  protected static final String NODE_TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNodeText() <em>Node Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeText()
   * @generated
   * @ordered
   */
  protected String nodeText = NODE_TEXT_EDEFAULT;

  /**
   * The cached value of the '{@link #getNotation() <em>Notation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotation()
   * @generated
   * @ordered
   */
  protected Notation notation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MmbddPackage.Literals.NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNodeText()
  {
    return nodeText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNodeText(String newNodeText)
  {
    String oldNodeText = nodeText;
    nodeText = newNodeText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MmbddPackage.NODE__NODE_TEXT, oldNodeText, nodeText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Notation getNotation()
  {
    if (notation != null && notation.eIsProxy())
    {
      InternalEObject oldNotation = (InternalEObject)notation;
      notation = (Notation)eResolveProxy(oldNotation);
      if (notation != oldNotation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MmbddPackage.NODE__NOTATION, oldNotation, notation));
      }
    }
    return notation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Notation basicGetNotation()
  {
    return notation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNotation(Notation newNotation)
  {
    Notation oldNotation = notation;
    notation = newNotation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MmbddPackage.NODE__NOTATION, oldNotation, notation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MmbddPackage.NODE__NODE_TEXT:
        return getNodeText();
      case MmbddPackage.NODE__NOTATION:
        if (resolve) return getNotation();
        return basicGetNotation();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MmbddPackage.NODE__NODE_TEXT:
        setNodeText((String)newValue);
        return;
      case MmbddPackage.NODE__NOTATION:
        setNotation((Notation)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MmbddPackage.NODE__NODE_TEXT:
        setNodeText(NODE_TEXT_EDEFAULT);
        return;
      case MmbddPackage.NODE__NOTATION:
        setNotation((Notation)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MmbddPackage.NODE__NODE_TEXT:
        return NODE_TEXT_EDEFAULT == null ? nodeText != null : !NODE_TEXT_EDEFAULT.equals(nodeText);
      case MmbddPackage.NODE__NOTATION:
        return notation != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (nodeText: ");
    result.append(nodeText);
    result.append(')');
    return result.toString();
  }

} //NodeImpl
