
public class Product extends Employee implements IEmployee{
	
	protected String mName;
	protected String mTitle;
	
	
	public Product(String n, String t){
		super(n,t);
		//System.out.println("info: Creating a Product Employee");			
		}


	@Override
	public String getTasks() {
		return "Write stories";
	}

	@Override
	public String getRole() {
		return "Product";
	}

}