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


import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import mmclass.Entity;
import mmclass.MmclassFactory;
import mmclass.diagram.edit.parts.MmclassEditPartFactory;
import mmclass.diagram.part.ValidateAction;
import mmclass.impl.EntityImpl;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplate;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.egl.exceptions.EglRuntimeException;
import org.eclipse.epsilon.egl.traceability.Template;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import UTIL.ActiveDiagram;

/**
 * This example demonstrates using the 
 * Epsilon Generation Language, the M2T language
 * of Epsilon, in a stand-alone manner 
 * @author Dimitrios Kolovos
 */
public class ToJavaStandalone extends EpsilonStandaloneExample {
	
	public static void main(String[] args) throws Exception {
		new ToJavaStandalone().execute();
	}
	@Override 
	public void execute() throws Exception {				
//		EglFileGeneratingTemplateFactory genModule;
//		EglFileGeneratingTemplate t;
		
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
		postProcess();
		
		module.getContext().getModelRepository().dispose();
	}	

	@Override
	public List<IModel> getModels() throws Exception {
		List<IModel> models = new ArrayList<IModel>();
		//ligar ao que ta no projecto
		models.add(createEmfModel("MMClass", " ", "MindMapDomainModel.ecore", true, true));		
		return models;
	}

	@Override	
	public String getSource() throws Exception {
		return "MMClass2Java.egl";
	}

//	@Override
//	public void postProcess() {						    
//		IWorkspaceRoot rootWorkspace = ResourcesPlugin.getWorkspace().getRoot();		 
//		String currentProjectName = ActiveDiagram.getCurrenProject();
//		IProject project = rootWorkspace.getProject(currentProjectName);
//		try {
//			project.refreshLocal(IResource.DEPTH_ONE, null);
//		} catch (CoreException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////		IFile file = null;		 
////		try {		 
////		    // The null parameters are going to be
////		    // replaced with IProgressMonitors eventually
////		    //project.create(null);
////		 
////		    // I have to open the project in order to create files 
////		    //project.open(null);		 
////		    // This call gives me my instance of IFile I was needing
////		    file = project.getFile("Java.java");		    
////		    // It's not enough to just have an instance of IFile.
////		    // If I don't create the file, I get an error when
////		    // I try to open it in an editor later
////		    if (!file.exists()) {
////		    	file.create(source, IResource.FORCE, null);
////		    } else {
////		    	file.delete(true, null);
////		    	file.create(source, IResource.FORCE, null);
////		    }
////		 
////		} catch (CoreException e1) {
////		    e1.printStackTrace();
////		}
////		IFile fileToBeOpened = (file);
////		IEditorInput editorInput = new FileEditorInput(fileToBeOpened);
////		IWorkbenchWindow window= PlatformUI.getWorkbench().getActiveWorkbenchWindow();
////		IWorkbenchPage page = window.getActivePage();
////		try {
////			page.openEditor(editorInput, "org.eclipse.ui.DefaultTextEditor");
////		} catch (PartInitException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}  	
//	}
}
