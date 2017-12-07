
public class Project extends Employee implements IEmployee{
	
	protected String mName;
	protected String mTitle;
	
	
	public Project(String n, String t){
		super(n,t);
		//System.out.println("info: Creating a Project Employee");			
		}


	@Override
	public String getTasks() {
		return "Scrumming";
	}


	@Override
	public String getRole() {
		return "Projet Management";
	}

}