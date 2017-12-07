	
public class Employee implements IEmployee{
	
	protected String mName;
	protected String mTitle;
	
	
	public Employee(String n, String t){
		//System.out.println("info: Creating an employee");		
		mName = n;
		mTitle = t;
		}


	@Override
	public String getTasks() {
		return "Employee task";
	}


	@Override
	public String getName() {
		return mName;
	}


	@Override
	public String getTitle() {
		return mTitle;
	}
	
	@Override
	public String getRole() {
		return "Employee role";
	}

}
