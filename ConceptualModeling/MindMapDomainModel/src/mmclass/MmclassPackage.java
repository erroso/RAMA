/**
 */
package mmclass;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mmclass.MmclassFactory
 * @model kind="package"
 * @generated
 */
public interface MmclassPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mmclass";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "MindMapDomainModel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "MindMapDomainModel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MmclassPackage eINSTANCE = mmclass.impl.MmclassPackageImpl.init();

  /**
   * The meta object id for the '{@link mmclass.impl.MindMapModelImpl <em>Mind Map Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mmclass.impl.MindMapModelImpl
   * @see mmclass.impl.MmclassPackageImpl#getMindMapModel()
   * @generated
   */
  int MIND_MAP_MODEL = 0;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIND_MAP_MODEL__NODES = 0;

  /**
   * The feature id for the '<em><b>Edges</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIND_MAP_MODEL__EDGES = 1;

  /**
   * The number of structural features of the '<em>Mind Map Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIND_MAP_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link mmclass.impl.EdgeImpl <em>Edge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mmclass.impl.EdgeImpl
   * @see mmclass.impl.MmclassPackageImpl#getEdge()
   * @generated
   */
  int EDGE = 1;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE__TARGET = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE__NAME = 2;

  /**
   * The number of structural features of the '<em>Edge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link mmclass.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mmclass.impl.NodeImpl
   * @see mmclass.impl.MmclassPackageImpl#getNode()
   * @generated
   */
  int NODE = 2;

  /**
   * The feature id for the '<em><b>Node Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NODE_TEXT = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Custom Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__CUSTOM_ICON = 2;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link mmclass.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mmclass.impl.AttributeImpl
   * @see mmclass.impl.MmclassPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 3;

  /**
   * The feature id for the '<em><b>Node Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NODE_TEXT = NODE__NODE_TEXT;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DESCRIPTION = NODE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Custom Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__CUSTOM_ICON = NODE__CUSTOM_ICON;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link mmclass.impl.RootNodeImpl <em>Root Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mmclass.impl.RootNodeImpl
   * @see mmclass.impl.MmclassPackageImpl#getRootNode()
   * @generated
   */
  int ROOT_NODE = 4;

  /**
   * The feature id for the '<em><b>Node Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_NODE__NODE_TEXT = NODE__NODE_TEXT;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_NODE__DESCRIPTION = NODE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Custom Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_NODE__CUSTOM_ICON = NODE__CUSTOM_ICON;

  /**
   * The number of structural features of the '<em>Root Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link mmclass.impl.FloatNodeImpl <em>Float Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mmclass.impl.FloatNodeImpl
   * @see mmclass.impl.MmclassPackageImpl#getFloatNode()
   * @generated
   */
  int FLOAT_NODE = 5;

  /**
   * The feature id for the '<em><b>Node Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_NODE__NODE_TEXT = NODE__NODE_TEXT;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_NODE__DESCRIPTION = NODE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Custom Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_NODE__CUSTOM_ICON = NODE__CUSTOM_ICON;

  /**
   * The number of structural features of the '<em>Float Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link mmclass.impl.EnumImpl <em>Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mmclass.impl.EnumImpl
   * @see mmclass.impl.MmclassPackageImpl#getEnum()
   * @generated
   */
  int ENUM = 6;

  /**
   * The feature id for the '<em><b>Node Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__NODE_TEXT = FLOAT_NODE__NODE_TEXT;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__DESCRIPTION = FLOAT_NODE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Custom Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__CUSTOM_ICON = FLOAT_NODE__CUSTOM_ICON;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__CONSTANTS = FLOAT_NODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FEATURE_COUNT = FLOAT_NODE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link mmclass.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mmclass.impl.ConstantImpl
   * @see mmclass.impl.MmclassPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 7;

  /**
   * The feature id for the '<em><b>Node Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NODE_TEXT = NODE__NODE_TEXT;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__DESCRIPTION = NODE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Custom Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__CUSTOM_ICON = NODE__CUSTOM_ICON;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link mmclass.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mmclass.impl.EntityImpl
   * @see mmclass.impl.MmclassPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 8;

  /**
   * The feature id for the '<em><b>Node Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NODE_TEXT = NODE__NODE_TEXT;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__DESCRIPTION = NODE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Custom Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__CUSTOM_ICON = NODE__CUSTOM_ICON;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ATTRIBUTES = NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Entities</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ENTITIES = NODE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ocl Rules</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__OCL_RULES = NODE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link mmclass.impl.AssociationEntityImpl <em>Association Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mmclass.impl.AssociationEntityImpl
   * @see mmclass.impl.MmclassPackageImpl#getAssociationEntity()
   * @generated
   */
  int ASSOCIATION_ENTITY = 9;

  /**
   * The feature id for the '<em><b>Node Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_ENTITY__NODE_TEXT = ENTITY__NODE_TEXT;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_ENTITY__DESCRIPTION = ENTITY__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Custom Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_ENTITY__CUSTOM_ICON = ENTITY__CUSTOM_ICON;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_ENTITY__ATTRIBUTES = ENTITY__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Entities</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_ENTITY__ENTITIES = ENTITY__ENTITIES;

  /**
   * The feature id for the '<em><b>Ocl Rules</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_ENTITY__OCL_RULES = ENTITY__OCL_RULES;

  /**
   * The feature id for the '<em><b>Associations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_ENTITY__ASSOCIATIONS = ENTITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Association Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link mmclass.MindMapModel <em>Mind Map Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mind Map Model</em>'.
   * @see mmclass.MindMapModel
   * @generated
   */
  EClass getMindMapModel();

  /**
   * Returns the meta object for the containment reference list '{@link mmclass.MindMapModel#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see mmclass.MindMapModel#getNodes()
   * @see #getMindMapModel()
   * @generated
   */
  EReference getMindMapModel_Nodes();

  /**
   * Returns the meta object for the containment reference list '{@link mmclass.MindMapModel#getEdges <em>Edges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edges</em>'.
   * @see mmclass.MindMapModel#getEdges()
   * @see #getMindMapModel()
   * @generated
   */
  EReference getMindMapModel_Edges();

  /**
   * Returns the meta object for class '{@link mmclass.Edge <em>Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edge</em>'.
   * @see mmclass.Edge
   * @generated
   */
  EClass getEdge();

  /**
   * Returns the meta object for the reference '{@link mmclass.Edge#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see mmclass.Edge#getSource()
   * @see #getEdge()
   * @generated
   */
  EReference getEdge_Source();

  /**
   * Returns the meta object for the reference '{@link mmclass.Edge#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see mmclass.Edge#getTarget()
   * @see #getEdge()
   * @generated
   */
  EReference getEdge_Target();

  /**
   * Returns the meta object for the attribute '{@link mmclass.Edge#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see mmclass.Edge#getName()
   * @see #getEdge()
   * @generated
   */
  EAttribute getEdge_Name();

  /**
   * Returns the meta object for class '{@link mmclass.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see mmclass.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the attribute '{@link mmclass.Node#getNodeText <em>Node Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Node Text</em>'.
   * @see mmclass.Node#getNodeText()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_NodeText();

  /**
   * Returns the meta object for the attribute '{@link mmclass.Node#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see mmclass.Node#getDescription()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Description();

  /**
   * Returns the meta object for the attribute '{@link mmclass.Node#getCustomIcon <em>Custom Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Custom Icon</em>'.
   * @see mmclass.Node#getCustomIcon()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_CustomIcon();

  /**
   * Returns the meta object for class '{@link mmclass.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see mmclass.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for class '{@link mmclass.RootNode <em>Root Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root Node</em>'.
   * @see mmclass.RootNode
   * @generated
   */
  EClass getRootNode();

  /**
   * Returns the meta object for class '{@link mmclass.FloatNode <em>Float Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Node</em>'.
   * @see mmclass.FloatNode
   * @generated
   */
  EClass getFloatNode();

  /**
   * Returns the meta object for class '{@link mmclass.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum</em>'.
   * @see mmclass.Enum
   * @generated
   */
  EClass getEnum();

  /**
   * Returns the meta object for the containment reference list '{@link mmclass.Enum#getConstants <em>Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constants</em>'.
   * @see mmclass.Enum#getConstants()
   * @see #getEnum()
   * @generated
   */
  EReference getEnum_Constants();

  /**
   * Returns the meta object for class '{@link mmclass.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see mmclass.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for class '{@link mmclass.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see mmclass.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the reference list '{@link mmclass.Entity#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Attributes</em>'.
   * @see mmclass.Entity#getAttributes()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Attributes();

  /**
   * Returns the meta object for the reference list '{@link mmclass.Entity#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Entities</em>'.
   * @see mmclass.Entity#getEntities()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Entities();

  /**
   * Returns the meta object for the attribute '{@link mmclass.Entity#getOclRules <em>Ocl Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ocl Rules</em>'.
   * @see mmclass.Entity#getOclRules()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_OclRules();

  /**
   * Returns the meta object for class '{@link mmclass.AssociationEntity <em>Association Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Association Entity</em>'.
   * @see mmclass.AssociationEntity
   * @generated
   */
  EClass getAssociationEntity();

  /**
   * Returns the meta object for the containment reference list '{@link mmclass.AssociationEntity#getAssociations <em>Associations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Associations</em>'.
   * @see mmclass.AssociationEntity#getAssociations()
   * @see #getAssociationEntity()
   * @generated
   */
  EReference getAssociationEntity_Associations();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MmclassFactory getMmclassFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link mmclass.impl.MindMapModelImpl <em>Mind Map Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mmclass.impl.MindMapModelImpl
     * @see mmclass.impl.MmclassPackageImpl#getMindMapModel()
     * @generated
     */
    EClass MIND_MAP_MODEL = eINSTANCE.getMindMapModel();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIND_MAP_MODEL__NODES = eINSTANCE.getMindMapModel_Nodes();

    /**
     * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIND_MAP_MODEL__EDGES = eINSTANCE.getMindMapModel_Edges();

    /**
     * The meta object literal for the '{@link mmclass.impl.EdgeImpl <em>Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mmclass.impl.EdgeImpl
     * @see mmclass.impl.MmclassPackageImpl#getEdge()
     * @generated
     */
    EClass EDGE = eINSTANCE.getEdge();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDGE__NAME = eINSTANCE.getEdge_Name();

    /**
     * The meta object literal for the '{@link mmclass.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mmclass.impl.NodeImpl
     * @see mmclass.impl.MmclassPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Node Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__NODE_TEXT = eINSTANCE.getNode_NodeText();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__DESCRIPTION = eINSTANCE.getNode_Description();

    /**
     * The meta object literal for the '<em><b>Custom Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__CUSTOM_ICON = eINSTANCE.getNode_CustomIcon();

    /**
     * The meta object literal for the '{@link mmclass.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mmclass.impl.AttributeImpl
     * @see mmclass.impl.MmclassPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '{@link mmclass.impl.RootNodeImpl <em>Root Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mmclass.impl.RootNodeImpl
     * @see mmclass.impl.MmclassPackageImpl#getRootNode()
     * @generated
     */
    EClass ROOT_NODE = eINSTANCE.getRootNode();

    /**
     * The meta object literal for the '{@link mmclass.impl.FloatNodeImpl <em>Float Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mmclass.impl.FloatNodeImpl
     * @see mmclass.impl.MmclassPackageImpl#getFloatNode()
     * @generated
     */
    EClass FLOAT_NODE = eINSTANCE.getFloatNode();

    /**
     * The meta object literal for the '{@link mmclass.impl.EnumImpl <em>Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mmclass.impl.EnumImpl
     * @see mmclass.impl.MmclassPackageImpl#getEnum()
     * @generated
     */
    EClass ENUM = eINSTANCE.getEnum();

    /**
     * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM__CONSTANTS = eINSTANCE.getEnum_Constants();

    /**
     * The meta object literal for the '{@link mmclass.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mmclass.impl.ConstantImpl
     * @see mmclass.impl.MmclassPackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '{@link mmclass.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mmclass.impl.EntityImpl
     * @see mmclass.impl.MmclassPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ENTITIES = eINSTANCE.getEntity_Entities();

    /**
     * The meta object literal for the '<em><b>Ocl Rules</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__OCL_RULES = eINSTANCE.getEntity_OclRules();

    /**
     * The meta object literal for the '{@link mmclass.impl.AssociationEntityImpl <em>Association Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mmclass.impl.AssociationEntityImpl
     * @see mmclass.impl.MmclassPackageImpl#getAssociationEntity()
     * @generated
     */
    EClass ASSOCIATION_ENTITY = eINSTANCE.getAssociationEntity();

    /**
     * The meta object literal for the '<em><b>Associations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSOCIATION_ENTITY__ASSOCIATIONS = eINSTANCE.getAssociationEntity_Associations();

  }

} //MmclassPackage
