/**
 */
package mmclass.impl;

import mmclass.AssociationEntity;
import mmclass.Attribute;
import mmclass.Constant;
import mmclass.Edge;
import mmclass.Entity;
import mmclass.FloatNode;
import mmclass.MindMapModel;
import mmclass.MmclassFactory;
import mmclass.MmclassPackage;
import mmclass.Node;
import mmclass.RootNode;

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
public class MmclassFactoryImpl extends EFactoryImpl implements MmclassFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MmclassFactory init()
  {
    try
    {
      MmclassFactory theMmclassFactory = (MmclassFactory)EPackage.Registry.INSTANCE.getEFactory(MmclassPackage.eNS_URI);
      if (theMmclassFactory != null)
      {
        return theMmclassFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MmclassFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MmclassFactoryImpl()
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
      case MmclassPackage.MIND_MAP_MODEL: return createMindMapModel();
      case MmclassPackage.EDGE: return createEdge();
      case MmclassPackage.NODE: return createNode();
      case MmclassPackage.ATTRIBUTE: return createAttribute();
      case MmclassPackage.ROOT_NODE: return createRootNode();
      case MmclassPackage.FLOAT_NODE: return createFloatNode();
      case MmclassPackage.ENUM: return createEnum();
      case MmclassPackage.CONSTANT: return createConstant();
      case MmclassPackage.ENTITY: return createEntity();
      case MmclassPackage.ASSOCIATION_ENTITY: return createAssociationEntity();
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
  public mmclass.Enum createEnum()
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
  public MmclassPackage getMmclassPackage()
  {
    return (MmclassPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MmclassPackage getPackage()
  {
    return MmclassPackage.eINSTANCE;
  }

} //MmclassFactoryImpl
