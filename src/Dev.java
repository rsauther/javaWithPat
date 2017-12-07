
public class Dev extends Employee implements IEmployee{
	
	protected String mName;
	protected String mTitle;
	
	
	public Dev(String n, String t){
		super(n,t);
		//System.out.println("info: Creating a Dev Employee");			
		}


	@Override
	public String getTasks() {
		return "Dev Task";
	}

	@Override
	public String getRole() {
		return "Devolopement";
	}

}