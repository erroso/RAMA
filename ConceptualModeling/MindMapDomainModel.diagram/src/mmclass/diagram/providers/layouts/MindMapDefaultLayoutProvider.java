package mmclass.diagram.providers.layouts;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import mmclass.diagram.edit.parts.AttributeEditPart;
import mmclass.diagram.edit.parts.ConstantEditPart;
import mmclass.diagram.edit.parts.EntityEditPart;
import mmclass.diagram.edit.parts.EnumEditPart;
import mmclass.diagram.part.MmclassDiagramEditor;
import mmclass.provider.MmclassEditPlugin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.graph.CompoundDirectedGraph;
import org.eclipse.draw2d.graph.DirectedGraph;
import org.eclipse.draw2d.graph.DirectedGraphLayout;
import org.eclipse.draw2d.graph.Edge;
import org.eclipse.draw2d.graph.EdgeList;
import org.eclipse.draw2d.graph.Node;
import org.eclipse.draw2d.graph.NodeList;
import org.eclipse.draw2d.graph.Subgraph;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.core.util.Trace;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.services.layout.LayoutNodesOperation;
import org.eclipse.gmf.runtime.diagram.ui.providers.internal.DiagramProvidersDebugOptions;
import org.eclipse.gmf.runtime.diagram.ui.providers.internal.DiagramProvidersPlugin;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.diagram.ui.requests.SetAllBendpointRequest;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.AbstractLayoutEditPartProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.LayoutType;
import org.eclipse.gmf.runtime.draw2d.ui.geometry.PointListUtilities;
import org.eclipse.gmf.runtime.draw2d.ui.internal.graph.AdvancedSubGraph;
import org.eclipse.gmf.runtime.draw2d.ui.internal.graph.CompositeDirectedGraphLayout;
import org.eclipse.gmf.runtime.draw2d.ui.internal.graph.VirtualNode;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.Size;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;

import org.eclipse.zest.layouts.InvalidLayoutConfiguration;
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.LayoutEntity;
import org.eclipse.zest.layouts.LayoutItem;
import org.eclipse.zest.layouts.LayoutRelationship;
import org.eclipse.zest.layouts.algorithms.HorizontalTreeLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.RadialLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.SpringLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;

import UTIL.ActiveDiagram;


//@SuppressWarnings( { "unchecked", "restriction" })
public class MindMapDefaultLayoutProvider extends AbstractLayoutEditPartProvider {
	public static String DEFAULT_LAYOUT = "layout";
	// **************Valori default**************

	// Minimum sep between icon and bottommost horizontal arc
	// protected int minX = -1;
	// protected int minY = -1;
	// protected int layoutDefaultMargin = 0;
	// protected IMapMode mm;
	//    
	// protected static final int NODE_PADDING = 30;
	// protected static final int MIN_EDGE_PADDING = 5;
	// protected static final int MAX_EDGE_PADDING = NODE_PADDING * 3;

	// **************Valori modificati****************************

	// Minimum sep between icon and bottommost horizontal arc

	// MinX e MinY servono a settare le distanze del nodo dal bordo superiore
	// destro del container
	protected int minX = -1;
	protected int minY = -1;
	protected int layoutDefaultMargin = 0;
	protected IMapMode mm;

