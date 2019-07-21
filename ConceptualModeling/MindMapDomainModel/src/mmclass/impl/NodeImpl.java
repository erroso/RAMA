/**
 */
package mmclass.impl;

import mmclass.MmclassPackage;
import mmclass.Node;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mmclass.impl.NodeImpl#getNodeText <em>Node Text</em>}</li>
 *   <li>{@link mmclass.impl.NodeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mmclass.impl.NodeImpl#getCustomIcon <em>Custom Icon</em>}</li>
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
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getCustomIcon() <em>Custom Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomIcon()
   * @generated
   * @ordered
   */
  protected static final String CUSTOM_ICON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCustomIcon() <em>Custom Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomIcon()
   * @generated
   * @ordered
   */
  protected String customIcon = CUSTOM_ICON_EDEFAULT;

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
    return MmclassPackage.Literals.NODE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MmclassPackage.NODE__NODE_TEXT, oldNodeText, nodeText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MmclassPackage.NODE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCustomIcon()
  {
    return customIcon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCustomIcon(String newCustomIcon)
  {
    String oldCustomIcon = customIcon;
    customIcon = newCustomIcon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MmclassPackage.NODE__CUSTOM_ICON, oldCustomIcon, customIcon));
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
      case MmclassPackage.NODE__NODE_TEXT:
        return getNodeText();
      case MmclassPackage.NODE__DESCRIPTION:
        return getDescription();
      case MmclassPackage.NODE__CUSTOM_ICON:
        return getCustomIcon();
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
      case MmclassPackage.NODE__NODE_TEXT:
        setNodeText((String)newValue);
        return;
      case MmclassPackage.NODE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case MmclassPackage.NODE__CUSTOM_ICON:
        setCustomIcon((String)newValue);
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
      case MmclassPackage.NODE__NODE_TEXT:
        setNodeText(NODE_TEXT_EDEFAULT);
        return;
      case MmclassPackage.NODE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case MmclassPackage.NODE__CUSTOM_ICON:
        setCustomIcon(CUSTOM_ICON_EDEFAULT);
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
      case MmclassPackage.NODE__NODE_TEXT:
        return NODE_TEXT_EDEFAULT == null ? nodeText != null : !NODE_TEXT_EDEFAULT.equals(nodeText);
      case MmclassPackage.NODE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case MmclassPackage.NODE__CUSTOM_ICON:
        return CUSTOM_ICON_EDEFAULT == null ? customIcon != null : !CUSTOM_ICON_EDEFAULT.equals(customIcon);
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
    result.append(", description: ");
    result.append(description);
    result.append(", customIcon: ");
    result.append(customIcon);
    result.append(')');
    return result.toString();
  }

} //NodeImpl
