/**
 */
package mindMapDomainModel.impl;

import java.util.Collection;

import mindMapDomainModel.Attribute;
import mindMapDomainModel.Entity;
import mindMapDomainModel.MindMapDomainModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mindMapDomainModel.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link mindMapDomainModel.impl.EntityImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link mindMapDomainModel.impl.EntityImpl#getOclRules <em>Ocl Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends NodeImpl implements Entity
{
  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntities()
   * @generated
   * @ordered
   */
  protected EList<Entity> entities;

  /**
   * The default value of the '{@link #getOclRules() <em>Ocl Rules</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOclRules()
   * @generated
   * @ordered
   */
  protected static final String OCL_RULES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOclRules() <em>Ocl Rules</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOclRules()
   * @generated
   * @ordered
   */
  protected String oclRules = OCL_RULES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityImpl()
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
    return MindMapDomainModelPackage.Literals.ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, MindMapDomainModelPackage.ENTITY__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Entity> getEntities()
  {
    if (entities == null)
    {
      entities = new EObjectContainmentEList<Entity>(Entity.class, this, MindMapDomainModelPackage.ENTITY__ENTITIES);
    }
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOclRules()
  {
    return oclRules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOclRules(String newOclRules)
  {
    String oldOclRules = oclRules;
    oclRules = newOclRules;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MindMapDomainModelPackage.ENTITY__OCL_RULES, oldOclRules, oclRules));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MindMapDomainModelPackage.ENTITY__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case MindMapDomainModelPackage.ENTITY__ENTITIES:
        return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MindMapDomainModelPackage.ENTITY__ATTRIBUTES:
        return getAttributes();
      case MindMapDomainModelPackage.ENTITY__ENTITIES:
        return getEntities();
      case MindMapDomainModelPackage.ENTITY__OCL_RULES:
        return getOclRules();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MindMapDomainModelPackage.ENTITY__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case MindMapDomainModelPackage.ENTITY__ENTITIES:
        getEntities().clear();
        getEntities().addAll((Collection<? extends Entity>)newValue);
        return;
      case MindMapDomainModelPackage.ENTITY__OCL_RULES:
        setOclRules((String)newValue);
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
      case MindMapDomainModelPackage.ENTITY__ATTRIBUTES:
        getAttributes().clear();
        return;
      case MindMapDomainModelPackage.ENTITY__ENTITIES:
        getEntities().clear();
        return;
      case MindMapDomainModelPackage.ENTITY__OCL_RULES:
        setOclRules(OCL_RULES_EDEFAULT);
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
      case MindMapDomainModelPackage.ENTITY__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case MindMapDomainModelPackage.ENTITY__ENTITIES:
        return entities != null && !entities.isEmpty();
      case MindMapDomainModelPackage.ENTITY__OCL_RULES:
        return OCL_RULES_EDEFAULT == null ? oclRules != null : !OCL_RULES_EDEFAULT.equals(oclRules);
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
    result.append(" (oclRules: ");
    result.append(oclRules);
    result.append(')');
    return result.toString();
  }

} //EntityImpl
