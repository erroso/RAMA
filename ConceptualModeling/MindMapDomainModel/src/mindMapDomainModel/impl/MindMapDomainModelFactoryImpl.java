/**
 */
package mindMapDomainModel.impl;

import mindMapDomainModel.AssociationEntity;
import mindMapDomainModel.Attribute;
import mindMapDomainModel.Constant;
import mindMapDomainModel.Edge;
import mindMapDomainModel.Entity;
import mindMapDomainModel.FloatNode;
import mindMapDomainModel.MindMapDomainModelFactory;
import mindMapDomainModel.MindMapDomainModelPackage;
import mindMapDomainModel.MindMapModel;
import mindMapDomainModel.Node;
import mindMapDomainModel.RootNode;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MindMapDomainModelFactoryImpl extends EFactoryImpl implements MindMapDomainModelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MindMapDomainModelFactory init()
  {
    try
    {
      MindMapDomainModelFactory theMindMapDomainModelFactory = (MindMapDomainModelFactory)EPackage.Registry.INSTANCE.getEFactory(MindMapDomainModelPackage.eNS_URI);
      if (theMindMapDomainModelFactory != null)
      {
        return theMindMapDomainModelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MindMapDomainModelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MindMapDomainModelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MindMapDomainModelPackage.MIND_MAP_MODEL: return createMindMapModel();
      case MindMapDomainModelPackage.EDGE: return createEdge();
      case MindMapDomainModelPackage.NODE: return createNode();
      case MindMapDomainModelPackage.ATTRIBUTE: return createAttribute();
      case MindMapDomainModelPackage.ROOT_NODE: return createRootNode();
      case MindMapDomainModelPackage.FLOAT_NODE: return createFloatNode();
      case MindMapDomainModelPackage.ENUM: return createEnum();
      case MindMapDomainModelPackage.CONSTANT: return createConstant();
      case MindMapDomainModelPackage.ENTITY: return createEntity();
      case MindMapDomainModelPackage.ASSOCIATION_ENTITY: return createAssociationEntity();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MindMapModel createMindMapModel()
  {
    MindMapModelImpl mindMapModel = new MindMapModelImpl();
    return mindMapModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Edge createEdge()
  {
    EdgeImpl edge = new EdgeImpl();
    return edge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RootNode createRootNode()
  {
    RootNodeImpl rootNode = new RootNodeImpl();
    return rootNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatNode createFloatNode()
  {
    FloatNodeImpl floatNode = new FloatNodeImpl();
    return floatNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public mindMapDomainModel.Enum createEnum()
  {
    EnumImpl enum_ = new EnumImpl();
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssociationEntity createAssociationEntity()
  {
    AssociationEntityImpl associationEntity = new AssociationEntityImpl();
    return associationEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MindMapDomainModelPackage getMindMapDomainModelPackage()
  {
    return (MindMapDomainModelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MindMapDomainModelPackage getPackage()
  {
    return MindMapDomainModelPackage.eINSTANCE;
  }

} //MindMapDomainModelFactoryImpl
