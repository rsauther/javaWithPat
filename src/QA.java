
public class QA extends Employee implements IEmployee{
	
	protected String mName;
	protected String mTitle;
	

	
	public QA(String n, String t){
		super(n,t);
		//System.out.println("info: Creating a QA Employee");			
		}


	@Override
	public String getTasks() {
		return "Testing";	
	}

	
	@Override
	public String getRole() {
		return "Quality Assurance";
	}

}