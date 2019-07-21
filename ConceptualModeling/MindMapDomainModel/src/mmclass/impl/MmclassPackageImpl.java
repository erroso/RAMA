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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MmclassPackageImpl extends EPackageImpl implements MmclassPackage
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
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rootNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floatNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass associationEntityEClass = null;

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
   * @see mmclass.MmclassPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MmclassPackageImpl()
  {
    super(eNS_URI, MmclassFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link MmclassPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MmclassPackage init()
  {
    if (isInited) return (MmclassPackage)EPackage.Registry.INSTANCE.getEPackage(MmclassPackage.eNS_URI);

    // Obtain or create and register package
    MmclassPackageImpl theMmclassPackage = (MmclassPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MmclassPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MmclassPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMmclassPackage.createPackageContents();

    // Initialize created meta-data
    theMmclassPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMmclassPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MmclassPackage.eNS_URI, theMmclassPackage);
    return theMmclassPackage;
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
  public EAttribute getEdge_Name()
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
  public EAttribute getNode_Description()
  {
    return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNode_CustomIcon()
  {
    return (EAttribute)nodeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRootNode()
  {
    return rootNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFloatNode()
  {
    return floatNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnum()
  {
    return enumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnum_Constants()
  {
    return (EReference)enumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstant()
  {
    return constantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_Attributes()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_Entities()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntity_OclRules()
  {
    return (EAttribute)entityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssociationEntity()
  {
    return associationEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssociationEntity_Associations()
  {
    return (EReference)associationEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MmclassFactory getMmclassFactory()
  {
    return (MmclassFactory)getEFactoryInstance();
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

    edgeEClass = createEClass(EDGE);
    createEReference(edgeEClass, EDGE__SOURCE);
    createEReference(edgeEClass, EDGE__TARGET);
    createEAttribute(edgeEClass, EDGE__NAME);

    nodeEClass = createEClass(NODE);
    createEAttribute(nodeEClass, NODE__NODE_TEXT);
    createEAttribute(nodeEClass, NODE__DESCRIPTION);
    createEAttribute(nodeEClass, NODE__CUSTOM_ICON);

    attributeEClass = createEClass(ATTRIBUTE);

    rootNodeEClass = createEClass(ROOT_NODE);

    floatNodeEClass = createEClass(FLOAT_NODE);

    enumEClass = createEClass(ENUM);
    createEReference(enumEClass, ENUM__CONSTANTS);

    constantEClass = createEClass(CONSTANT);

    entityEClass = createEClass(ENTITY);
    createEReference(entityEClass, ENTITY__ATTRIBUTES);
    createEReference(entityEClass, ENTITY__ENTITIES);
    createEAttribute(entityEClass, ENTITY__OCL_RULES);

    associationEntityEClass = createEClass(ASSOCIATION_ENTITY);
    createEReference(associationEntityEClass, ASSOCIATION_ENTITY__ASSOCIATIONS);
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
    attributeEClass.getESuperTypes().add(this.getNode());
    rootNodeEClass.getESuperTypes().add(this.getNode());
    floatNodeEClass.getESuperTypes().add(this.getNode());
    enumEClass.getESuperTypes().add(this.getFloatNode());
    constantEClass.getESuperTypes().add(this.getNode());
    entityEClass.getESuperTypes().add(this.getNode());
    associationEntityEClass.getESuperTypes().add(this.getEntity());

    // Initialize classes and features; add operations and parameters
    initEClass(mindMapModelEClass, MindMapModel.class, "MindMapModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMindMapModel_Nodes(), this.getNode(), null, "nodes", null, 0, -1, MindMapModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMindMapModel_Edges(), this.getEdge(), null, "edges", null, 0, -1, MindMapModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEdge_Source(), this.getNode(), null, "source", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEdge_Target(), this.getNode(), null, "target", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEdge_Name(), ecorePackage.getEString(), "name", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNode_NodeText(), ecorePackage.getEString(), "nodeText", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNode_Description(), ecorePackage.getEString(), "description", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNode_CustomIcon(), ecorePackage.getEString(), "customIcon", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rootNodeEClass, RootNode.class, "RootNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(floatNodeEClass, FloatNode.class, "FloatNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enumEClass, mmclass.Enum.class, "Enum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnum_Constants(), this.getConstant(), null, "constants", null, 0, -1, mmclass.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntity_Attributes(), this.getAttribute(), null, "attributes", null, 1, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_Entities(), this.getEntity(), null, "entities", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEntity_OclRules(), ecorePackage.getEString(), "oclRules", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(associationEntityEClass, AssociationEntity.class, "AssociationEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssociationEntity_Associations(), this.getEntity(), null, "associations", null, 2, 2, AssociationEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // gmf.diagram
    createGmfAnnotations();
    // gmf.link
    createGmf_1Annotations();
    // gmf.node
    createGmf_2Annotations();
    // gmf.compartment
    createGmf_3Annotations();
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
       "foo", "bar",
       "diagram.extension", "ddm",
       "model.extension", "mdm"
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
       "label", "name",
       "source", "source",
       "target", "target",
       "color", "128,128,128",
       "width", "1",
       "label.placement", "external",
       "target.constraint", "self <> oppositeEnd"
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
      (attributeEClass, 
       source, 
       new String[] 
       {
       "label", "nodeText",
       "label.placement", "internal",
       "resizable", "false"
       });		
    addAnnotation
      (rootNodeEClass, 
       source, 
       new String[] 
       {
       "label", "nodeText",
       "label.placement", "internal",
       "label.icon", "none",
       "figure", "rounded",
       "resizable", "false"
       });		
    addAnnotation
      (enumEClass, 
       source, 
       new String[] 
       {
       "label", "nodeText",
       "label.placement", "internal",
       "resizable", "false"
       });		
    addAnnotation
      (constantEClass, 
       source, 
       new String[] 
       {
       "label", "nodeText",
       "label.placement", "internal",
       "resizable", "false"
       });		
    addAnnotation
      (entityEClass, 
       source, 
       new String[] 
       {
       "label", "nodeText",
       "label.placement", "internal",
       "resizable", "false"
       });		
    addAnnotation
      (associationEntityEClass, 
       source, 
       new String[] 
       {
       "label", "nodeText",
       "label.placement", "internal",
       "resizable", "false"
       });	
  }

  /**
   * Initializes the annotations for <b>gmf.compartment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_3Annotations()
  {
    String source = "gmf.compartment";										
    addAnnotation
      (getAssociationEntity_Associations(), 
       source, 
       new String[] 
       {
       "layout", "list",
       "collapsible", "true"
       });
  }

} //MmclassPackageImpl
