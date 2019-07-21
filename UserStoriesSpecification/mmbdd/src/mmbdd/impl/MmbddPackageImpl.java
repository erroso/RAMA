/**
 */
package mmbdd.impl;

import mmbdd.Center;
import mmbdd.Content;
import mmbdd.Edge;
import mmbdd.EgdeLogicTypes;
import mmbdd.Group;
import mmbdd.Icon;
import mmbdd.Image;
import mmbdd.Leaf;
import mmbdd.MindMapModel;
import mmbdd.MmbddFactory;
import mmbdd.MmbddPackage;
import mmbdd.Node;
import mmbdd.NodeLogicTypes;
import mmbdd.NodeTypes;
import mmbdd.Notation;
import mmbdd.Relationship;
import mmbdd.Textual;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MmbddPackageImpl extends EPackageImpl implements MmbddPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mindMapModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass edgeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass leafEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass centerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationshipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textualEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iconEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum egdeLogicTypesEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum nodeTypesEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see mmbdd.MmbddPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MmbddPackageImpl()
  {
    super(eNS_URI, MmbddFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MmbddPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MmbddPackage init()
  {
    if (isInited) return (MmbddPackage)EPackage.Registry.INSTANCE.getEPackage(MmbddPackage.eNS_URI);

    // Obtain or create and register package
    MmbddPackageImpl theMmbddPackage = (MmbddPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MmbddPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MmbddPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMmbddPackage.createPackageContents();

    // Initialize created meta-data
    theMmbddPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMmbddPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MmbddPackage.eNS_URI, theMmbddPackage);
    return theMmbddPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMindMapModel()
  {
    return mindMapModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMindMapModel_Nodes()
  {
    return (EReference)mindMapModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMindMapModel_Edges()
  {
    return (EReference)mindMapModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMindMapModel_Content()
  {
    return (EReference)mindMapModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContent()
  {
    return contentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEdge()
  {
    return edgeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEdge_Source()
  {
    return (EReference)edgeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEdge_Target()
  {
    return (EReference)edgeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEdge_Logic()
  {
    return (EAttribute)edgeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNode()
  {
    return nodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNode_NodeText()
  {
    return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_Notation()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroup()
  {
    return groupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroup_Nodes()
  {
    return (EReference)groupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLeaf()
  {
    return leafEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCenter()
  {
    return centerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationship()
  {
    return relationshipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationship_Type()
  {
    return (EAttribute)relationshipEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotation()
  {
    return notationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextual()
  {
    return textualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIcon()
  {
    return iconEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImage()
  {
    return imageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getEgdeLogicTypes()
  {
    return egdeLogicTypesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getNodeTypes()
  {
    return nodeTypesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MmbddFactory getMmbddFactory()
  {
    return (MmbddFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    mindMapModelEClass = createEClass(MIND_MAP_MODEL);
    createEReference(mindMapModelEClass, MIND_MAP_MODEL__NODES);
    createEReference(mindMapModelEClass, MIND_MAP_MODEL__EDGES);
    createEReference(mindMapModelEClass, MIND_MAP_MODEL__CONTENT);

    contentEClass = createEClass(CONTENT);

    edgeEClass = createEClass(EDGE);
    createEReference(edgeEClass, EDGE__SOURCE);
    createEReference(edgeEClass, EDGE__TARGET);
    createEAttribute(edgeEClass, EDGE__LOGIC);

    nodeEClass = createEClass(NODE);
    createEAttribute(nodeEClass, NODE__NODE_TEXT);
    createEReference(nodeEClass, NODE__NOTATION);

    groupEClass = createEClass(GROUP);
    createEReference(groupEClass, GROUP__NODES);

    leafEClass = createEClass(LEAF);

    centerEClass = createEClass(CENTER);

    relationshipEClass = createEClass(RELATIONSHIP);
    createEAttribute(relationshipEClass, RELATIONSHIP__TYPE);

    notationEClass = createEClass(NOTATION);

    textualEClass = createEClass(TEXTUAL);

    iconEClass = createEClass(ICON);

    imageEClass = createEClass(IMAGE);

    // Create enums
    egdeLogicTypesEEnum = createEEnum(EGDE_LOGIC_TYPES);
    nodeTypesEEnum = createEEnum(NODE_TYPES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    groupEClass.getESuperTypes().add(this.getNode());
    leafEClass.getESuperTypes().add(this.getNode());
    centerEClass.getESuperTypes().add(this.getGroup());
    relationshipEClass.getESuperTypes().add(this.getGroup());
    textualEClass.getESuperTypes().add(this.getNotation());
    iconEClass.getESuperTypes().add(this.getNotation());
    imageEClass.getESuperTypes().add(this.getNotation());

    // Initialize classes and features; add operations and parameters
    initEClass(mindMapModelEClass, MindMapModel.class, "MindMapModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMindMapModel_Nodes(), this.getNode(), null, "nodes", null, 0, -1, MindMapModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMindMapModel_Edges(), this.getEdge(), null, "edges", null, 0, -1, MindMapModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMindMapModel_Content(), this.getContent(), null, "content", null, 1, -1, MindMapModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contentEClass, Content.class, "Content", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEdge_Source(), this.getNode(), null, "source", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEdge_Target(), this.getNode(), null, "target", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEdge_Logic(), this.getEgdeLogicTypes(), "logic", "0", 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNode_NodeText(), ecorePackage.getEString(), "nodeText", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_Notation(), this.getNotation(), null, "notation", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGroup_Nodes(), this.getNode(), null, "nodes", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(leafEClass, Leaf.class, "Leaf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(centerEClass, Center.class, "Center", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRelationship_Type(), this.getNodeTypes(), "type", "1", 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(notationEClass, Notation.class, "Notation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(textualEClass, Textual.class, "Textual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(iconEClass, Icon.class, "Icon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(egdeLogicTypesEEnum, EgdeLogicTypes.class, "EgdeLogicTypes");
    addEEnumLiteral(egdeLogicTypesEEnum, EgdeLogicTypes.NONE);
    addEEnumLiteral(egdeLogicTypesEEnum, EgdeLogicTypes.EQUAL);
    addEEnumLiteral(egdeLogicTypesEEnum, EgdeLogicTypes.DIFFERENT);
    addEEnumLiteral(egdeLogicTypesEEnum, EgdeLogicTypes.BIGGER);
    addEEnumLiteral(egdeLogicTypesEEnum, EgdeLogicTypes.SMALLER);

    initEEnum(nodeTypesEEnum, NodeTypes.class, "NodeTypes");
    addEEnumLiteral(nodeTypesEEnum, NodeTypes.GIVEN);
    addEEnumLiteral(nodeTypesEEnum, NodeTypes.WHEN);
    addEEnumLiteral(nodeTypesEEnum, NodeTypes.THEN);
    addEEnumLiteral(nodeTypesEEnum, NodeTypes.AS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // gmf.diagram
    createGmfAnnotations();
    // gmf.link
    createGmf_1Annotations();
    // gmf.node
    createGmf_2Annotations();
  }

  /**
   * Initializes the annotations for <b>gmf.diagram</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmfAnnotations()
  {
    String source = "gmf.diagram";		
    addAnnotation
      (mindMapModelEClass, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });				
  }

  /**
   * Initializes the annotations for <b>gmf.link</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_1Annotations()
  {
    String source = "gmf.link";			
    addAnnotation
      (edgeEClass, 
       source, 
       new String[] 
       {
       "source", "source",
       "target", "target",
       "color", "0,0,0",
       "width", "2",
       "label.placement", "external",
       "target.decoration", "none"
       });			
  }

  /**
   * Initializes the annotations for <b>gmf.node</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_2Annotations()
  {
    String source = "gmf.node";				
    addAnnotation
      (leafEClass, 
       source, 
       new String[] 
       {
       "label", "nodeText",
       "label.placement", "internal",
       "figure", "rectangle"
       });		
    addAnnotation
      (centerEClass, 
       source, 
       new String[] 
       {
       "label", "nodeText",
       "label.placement", "internal",
       "figure", "rectangle"
       });		
    addAnnotation
      (relationshipEClass, 
       source, 
       new String[] 
       {
       "label", "nodeText",
       "label.placement", "internal",
       "figure", "rectangle"
       });
  }

} //MmbddPackageImpl
