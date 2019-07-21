/**
 */
package mindMapDomainModel.impl;

import java.util.Collection;

import mindMapDomainModel.AssociationEntity;
import mindMapDomainModel.Entity;
import mindMapDomainModel.MindMapDomainModelPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mindMapDomainModel.impl.AssociationEntityImpl#getAssociations <em>Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationEntityImpl extends EntityImpl implements AssociationEntity
{
  /**
   * The cached value of the '{@link #getAssociations() <em>Associations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssociations()
   * @generated
   * @ordered
   */
  protected EList<Entity> associations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssociationEntityImpl()
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
    return MindMapDomainModelPackage.Literals.ASSOCIATION_ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Entity> getAssociations()
  {
    if (associations == null)
    {
      associations = new EObjectContainmentEList<Entity>(Entity.class, this, MindMapDomainModelPackage.ASSOCIATION_ENTITY__ASSOCIATIONS);
    }
    return associations;
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
      case MindMapDomainModelPackage.ASSOCIATION_ENTITY__ASSOCIATIONS:
        return ((InternalEList<?>)getAssociations()).basicRemove(otherEnd, msgs);
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
      case MindMapDomainModelPackage.ASSOCIATION_ENTITY__ASSOCIATIONS:
        return getAssociations();
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
      case MindMapDomainModelPackage.ASSOCIATION_ENTITY__ASSOCIATIONS:
        getAssociations().clear();
        getAssociations().addAll((Collection<? extends Entity>)newValue);
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
      case MindMapDomainModelPackage.ASSOCIATION_ENTITY__ASSOCIATIONS:
        getAssociations().clear();
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
      case MindMapDomainModelPackage.ASSOCIATION_ENTITY__ASSOCIATIONS:
        return associations != null && !associations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AssociationEntityImpl
