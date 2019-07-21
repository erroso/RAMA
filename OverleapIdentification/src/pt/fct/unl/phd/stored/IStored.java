package pt.fct.unl.phd.stored;

import java.util.List;

import pt.fct.unl.phd.tags.RootTag;

public interface IStored {
	
	public void openConnection();
	
	public void closeConnection();
	
	public  void insertNode(RootTag rootTag);
	
	public void deleteNodeByDomainName(String domainName);
	
	public void updateDomain(RootTag rootTag);
	
	public RootTag getNodeByDomain(String domain);
	
	public RootTag getNodeByID(int id);
	
	public List<RootTag> getAllDomain();
	
	public List<String> getAllDomainName();

}
