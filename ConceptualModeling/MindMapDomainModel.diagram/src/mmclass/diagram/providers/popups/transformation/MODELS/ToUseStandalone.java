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
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
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
public class ToUseStandalone extends EpsilonStandaloneExample {
	
	public static void main(String[] args) throws Exception {
		new ToUseStandalone().execute();
	}
	
//	@Override
//	public IEolExecutableModule createModule() {
//		return new EglTemplateFactoryModuleAdapter(new EglTemplateFactory());
//	}

	@Override
	public List<IModel> getModels() throws Exception {
		List<IModel> models = new ArrayList<IModel>();
		//ligar ao que ta no projecto
		models.add(createEmfModel("MMClass", " ", "MindMapDomainModel.ecore", true, true));
		return models;
	}

	@Override
	
	public String getSource() throws Exception {
		return "MMClass2Use.egl";
	}

//	@Override
//	public void postProcess() {		
////		System.out.println(result);
//		// some string that represents the text I retrieved from the database.		
//		String fileContents = result+""; 
//		// The InputStream created here is used as a parameter to the 
//		// IFile.create() method which is called later on in this code
//		// There is probably a better way to get the InputStream, but 
//		// that's not the problem I'm trying to solve right now.
//		InputStream source = new ByteArrayInputStream(fileContents.getBytes());		    	
//		IWorkspaceRoot rootWorkspace = ResourcesPlugin.getWorkspace().getRoot();		 
//		// Next I must create the project and the file.		 
//		// This is the part that I was giving me all the grief
//		// it just never dawned on me that the existence of a 
//		// project was a prerequisite for the existence of a file
//		String currentProjectName = ActiveDiagram.getCurrenProject();
//		IProject project = rootWorkspace.getProject(currentProjectName);
//		IFile file = null;		 
//		try {		 
//		    // The null parameters are going to be
//		    // replaced with IProgressMonitors eventually
//		    //project.create(null);
//		 
//		    // I have to open the project in order to create files 
//		    //project.open(null);		 
//		    // This call gives me my instance of IFile I was needing
//		    file = project.getFile("transformation.use");		    
//		    // It's not enough to just have an instance of IFile.
//		    // If I don't create the file, I get an error when
//		    // I try to open it in an editor later
//		    if (!file.exists()) {
//		    	file.create(source, IResource.FORCE, null);
//		    } else {
//		    	file.delete(true, null);
//		    	file.create(source, IResource.FORCE, null);
//		    }
//		 
//		} catch (CoreException e1) {
//		    e1.printStackTrace();
//		}
//		IFile fileToBeOpened = (file);
//		IEditorInput editorInput = new FileEditorInput(fileToBeOpened);
//		IWorkbenchWindow window= PlatformUI.getWorkbench().getActiveWorkbenchWindow();
//		IWorkbenchPage page = window.getActivePage();
//		try {
//			page.openEditor(editorInput, "org.eclipse.ui.DefaultTextEditor");
//		} catch (PartInitException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  	
//	}
}
