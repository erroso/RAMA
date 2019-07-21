/**
 */
package mmbdd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see mmbdd.MmbddFactory
 * @model kind="package"
 * @generated
 */
public interface MmbddPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mmbdd";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://mmbdd.com";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mmbdd";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MmbddPackage eINSTANCE = mmbdd.impl.MmbddPackageImpl.init();

  /**
   * The meta object id for the '{@link mmbdd.impl.MindMapModelImpl <em>Mind Map Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mmbdd.impl.MindMapModelImpl
   * @see mmbdd.impl.MmbddPackageImpl#getMindMapModel()
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
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIND_MAP_MODEL__CONTENT = 2;

  /**
   * The number of structural features of the '<em>Mind Map Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIND_MAP_MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link mmbdd.impl.ContentImpl <em>Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mmbdd.impl.ContentImpl
   * @see mmbdd.impl.MmbddPackageImpl#getContent()
   * @generated
   */
  int CONTENT = 1;

  /**
   * The number of structural features of the '<em>Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link mmbdd.impl.EdgeImpl <em>Edge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mmbdd.impl.EdgeImpl
   * @see mmbdd.impl.MmbddPackageImpl#getEdge()
   * @generated
   */
  int EDGE = 2;

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
   * The feature id for the '<em><b>Logic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE__LOGIC = 2;

  /**
   * The number of structural features of the '<em>Edge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link mmbdd.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mmbdd.impl.NodeImpl
   * @see mmbdd.impl.MmbddPackageImpl#getNode()
   * @generated
   */
  int NODE = 3;

  /**
   * The feature id for the '<em><b>Node Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NODE_TEXT = 0;

  /**
   * The feature id for the '<em><b>Notation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NOTATION = 1;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link mmbdd.impl.GroupImpl <em>Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mmbdd.impl.GroupImpl
   * @see mmbdd.impl.MmbddPackageImpl#getGroup()
   * @generated
   */
  int GROUP = 4;

  /**
   * The feature id for the '<em><b>Node Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__NODE_TEXT = NODE__NODE_TEXT;

  /**
   * The feature id for the '<em><b>Notation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__NOTATION = NODE__NOTATION;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__NODES = NODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link mmbdd.impl.LeafImpl <em>Leaf</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mmbdd.impl.LeafImpl
   * @see mmbdd.impl.MmbddPackageImpl#getLeaf()
   * @generated
   */
  int LEAF = 5;

  /**
   * The feature id for the '<em><b>Node Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF__NODE_TEXT = NODE__NODE_TEXT;

  /**
   * The feature id for the '<em><b>Notation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF__NOTATION = NODE__NOTATION;

  /**
   * The number of structural features of the '<em>Leaf</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link mmbdd.impl.CenterImpl <em>Center</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mmbdd.impl.CenterImpl
   * @see mmbdd.impl.MmbddPackageImpl#getCenter()
   * @generated
   */
  int CENTER = 6;

  /**
   * The feature id for the '<em><b>Node Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CENTER__NODE_TEXT = GROUP__NODE_TEXT;

  /**
   * The feature id for the '<em><b>Notation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CENTER__NOTATION = GROUP__NOTATION;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CENTER__NODES = GROUP__NODES;

  /**
   * The number of structural features of the '<em>Center</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CENTER_FEATURE_COUNT = GROUP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link mmbdd.impl.RelationshipImpl <em>Relationship</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mmbdd.impl.RelationshipImpl
   * @see mmbdd.impl.MmbddPackageImpl#getRelationship()
   * @generated
   */
  int RELATIONSHIP = 7;

  /**
   * The feature id for the '<em><b>Node Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__NODE_TEXT = GROUP__NODE_TEXT;

  /**
   * The feature id for the '<em><b>Notation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__NOTATION = GROUP__NOTATION;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__NODES = GROUP__NODES;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__TYPE = GROUP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Relationship</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_FEATURE_COUNT = GROUP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link mmbdd.impl.NotationImpl <em>Notation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mmbdd.impl.NotationImpl
   * @see mmbdd.impl.MmbddPackageImpl#getNotation()
   * @generated
   */
  int NOTATION = 8;

  /**
   * The number of structural features of the '<em>Notation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link mmbdd.impl.TextualImpl <em>Textual</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mmbdd.impl.TextualImpl
   * @see mmbdd.impl.MmbddPackageImpl#getTextual()
   * @generated
   */
  int TEXTUAL = 9;

  /**
   * The number of structural features of the '<em>Textual</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTUAL_FEATURE_COUNT = NOTATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link mmbdd.impl.IconImpl <em>Icon</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mmbdd.impl.IconImpl
   * @see mmbdd.impl.MmbddPackageImpl#getIcon()
   * @generated
   */
  int ICON = 10;

  /**
   * The number of structural features of the '<em>Icon</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ICON_FEATURE_COUNT = NOTATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link mmbdd.impl.ImageImpl <em>Image</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mmbdd.impl.ImageImpl
   * @see mmbdd.impl.MmbddPackageImpl#getImage()
   * @generated
   */
  int IMAGE = 11;

  /**
   * The number of structural features of the '<em>Image</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FEATURE_COUNT = NOTATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link mmbdd.EgdeLogicTypes <em>Egde Logic Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mmbdd.EgdeLogicTypes
   * @see mmbdd.impl.MmbddPackageImpl#getEgdeLogicTypes()
   * @generated
   */
  int EGDE_LOGIC_TYPES = 12;

  /**
   * The meta object id for the '{@link mmbdd.NodeTypes <em>Node Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mmbdd.NodeTypes
   * @see mmbdd.impl.MmbddPackageImpl#getNodeTypes()
   * @generated
   */
  int NODE_TYPES = 13;


  /**
   * Returns the meta object for class '{@link mmbdd.MindMapModel <em>Mind Map Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mind Map Model</em>'.
   * @see mmbdd.MindMapModel
   * @generated
   */
  EClass getMindMapModel();

  /**
   * Returns the meta object for the containment reference list '{@link mmbdd.MindMapModel#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see mmbdd.MindMapModel#getNodes()
   * @see #getMindMapModel()
   * @generated
   */
  EReference getMindMapModel_Nodes();

  /**
   * Returns the meta object for the containment reference list '{@link mmbdd.MindMapModel#getEdges <em>Edges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edges</em>'.
   * @see mmbdd.MindMapModel#getEdges()
   * @see #getMindMapModel()
   * @generated
   */
  EReference getMindMapModel_Edges();

  /**
   * Returns the meta object for the containment reference list '{@link mmbdd.MindMapModel#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see mmbdd.MindMapModel#getContent()
   * @see #getMindMapModel()
   * @generated
   */
  EReference getMindMapModel_Content();

  /**
   * Returns the meta object for class '{@link mmbdd.Content <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content</em>'.
   * @see mmbdd.Content
   * @generated
   */
  EClass getContent();

  /**
   * Returns the meta object for class '{@link mmbdd.Edge <em>Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edge</em>'.
   * @see mmbdd.Edge
   * @generated
   */
  EClass getEdge();

  /**
   * Returns the meta object for the reference '{@link mmbdd.Edge#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see mmbdd.Edge#getSource()
   * @see #getEdge()
   * @generated
   */
  EReference getEdge_Source();

  /**
   * Returns the meta object for the reference '{@link mmbdd.Edge#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see mmbdd.Edge#getTarget()
   * @see #getEdge()
   * @generated
   */
  EReference getEdge_Target();

  /**
   * Returns the meta object for the attribute '{@link mmbdd.Edge#getLogic <em>Logic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Logic</em>'.
   * @see mmbdd.Edge#getLogic()
   * @see #getEdge()
   * @generated
   */
  EAttribute getEdge_Logic();

  /**
   * Returns the meta object for class '{@link mmbdd.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see mmbdd.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the attribute '{@link mmbdd.Node#getNodeText <em>Node Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Node Text</em>'.
   * @see mmbdd.Node#getNodeText()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_NodeText();

  /**
   * Returns the meta object for the reference '{@link mmbdd.Node#getNotation <em>Notation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Notation</em>'.
   * @see mmbdd.Node#getNotation()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Notation();

  /**
   * Returns the meta object for class '{@link mmbdd.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group</em>'.
   * @see mmbdd.Group
   * @generated
   */
  EClass getGroup();

  /**
   * Returns the meta object for the reference list '{@link mmbdd.Group#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Nodes</em>'.
   * @see mmbdd.Group#getNodes()
   * @see #getGroup()
   * @generated
   */
  EReference getGroup_Nodes();

  /**
   * Returns the meta object for class '{@link mmbdd.Leaf <em>Leaf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Leaf</em>'.
   * @see mmbdd.Leaf
   * @generated
   */
  EClass getLeaf();

  /**
   * Returns the meta object for class '{@link mmbdd.Center <em>Center</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Center</em>'.
   * @see mmbdd.Center
   * @generated
   */
  EClass getCenter();

  /**
   * Returns the meta object for class '{@link mmbdd.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship</em>'.
   * @see mmbdd.Relationship
   * @generated
   */
  EClass getRelationship();

  /**
   * Returns the meta object for the attribute '{@link mmbdd.Relationship#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see mmbdd.Relationship#getType()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_Type();

  /**
   * Returns the meta object for class '{@link mmbdd.Notation <em>Notation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Notation</em>'.
   * @see mmbdd.Notation
   * @generated
   */
  EClass getNotation();

  /**
   * Returns the meta object for class '{@link mmbdd.Textual <em>Textual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Textual</em>'.
   * @see mmbdd.Textual
   * @generated
   */
  EClass getTextual();

  /**
   * Returns the meta object for class '{@link mmbdd.Icon <em>Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Icon</em>'.
   * @see mmbdd.Icon
   * @generated
   */
  EClass getIcon();

  /**
   * Returns the meta object for class '{@link mmbdd.Image <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image</em>'.
   * @see mmbdd.Image
   * @generated
   */
  EClass getImage();

  /**
   * Returns the meta object for enum '{@link mmbdd.EgdeLogicTypes <em>Egde Logic Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Egde Logic Types</em>'.
   * @see mmbdd.EgdeLogicTypes
   * @generated
   */
  EEnum getEgdeLogicTypes();

  /**
   * Returns the meta object for enum '{@link mmbdd.NodeTypes <em>Node Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Node Types</em>'.
   * @see mmbdd.NodeTypes
   * @generated
   */
  EEnum getNodeTypes();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MmbddFactory getMmbddFactory();

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
     * The meta object literal for the '{@link mmbdd.impl.MindMapModelImpl <em>Mind Map Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mmbdd.impl.MindMapModelImpl
     * @see mmbdd.impl.MmbddPackageImpl#getMindMapModel()
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
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIND_MAP_MODEL__CONTENT = eINSTANCE.getMindMapModel_Content();

    /**
     * The meta object literal for the '{@link mmbdd.impl.ContentImpl <em>Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mmbdd.impl.ContentImpl
     * @see mmbdd.impl.MmbddPackageImpl#getContent()
     * @generated
     */
    EClass CONTENT = eINSTANCE.getContent();

    /**
     * The meta object literal for the '{@link mmbdd.impl.EdgeImpl <em>Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mmbdd.impl.EdgeImpl
     * @see mmbdd.impl.MmbddPackageImpl#getEdge()
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
     * The meta object literal for the '<em><b>Logic</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDGE__LOGIC = eINSTANCE.getEdge_Logic();

    /**
     * The meta object literal for the '{@link mmbdd.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mmbdd.impl.NodeImpl
     * @see mmbdd.impl.MmbddPackageImpl#getNode()
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
     * The meta object literal for the '<em><b>Notation</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__NOTATION = eINSTANCE.getNode_Notation();

    /**
     * The meta object literal for the '{@link mmbdd.impl.GroupImpl <em>Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mmbdd.impl.GroupImpl
     * @see mmbdd.impl.MmbddPackageImpl#getGroup()
     * @generated
     */
    EClass GROUP = eINSTANCE.getGroup();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP__NODES = eINSTANCE.getGroup_Nodes();

    /**
     * The meta object literal for the '{@link mmbdd.impl.LeafImpl <em>Leaf</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mmbdd.impl.LeafImpl
     * @see mmbdd.impl.MmbddPackageImpl#getLeaf()
     * @generated
     */
    EClass LEAF = eINSTANCE.getLeaf();

    /**
     * The meta object literal for the '{@link mmbdd.impl.CenterImpl <em>Center</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mmbdd.impl.CenterImpl
     * @see mmbdd.impl.MmbddPackageImpl#getCenter()
     * @generated
     */
    EClass CENTER = eINSTANCE.getCenter();

    /**
     * The meta object literal for the '{@link mmbdd.impl.RelationshipImpl <em>Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mmbdd.impl.RelationshipImpl
     * @see mmbdd.impl.MmbddPackageImpl#getRelationship()
     * @generated
     */
    EClass RELATIONSHIP = eINSTANCE.getRelationship();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__TYPE = eINSTANCE.getRelationship_Type();

    /**
     * The meta object literal for the '{@link mmbdd.impl.NotationImpl <em>Notation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mmbdd.impl.NotationImpl
     * @see mmbdd.impl.MmbddPackageImpl#getNotation()
     * @generated
     */
    EClass NOTATION = eINSTANCE.getNotation();

    /**
     * The meta object literal for the '{@link mmbdd.impl.TextualImpl <em>Textual</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mmbdd.impl.TextualImpl
     * @see mmbdd.impl.MmbddPackageImpl#getTextual()
     * @generated
     */
    EClass TEXTUAL = eINSTANCE.getTextual();

    /**
     * The meta object literal for the '{@link mmbdd.impl.IconImpl <em>Icon</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mmbdd.impl.IconImpl
     * @see mmbdd.impl.MmbddPackageImpl#getIcon()
     * @generated
     */
    EClass ICON = eINSTANCE.getIcon();

    /**
     * The meta object literal for the '{@link mmbdd.impl.ImageImpl <em>Image</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mmbdd.impl.ImageImpl
     * @see mmbdd.impl.MmbddPackageImpl#getImage()
     * @generated
     */
    EClass IMAGE = eINSTANCE.getImage();

    /**
     * The meta object literal for the '{@link mmbdd.EgdeLogicTypes <em>Egde Logic Types</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mmbdd.EgdeLogicTypes
     * @see mmbdd.impl.MmbddPackageImpl#getEgdeLogicTypes()
     * @generated
     */
    EEnum EGDE_LOGIC_TYPES = eINSTANCE.getEgdeLogicTypes();

    /**
     * The meta object literal for the '{@link mmbdd.NodeTypes <em>Node Types</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mmbdd.NodeTypes
     * @see mmbdd.impl.MmbddPackageImpl#getNodeTypes()
     * @generated
     */
    EEnum NODE_TYPES = eINSTANCE.getNodeTypes();

  }

} //MmbddPackage
