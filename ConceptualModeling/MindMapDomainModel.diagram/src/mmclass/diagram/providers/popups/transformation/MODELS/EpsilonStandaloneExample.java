package mmclass.diagram.providers.popups.transformation.MODELS;
/*******************************************************************************
 * Copyright (c) 2008 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 ******************************************************************************/


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;


import mmclass.diagram.part.MmclassDiagramEditor;
import mmclass.diagram.part.MmclassDiagramEditorPlugin;
import mmclass.impl.MindMapModelImpl;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.egl.exceptions.EglRuntimeException;
import org.eclipse.epsilon.emc.emf.EmfModel;

import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;

import UTIL.ActiveDiagram;

public abstract class EpsilonStandaloneExample {

	protected String TRANSFORMATION_PATH = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString()+"/"+ActiveDiagram.getCurrenProject()+"/";
	protected String FOLDER_PATH = "transformations/";

	protected IEolExecutableModule module;

	protected Object result;

	public abstract String getSource() throws Exception;

	public abstract List<IModel> getModels() throws Exception;

	public void postProcess() {						    
		IWorkspaceRoot rootWorkspace = ResourcesPlugin.getWorkspace().getRoot();		 
		String currentProjectName = ActiveDiagram.getCurrenProject();
		IProject project = rootWorkspace.getProject(currentProjectName);
		try {
			project.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void preProcess() {};

	public IEolExecutableModule createModule() {
		EglFileGeneratingTemplateFactory tf = new EglFileGeneratingTemplateFactory();
		try {
			//tf.setOutputRoot("/Users/antoniosilva/Desktop/"); //Meter path correcta
			removeFolder();
			tf.setOutputRoot(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString()+"/"+ActiveDiagram.getCurrenProject()+"/");
		} catch (EglRuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new EglTemplateFactoryModuleAdapter(tf);
	}

	public void removeFolder() {
		File directory = null;
		if (this instanceof ToJavaStandalone) {
			directory = new File(this.TRANSFORMATION_PATH+this.FOLDER_PATH+"/classes");
		} else if (this instanceof ToUseStandalone) {
			directory = new File(this.TRANSFORMATION_PATH+this.FOLDER_PATH+"/use");
		} else {
			directory = new File(this.TRANSFORMATION_PATH+this.FOLDER_PATH+"/database");
		}		
		deleteDir(directory);    	
	}	

	public void execute() throws Exception {

		module = createModule();
		module.parse(getFile(getSource()));

		if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}
			System.exit(-1);
		}

		for (IModel model : getModels()) {
			module.getContext().getModelRepository().addModel(model);
		}

		preProcess();
		result = execute(module);
		//		postProcess();

		module.getContext().getModelRepository().dispose();
	}

	protected Object execute(IEolExecutableModule module) throws EolRuntimeException {
		return module.execute();
	}

	protected EmfModel createEmfModel(String name, String model, String metamodel, boolean readOnLoad, boolean storeOnDisposal)  throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI,getFile(metamodel).toURI().toString());
		properties.put(EmfModel.PROPERTY_MODEL_URI, getModelFile(model).toURI().toString());
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		emfModel.load(properties, null);
		return emfModel;
	}

	//	protected EmfModel createEmfModelByURI(String name, String model, 
	//			String metamodel, boolean readOnLoad, boolean storeOnDisposal) 
	//					throws EolModelLoadingException, URISyntaxException {
	//		EmfModel emfModel = new EmfModel();
	//		StringProperties properties = new StringProperties();
	//		properties.put(EmfModel.PROPERTY_NAME, name);
	//		properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodel);
	//		properties.put(EmfModel.PROPERTY_MODEL_URI, getModelFile(model).toURI().toString());
	//		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
	//		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
	//		emfModel.load(properties, null);
	//		return emfModel;
	//	}

	protected File getModelFile(String model) {		   
		IWorkspaceRoot rootWorkspace = ResourcesPlugin.getWorkspace().getRoot();		 		
		String currentProjectName = ActiveDiagram.getCurrenProject();
		IProject project = rootWorkspace.getProject(currentProjectName); //GetProject Name
		IFile file = null;		 			 	 

		//getting xmi file name
		MmclassDiagramEditor m = ActiveDiagram.getActiveEditor();
		DiagramEditPart dep = m.getDiagramEditPart();		
		DiagramImpl di = ((DiagramImpl) dep.getModel());
		MindMapModelImpl mmi = (MindMapModelImpl) di.getElement();		
		ResourceImpl xmiR = (ResourceImpl) mmi.eResource();

		file = project.getFile(xmiR.getURI().segment(2));

		return new File(file.getRawLocationURI());
	}

	protected File getFile(String fileName) throws URISyntaxException {		
		URI binUri = EpsilonStandaloneExample.class.getResource(fileName).toURI();
		URI uri = null;

		if (binUri.toString().indexOf("bin") > -1) {
			uri = new URI(binUri.toString().replaceAll("bin", "src"));
		}
		else {
			uri = binUri;
		}	
		URL l = null;
		try {
			l = FileLocator.resolve(uri.toURL());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		return new File(l.toURI());
		//		URI binUri = EpsilonStandaloneExample.class.getResource(fileName).toURI();
		//		URI uri = null;
		//		
		//		if (binUri.toString().indexOf("bin") > -1) {
		//			uri = new URI(binUri.toString().replaceAll("bin", "src"));
		//		}
		//		else {
		//			uri = binUri;
		//		}

		//		return new File(uri);
	}

	private static boolean deleteDir(File dir) {
		if (dir.isDirectory()) {
			String[] children = dir.list();
			for (int i = 0; i < children.length; i++) {
				boolean success = deleteDir (new File(dir, children[i]));
				if (!success) {
					return false;
				}
			}
		}
		return dir.delete();	      
	}
}
