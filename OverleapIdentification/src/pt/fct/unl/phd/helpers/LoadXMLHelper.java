package pt.fct.unl.phd.helpers;

import java.io.File;
import java.io.FilenameFilter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import pt.fct.unl.phd.managers.MergManager;
import pt.fct.unl.phd.tags.RootTag;

public class LoadXMLHelper {
	private static MergManager mergManager = new MergManager();
	
	public static RootTag readXML(File file) {
		RootTag relationalModelEntity = null;
		
		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(RootTag.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			relationalModelEntity = (RootTag) jaxbUnmarshaller.unmarshal(file);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return relationalModelEntity;
	}
	
	
	public static RootTag merg(RootTag mergMindMap, RootTag newMindMap) throws Exception{
		mergManager.mergEntitys(mergMindMap, newMindMap);
		return null;
	}

}