	protected static final int NODE_PADDING = 30;
	protected static final int MIN_EDGE_PADDING = 5;
	protected static final int MAX_EDGE_PADDING = NODE_PADDING * 3;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmf.runtime.diagram.ui.providers.internal.DefaultProvider#translateToGraph(org.eclipse.draw2d.geometry.Rectangle)
	 */
	protected Rectangle translateToGraph(Rectangle r) {
		Rectangle rDP = new Rectangle(r);
		getMapMode().LPtoDP(rDP);
		return rDP;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmf.runtime.diagram.ui.providers.internal.DefaultProvider#translateFromGraph(org.eclipse.draw2d.geometry.Rectangle)
	 */
	protected Rectangle translateFromGraph(Rectangle rect) {
		Rectangle rLP = new Rectangle(rect);
		getMapMode().DPtoLP(rLP);
		return rLP;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmf.runtime.diagram.ui.providers.internal.DefaultProvider#build_nodes(java.util.List,
	 *      java.util.Map, org.eclipse.draw2d.graph.Subgraph)
	 */

	protected NodeList build_nodes(List selectedObjects, Map editPartToNodeDict, Subgraph rootGraph) {
		ListIterator li = selectedObjects.listIterator();
		NodeList nodes = new NodeList();
		while (li.hasNext()) {
			IGraphicalEditPart gep = (IGraphicalEditPart) li.next();			
			boolean hasChildren = hasChildren(gep);
			if (!(gep instanceof IBorderItemEditPart)
					&& (gep instanceof ShapeEditPart || gep instanceof ShapeCompartmentEditPart)) {
				GraphicalEditPart ep = (GraphicalEditPart) gep;				
				Point position = ep.getFigure().getBounds().getLocation();				
				Node n = null;
				if (hasChildren) {
					AdvancedSubGraph subGraph = null;
					
					if (rootGraph != null)
						subGraph = new AdvancedSubGraph(ep, rootGraph);
					else
						subGraph = new AdvancedSubGraph(ep);
					
//					subGraph.setAutoSize(isAutoSizeOn(subGraph, ep));
					if (gep instanceof CompartmentEditPart) {
						subGraph.setHasBufferedZone(true);
					}
					n = subGraph;
				} else {
					if (rootGraph != null)
						n = new Node(ep, rootGraph);
					else
						n = new Node(ep);
				}				
				Dimension size = ep.getFigure().getBounds().getSize();
				
				setNodeMetrics(n, new Rectangle(position.x, position.y,size.width, size.height));
				editPartToNodeDict.put(ep, n);
				nodes.add(n);
				// questa è la chiamata ricorsiva che si fa se hasChildren==true
				if (hasChildren) {
					build_nodes(gep.getChildren(), editPartToNodeDict, (Subgraph) n);
				}
			}
		}
		return nodes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmf.runtime.diagram.ui.providers.internal.DefaultProvider#createGraphLayout()
	 */
	protected DirectedGraphLayout createGraphLayout() {
		return new CompositeDirectedGraphLayout();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmf.runtime.diagram.ui.providers.internal.DefaultProvider#createNodeChangeBoundCommands(org.eclipse.draw2d.graph.DirectedGraph,
	 *      org.eclipse.draw2d.geometry.Point)
	 */
	protected Command createNodeChangeBoundCommands(DirectedGraph g) {
		CompoundCommand cc = new CompoundCommand(""); //$NON-NLS-1$
		NodeList list = new NodeList();
		NodeList subGraphs = ((CompoundDirectedGraph) g).nodes;
		list.addAll(subGraphs);
		for (Iterator iter = subGraphs.iterator(); iter.hasNext();) {
			Node element = (Node) iter.next();
			if (element instanceof Subgraph)
				list.addAll(getAllMembers((Subgraph) element));
		}
		createSubCommands(list.listIterator(), cc);
		if (cc.isEmpty())
			return null;
		return cc;
	}

	private Collection getAllMembers(Subgraph element) {
		NodeList list = new NodeList();
		list.addAll(element.members);
		for (Iterator iter = element.members.iterator(); iter.hasNext();) {
			Node node = (Node) iter.next();
			if (node instanceof Subgraph)
				list.addAll(getAllMembers((Subgraph) node));
		}
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmf.runtime.diagram.ui.providers.internal.DefaultProvider#getNodeMetrics(org.eclipse.draw2d.graph.Node)
	 */

	protected Rectangle getNodeMetrics(Node n) {
		Rectangle rect = null;
		if (n.getParent() instanceof VirtualNode) {
			Node parent = n.getParent();
			rect = new Rectangle(n.x + parent.x, n.y + parent.y, n.width,
					n.height);
		} else
			rect = new Rectangle(n.x, n.y, n.width, n.height);
		return translateFromGraph(rect);
	}

	protected void postProcessGraph(DirectedGraph g,
			Hashtable editPartToNodeDict) {
		// default do nothing
	}

	/**
	 * @param gep
	 * @return
	 */
	protected boolean hasChildren(IGraphicalEditPart gep) {
		List children = gep.getChildren();
		boolean hasChildren = false;
		if (!children.isEmpty()) {
			for (Iterator iter = children.iterator(); iter.hasNext()
					&& !hasChildren;) {
				Object element = iter.next();
				if (!(element instanceof IBorderItemEditPart)
						&& (element instanceof ShapeEditPart || element instanceof ShapeCompartmentEditPart)) {
					hasChildren = true;
				} else
					hasChildren = hasChildren((IGraphicalEditPart) element);
			}
		}
		return hasChildren;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmf.runtime.diagram.ui.providers.internal.DefaultProvider#createGraph()
	 */
	protected DirectedGraph createGraph() {
		return new CompoundDirectedGraph();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmf.runtime.diagram.ui.providers.internal.DefaultProvider#shouldHandleConnectableListItems()
	 */
	protected boolean shouldHandleConnectableListItems() {
		return true;
	}

	/**
	 * @return the <code>IMapMode</code> that maps coordinates from device to
	 *         logical and vice-versa.
	 */
	protected IMapMode getMapMode() {
		return mm;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmf.runtime.common.core.service.IProvider#provides(org.eclipse.gmf.runtime.common.core.service.IOperation)
	 */
	public boolean provides(IOperation operation) {
		//Assert.isNotNull(operation);
		
//		View cview = getContainer(operation);
//		if (cview == null)
//			return false;

		IAdaptable layoutHint = ((LayoutNodesOperation) operation).getLayoutHint();
		String layoutType = (String) layoutHint.getAdapter(String.class);
		
		return DEFAULT_LAYOUT.equals(layoutType);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmf.runtime.diagram.ui.services.layout.AbstractLayoutEditPartProvider#layoutEditParts(org.eclipse.gef.GraphicalEditPart,
	 *      org.eclipse.core.runtime.IAdaptable)
	 */
	public Command layoutEditParts(org.eclipse.gef.GraphicalEditPart containerEditPart, IAdaptable layoutHint) {
		if (containerEditPart == null) {
			InvalidParameterException ipe = new InvalidParameterException();
			Trace.throwing(DiagramProvidersPlugin.getInstance(),
					DiagramProvidersDebugOptions.EXCEPTIONS_THROWING,
					getClass(), "layout()", //$NON-NLS-1$
					ipe);
			throw ipe;
		}

		mm = MapModeUtil.getMapMode(containerEditPart.getFigure());
		
		// setup graph
		DirectedGraph g = createGraph();
		
		build_graph(g, containerEditPart.getChildren()); //fazer aqui o Graph do Zest, poupo um ciclo
		//HERE				
		
		Shell shell = new Shell(Display.getCurrent());
		shell.setText("GraphSnippet1");		
		shell.setSize(1024, 648);
		
		Graph gg = new Graph(shell, SWT.None);
		gg.setSize(200, 200);		
//		shell.open();
		Iterator<Edge> itE = g.edges.iterator();
		
		HashMap<Node,Boolean> position = new HashMap<Node,Boolean>(g.nodes.size());
		Boolean lastPosition = true;
		HashMap<Node,GraphNode> parsed = new HashMap<Node,GraphNode>(g.nodes.size());
		
		ArrayList<LayoutEntity> le = new ArrayList<LayoutEntity>();
		ArrayList<LayoutRelationship> lr = new ArrayList<LayoutRelationship>();
		
		ArrayList<LayoutEntity> rle = new ArrayList<LayoutEntity>();
		ArrayList<LayoutRelationship> rlr = new ArrayList<LayoutRelationship>();
				
		ArrayList<LayoutEntity> leE = new ArrayList<LayoutEntity>();
		ArrayList<LayoutRelationship> lrE = new ArrayList<LayoutRelationship>();
		
		int c_e = 0, c_r = 0;		
		int count_entities = 1;
		int count_attributes = 0;
		boolean left = true;
		Iterator<Node> itN = g.nodes.iterator();		
		Node n = itN.next();
		GraphNode gn = new GraphNode(gg, SWT.None, n.data);
		le.add(gn.getLayoutEntity());
		rle.add(gn.getLayoutEntity());
		Iterator<Edge> itNEdges = n.outgoing.iterator();
		//GraphConnection gC = new GraphConnection(gg, SWT.NONE, ggNs, ggNt);
		while (itNEdges.hasNext()) {
			Edge e = itNEdges.next();
			if (left) { //search all for leaf
				ArrayList<GraphNode> all = searchBreath(gg,e);
				HashMap<ShapeNodeEditPart,GraphNode> hn = new HashMap<ShapeNodeEditPart,GraphNode>();
				hn.put((ShapeNodeEditPart) gn.getData(), gn);
				for(GraphNode lee : all) {
					hn.put((ShapeNodeEditPart) lee.getData(), lee);
					le.add(lee.getLayoutEntity());
				}
				ArrayList<LayoutRelationship> all_lr = searchBreathEdges(gg,e,hn);
				for(LayoutRelationship li : all_lr) {
					lr.add(li);
				}				
			} else {
				ArrayList<GraphNode> all = searchBreath(gg,e);
				HashMap<ShapeNodeEditPart,GraphNode> hn = new HashMap<ShapeNodeEditPart,GraphNode>();
				hn.put((ShapeNodeEditPart) gn.getData(), gn);
				for(GraphNode lee : all) {
					hn.put((ShapeNodeEditPart) lee.getData(), lee);
					rle.add(lee.getLayoutEntity());
				}
				ArrayList<LayoutRelationship> all_lr = searchBreathEdges(gg,e,hn);
				for(LayoutRelationship li : all_lr) {
					rlr.add(li);
				}
			}
			left = !left;
		}		
		
		Dimension d = ActiveDiagram.getActiveEditor().getDiagramEditPart().getViewport().getSize();
		applyMindMapLayout(count_entities,count_attributes,le,lr,rle,rlr,leE,lrE,d.width,d.height);	
		g.nodes.clear();
		g.edges.clear();		
		Iterator<Object> itc = gg.getConnections().iterator();
		int padding = d.width()/2;
		while (itc.hasNext()) {
			GraphConnection gc = (GraphConnection) itc.next();
			GraphNode gns = gc.getSource();
			GraphNode gnd = gc.getDestination();
			Node sourceNode = new Node(gns.getData());
			Node targetNode = (new Node(gnd.getData()));
			
			sourceNode.x = gns.getLocation().x()+padding;
			sourceNode.y = gns.getLocation().y();
			
			targetNode.x = gnd.getLocation().x()+padding;
			targetNode.y = gnd.getLocation().y();
			
			g.nodes.add(sourceNode);
			g.nodes.add(targetNode);
			g.edges.add(new Edge(gc.getData(), sourceNode, targetNode));
		}
		//createGraphLayout().visit(g);
		
		// update the diagram based on the graph
		Command cmd = update_diagram(containerEditPart, g, false);

		// reset mm mapmode to avoid memory leak
		minX = -1;
		minY = -1;
		layoutDefaultMargin = 0;
		mm = null;
		
		return cmd;
	}
	private ArrayList<GraphNode> searchBreath(Graph gg, Edge e) {
		ArrayList<Edge> toSearch = new ArrayList<Edge>();
		ArrayList<GraphNode> result_nodes = new ArrayList<GraphNode>();				
		toSearch.add(e);
		while (!toSearch.isEmpty()) {
			Edge edge = toSearch.remove(0);
			Node node = edge.target;
			GraphNode gs = new GraphNode(gg, SWT.None, node.data);
			result_nodes.add(gs);			
			Iterator<Edge> itOut = node.outgoing.iterator();
			while (itOut.hasNext()) {
				Edge outE = itOut.next();
				toSearch.add(outE);								
			}
		}		
		return result_nodes;
	}
	private ArrayList<LayoutRelationship> searchBreathEdges(Graph gg, Edge e, HashMap<ShapeNodeEditPart,GraphNode> gns) {
		ArrayList<Edge> toSearch = new ArrayList<Edge>();		
		ArrayList<LayoutRelationship> result_edges = new ArrayList<LayoutRelationship>();		
		toSearch.add(e);
		while (!toSearch.isEmpty()) {
			Edge edge = toSearch.remove(0);
			Node node = edge.target;
			GraphNode gs = gns.get(edge.source.data);
			GraphNode gt = gns.get(edge.target.data);						
			GraphConnection gc = new GraphConnection(gg, SWT.NONE, gs, gt);
			result_edges.add(gc.getLayoutRelationship());
			Iterator<Edge> itOut = node.outgoing.iterator();
			while (itOut.hasNext()) {
				Edge outE = itOut.next();
				toSearch.add(outE);								
			}
		}		
		return result_edges;
	}
	private void applyMindMapLayout(int totalEntities, int totalLeafs, 
		ArrayList<LayoutEntity> leftLentities, ArrayList<LayoutRelationship> leftLrelation,
		ArrayList<LayoutEntity> rightLentities, ArrayList<LayoutRelationship> rightLrelation,
		ArrayList<LayoutEntity> leE, ArrayList<LayoutRelationship> lrE, int width, int height) {		
		
		HorizontalTreeLayoutAlgorithm rightLa = new HorizontalTreeLayoutAlgorithm();
		LeftHorizontalTreeLayoutAlgorithm leftLa = new LeftHorizontalTreeLayoutAlgorithm();
		HorizontalTreeLayoutAlgorithm lay_enums = new HorizontalTreeLayoutAlgorithm();
//		la.setRangeToLayout(-Math.PI/3, Math.PI+Math.PI/3);		
//		la.setEntityAspectRatio(2);				
		
		int left_offset = 0;
		int top_offset = 0;			
		try {			
			rightLa.applyLayout((LayoutEntity[])rightLentities.toArray(new LayoutEntity[0]), (LayoutRelationship[])rightLrelation.toArray(new LayoutRelationship[0]), left_offset, top_offset, width/2, height, false, false);						
			leftLa.applyLayout((LayoutEntity[])leftLentities.toArray(new LayoutEntity[0]), (LayoutRelationship[])leftLrelation.toArray(new LayoutRelationship[0]), left_offset, top_offset, width/2, height, false, false);
			//lay_enums.applyLayout((LayoutEntity[])leE.toArray(new LayoutEntity[0]), (LayoutRelationship[])lrE.toArray(new LayoutRelationship[0]), 0, 0, 250, width, false, false);
		} catch (InvalidLayoutConfiguration e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmf.runtime.diagram.ui.services.layout.AbstractLayoutEditPartProvider#layoutEditParts(java.util.List,
	 *      org.eclipse.core.runtime.IAdaptable)
	 */
	public Command layoutEditParts(List selectedObjects, IAdaptable layoutHint) {

		if (selectedObjects.size() == 0) {
			return null;
		}

		// get the container edit part for the children
		GraphicalEditPart editPart = (GraphicalEditPart) selectedObjects.get(0);
		GraphicalEditPart containerEditPart = (GraphicalEditPart) editPart
				.getParent();

		mm = MapModeUtil.getMapMode(containerEditPart.getFigure());

		DirectedGraph g = createGraph();
		build_graph(g, selectedObjects);
		createGraphLayout().visit(g);
		// update the diagram based on the graph
		Command cmd = update_diagram(containerEditPart, g, true);

		// reset mm mapmode to avoid memory leak
		mm = null;
		return cmd;
	}

	/**
	 * layoutTopDown Utility function that is commonly subclasses by domain
	 * specific layouts to determine whether a specific connection type is layed
	 * out in a top down manner.
	 * 
	 * @param poly
	 *            <code>ConnectionEditPart</code> to determine whether it is
	 *            to be layed out in a top-down fashion.
	 * @return true if connection is to be layed out top-down, false otherwise.
	 */
	protected boolean layoutTopDown(ConnectionEditPart poly) {
		// se è false gli archi puntano verso il basso altrimenti gli archi
		// hanno la punta verso l'alto
		return false;
	}

	/**
	 * setNodeMetrics Sets the extend and position into the node object. Defined
	 * as abstract to allow subclasses to implement to perform a transformation
	 * on the values stored in the node. i.e. support for Left-Right layout as
	 * opposed to Top-Down.
	 * 
	 * @param n
	 *            Node that will receive the metrics values to be set.
	 * @param r
	 *            Rectangle that represents the location and extend of the Node.
	 */
	final protected void setNodeMetrics(Node n, Rectangle r) {
		Rectangle rectGraph = translateToGraph(r);
		n.x = rectGraph.x;
		n.y = rectGraph.y;
		n.width = rectGraph.width;
		n.height = rectGraph.height;
	}

	/**
	 * build_edges Method to build up the edges in the temporary Graph structure
	 * which the algorithm is executed on.
	 * 
	 * selectedObjects List of selected objects to be layed out.
	 * 
	 * @param editPartToNodeDict
	 *            Map of editparts from the GEF to the temporary Nodes used for
	 *            layout.
	 * @return EdgeList list of Edges that is passed to the graph structure.
	 */
	@SuppressWarnings("unchecked")
	protected EdgeList build_edges(List selectedObjects, Map editPartToNodeDict) {

		EdgeList edges = new EdgeList();

		// Do "topdown" relationships first. Since they traditionally
		// go upward on a diagram, they are reversed when placed in the graph
		// for
		// layout. Also, layout traverses the arcs from each node in the order
		// of their insertion when finding a spanning tree for its constructed
		// hierarchy. Therefore, arcs added early are less likely to be
		// reversed.
		// In fact, since there are no cycles in these arcs, adding
		// them to the graph first should guarantee that they are never
		// reversed,
		// i.e., the inheritance hierarchy is preserved graphically.
		ArrayList objects = new ArrayList();
		objects.addAll(selectedObjects);
		ListIterator li = objects.listIterator();
		ArrayList notTopDownEdges = new ArrayList();
		boolean shouldHandleListItems = shouldHandleConnectableListItems();
		while (li.hasNext()) {
			EditPart gep = (EditPart) li.next();
			if (gep instanceof ConnectionEditPart) {
				ConnectionEditPart poly = (ConnectionEditPart) gep;

				if (layoutTopDown(poly)) {
					EditPart from = poly.getSource();
					EditPart to = poly.getTarget();
					if (from instanceof IBorderItemEditPart)
						from = from.getParent();
					else if (shouldHandleListItems && from instanceof ListItemEditPart)
						from = getFirstAnscestorinNodesMap(from,editPartToNodeDict);
					if (to instanceof IBorderItemEditPart)
						to = to.getParent();
					else if (shouldHandleListItems && to instanceof ListItemEditPart)
						to = getFirstAnscestorinNodesMap(to, editPartToNodeDict);
					Node fromNode = (Node) editPartToNodeDict.get(from);
					Node toNode = (Node) editPartToNodeDict.get(to);

					if (fromNode != null && toNode != null && !fromNode.equals(toNode)) {
						addEdge(edges, poly, toNode, fromNode);
					}
				} else {
					notTopDownEdges.add(poly);
				}
			}
		}

		// third pass for all other connections
		li = notTopDownEdges.listIterator();
		while (li.hasNext()) {
			ConnectionEditPart poly = (ConnectionEditPart) li.next();
			EditPart from = poly.getSource();
			EditPart to = poly.getTarget();
			if (from instanceof IBorderItemEditPart)
				from = from.getParent();
			else if (shouldHandleListItems && from instanceof ListItemEditPart)
				from = getFirstAnscestorinNodesMap(from, editPartToNodeDict);
			if (to instanceof IBorderItemEditPart)
				to = to.getParent();
			else if (shouldHandleListItems && to instanceof ListItemEditPart)
				to = getFirstAnscestorinNodesMap(to, editPartToNodeDict);
			Node fromNode = (Node) editPartToNodeDict.get(from);
			Node toNode = (Node) editPartToNodeDict.get(to);

			if (fromNode != null && toNode != null && !fromNode.equals(toNode)) {
				// non aggiunge gli archi che hanno lo stesso sorgente e lo
				// stesso destinatario
				addEdge(edges, poly, fromNode, toNode);
			}
		}
		return edges;
	}

	/**
	 * @param edges
	 * @param gep
	 * @param fromNode
	 * @param toNode
	 */
	private void addEdge(EdgeList edges, ConnectionEditPart connectionEP, Node fromNode, Node toNode) {
		Edge edge = new Edge(connectionEP, fromNode, toNode);
//		initializeEdge(connectionEP, edge);

		edges.add(edge);
	}

	/**
	 * initializeEdge Method used as a hook to initialize the Edge layout
	 * object. LayoutProvider subclasses may wish to initialize the edge
	 * different to customize the layout for their diagram domain.
	 * 
	 * @param connectionEP
	 *            EditPart used as a seed to initialize the edge properties
	 * @param edge
	 *            Edge to initialize with default values for the layout
	 */
	@SuppressWarnings("unchecked")
	protected void initializeEdge(ConnectionEditPart connectionEP, Edge edge) {
		List affectingChildren = getAffectingChildren(connectionEP);

		// set the padding based on the extent of the children.
//		edge.setPadding(Math.max(edge.getPadding(), calculateEdgePadding(connectionEP, affectingChildren)));
//		edge.setDelta(Math.max(edge.getDelta(), affectingChildren.size() / 2));
	}

	/**
	 * Calculates the edge padding needed to initialize edge with. Uses the
	 * number of children as a factor in determine the dynamic padding value.
	 */
	@SuppressWarnings("unchecked")
	private int calculateEdgePadding(ConnectionEditPart connectionEP,
			List affectingChildren) {
		ListIterator li = affectingChildren.listIterator();

		int padding = 0;

		// union the children widths
		while (li.hasNext()) {
			GraphicalEditPart gep = (GraphicalEditPart) li.next();

			padding = Math.max(padding, Math.max(
					gep.getFigure().getBounds().width, gep.getFigure()
							.getBounds().height));
		}

		Rectangle.SINGLETON.x = 0;
		Rectangle.SINGLETON.y = 0;
		Rectangle.SINGLETON.width = padding;
		Rectangle.SINGLETON.height = padding;
		return Math.min(Math.max(Math
				.round(translateToGraph(Rectangle.SINGLETON).width * 1.5f),
				MIN_EDGE_PADDING), MAX_EDGE_PADDING);
	}

	/**
	 * Retrieve the associated children from the given connection editpart that
	 * will affect the layout.
	 * 
	 * @param conn
	 *            the <code>ConnectionEditPart</code> to retrieve the children
	 *            from
	 * @return a <code>List</code> that contains
	 *         <code>GraphicalEditPart</code> objects
	 */
	private List getAffectingChildren(ConnectionEditPart conn) {
		List children = conn.getChildren();
		ListIterator lli = children.listIterator();
		List affectingChildrenList = new ArrayList();
		while (lli.hasNext()) {
			Object obj = lli.next();
			if (obj instanceof GraphicalEditPart) {
				GraphicalEditPart lep = (GraphicalEditPart) obj;
				Rectangle lepBox = lep.getFigure().getBounds().getCopy();

				if (!lep.getFigure().isVisible() || lepBox.width == 0
						|| lepBox.height == 0)
					continue;

				affectingChildrenList.add(lep);
			}
		}
		return affectingChildrenList;
	}

	/**
	 * getRelevantConnections Given the editpart to Nodes Map this will
	 * calculate the connections in the diagram that are important to the
	 * layout.
	 * 
	 * @param editPartToNodeDict
	 *            Hashtable of editparts from the GEF to the temporary Nodes
	 *            used for layout.
	 * @return List of ConnectionEditPart that are to be part of the layout
	 *         routine.
	 */
	protected List getRelevantConnections(Hashtable editPartToNodeDict) {
		Enumeration enumeration = editPartToNodeDict.keys();
		ArrayList connectionsToMove = new ArrayList();
		while (enumeration.hasMoreElements()) {
			Object e = enumeration.nextElement();
			GraphicalEditPart shapeEP = (GraphicalEditPart) e;
			Set sourceConnections = new HashSet(shapeEP.getSourceConnections());
			if (shapeEP instanceof IBorderedShapeEditPart) {
				List borderItems = getBorderItemEditParts(shapeEP);
				for (Iterator iter = borderItems.iterator(); iter.hasNext();) {
					GraphicalEditPart element = (GraphicalEditPart) iter.next();
					sourceConnections.addAll(element.getSourceConnections());
				}
			}

			for (Iterator iter = sourceConnections.iterator(); iter.hasNext();) {
				ConnectionEditPart connectionEP = (ConnectionEditPart) iter
						.next();
				EditPart target = connectionEP.getTarget();
				// check to see if the toView is in the shapesDict, if yes,
				// the associated connectionView should be included on graph
				if (target instanceof IBorderItemEditPart)
					target = target.getParent();
				Object o = editPartToNodeDict.get(target);
				if (o != null) {
					connectionsToMove.add(connectionEP);
				}
			}

			if (shouldHandleConnectableListItems()) {
				handleConnectableListItems(shapeEP, editPartToNodeDict,
						connectionsToMove);
			}
		}

		return connectionsToMove;
	}

	private void handleConnectableListItems(GraphicalEditPart shapeEP,
			Map editPartToNodeDict, ArrayList connectionsToMove) {
		List children = shapeEP.getChildren();
		for (Iterator iter = children.iterator(); iter.hasNext();) {
			EditPart ep = (EditPart) iter.next();
			if (ep instanceof ListCompartmentEditPart) {
				List listItems = ep.getChildren();
				for (Iterator iterator = listItems.iterator(); iterator
						.hasNext();) {
					GraphicalEditPart listItem = (GraphicalEditPart) iterator
							.next();
					List connections = listItem.getSourceConnections();
					for (Iterator connectionIterator = connections.iterator(); connectionIterator
							.hasNext();) {
						ConnectionEditPart connectionEP = (ConnectionEditPart) connectionIterator
								.next();
						EditPart ancestor = getFirstAnscestorinNodesMap(
								connectionEP.getTarget(), editPartToNodeDict);
						if (ancestor != null)
							connectionsToMove.add(connectionEP);
					}
				}
			}

		}

	}

	private EditPart getFirstAnscestorinNodesMap(EditPart editPart,
			Map editPartToNodeDict) {
		EditPart ancestor = editPart;
		while (ancestor != null) {
			if (editPartToNodeDict.get(ancestor) != null)
				return ancestor;
			ancestor = ancestor.getParent();
		}
		return null;
	}

	/**
	 * This method searches an edit part for a child that is a border item edit
	 * part
	 * 
	 * @param parent
	 *            part needed to search
	 * @param set
	 *            to be modified of border item edit parts that are direct
	 *            children of the parent
	 */
	private List getBorderItemEditParts(EditPart parent) {
		Iterator iter = parent.getChildren().iterator();
		List list = new ArrayList();
		while (iter.hasNext()) {
			EditPart child = (EditPart) iter.next();
			if (child instanceof IBorderItemEditPart) {
				list.add(child);
			}
		}
		return list;
	}

	/**
	 * Method build_graph. This method will build the proxy graph that the
	 * layout is based on.
	 * 
	 * @param g
	 *            DirectedGraph structure that will be populated with Nodes and
	 *            Edges in this method.
	 * @param selectedObjects
	 *            List of editparts that the Nodes and Edges will be calculated
	 *            from.
	 */
	protected void build_graph(DirectedGraph g, List selectedObjects) {
		Hashtable editPartToNodeDict = new Hashtable(500);
		NodeList nodes = build_nodes(selectedObjects, editPartToNodeDict, null);
		// append edges that should be added to the graph
		ArrayList objects = new ArrayList();
		objects.addAll(selectedObjects);
		objects.addAll(getRelevantConnections(editPartToNodeDict));
		EdgeList edges = build_edges(objects, editPartToNodeDict);
		g.nodes = nodes;
		g.edges = edges;
		postProcessGraph(g, editPartToNodeDict);
		// printGraph(g);
	}

	/**
	 * reverse Utility function to reverse the order of points in a list.
	 * 
	 * @param c
	 *            PointList that is passed to the routine.
	 * @param rc
	 *            PointList that is reversed.
	 */
	private void reverse(PointList c, PointList rc) {
		rc.removeAllPoints();

		for (int i = c.size() - 1; i >= 0; i--) {
			rc.addPoint(c.getPoint(i));
		}
	}

	/**
	 * Method update_diagram. Once the layout has been calculated with the GEF
	 * graph structure, the new layout values need to be propogated into the
	 * diagram. This is accomplished by creating a compound command that
	 * contains sub commands to change shapes positions and connection
	 * bendpoints positions. The command is subsequently executed by the calling
	 * action and then through the command infrastructure is undoable and
	 * redoable.
	 * 
	 * @param diagramEP
	 *            IGraphicalEditPart container that is target for the commands.
	 * @param g
	 *            DirectedGraph structure that contains the results of the
	 *            layout operation.
	 * @param isLayoutForSelected
	 *            boolean indicating that the layout is to be performed on
	 *            selected objects only. At this stage this is relevant only to
	 *            calculate the offset in the diagram where the layout will
	 *            occur.
	 * @return Command usually a command command that will set the locations of
	 *         nodes and bendpoints for connections.
	 */
	protected Command update_diagram(org.eclipse.gef.GraphicalEditPart diagramEP, DirectedGraph g, boolean isLayoutForSelected) {

		CompoundCommand cc = new CompoundCommand(""); //$NON-NLS-1$
		
		Command cmd = createNodeChangeBoundCommands(g);
		if (cmd != null)
			cc.add(cmd);
		
		return cc;
	}

	protected void createSubCommands(ListIterator vi, CompoundCommand cc) {
		// Now set the position of the icons. This causes the
		// arc connection points to be recalculated
		while (vi.hasNext()) {
			Node node = (Node) vi.next();
			if (node.data instanceof ShapeEditPart) {
				IGraphicalEditPart gep = (IGraphicalEditPart) node.data;

				ChangeBoundsRequest request = new ChangeBoundsRequest(RequestConstants.REQ_MOVE);
				Rectangle nodeExt = getNodeMetrics(node);
				Point ptLocation = new Point(nodeExt.x, nodeExt.y);

				Point ptOldLocation = gep.getFigure().getBounds().getLocation();
				gep.getFigure().translateToAbsolute(ptOldLocation);

				gep.getFigure().translateToAbsolute(ptLocation);
				Dimension delta = ptLocation.getDifference(ptOldLocation);

				request.setEditParts(gep);
				request.setMoveDelta(new Point(delta.width, delta.height));
				request.setLocation(ptLocation);

				Command cmd = gep.getCommand(request);
				if (cmd != null && cmd.canExecute())
					cc.add(cmd);
			}
		}
	}
}