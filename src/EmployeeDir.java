import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Comparison;

public class EmployeeDir {
	
	static ArrayList<Employee> eDirectory; // = new ArrayList<>();
	
	public static void main(String[] args) throws IOException { 		
		
		eDirectory = createEmployees();
		String result = null;
		while (result != "Quit"){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Command (I for instructions):");
        //System.out.println();
        String s = br.readLine();
        result = testInput(s);
        System.out.println();

		}
      }
	
	public static String testInput(String input) throws IOException{
		while (input!= null){
		//String term = null;
		if (input.equalsIgnoreCase("I")){
			System.out.println("This is an Employee Directory.");
			System.out.println("Enter L to List all of the Employees in the Directory.");
			System.out.println("Enter G to Get an Employees info.");
			System.out.println("Enter A to Add an Employee to the Directory.");
			System.out.println("Enter R to Remove an Employee from the Directory.");
			System.out.println("Enter S to Sort the Employee Directory.");
			System.out.println("Enter Q to Quit.");
			System.out.println(" ");
			return "Instructions";}
		if (input.equalsIgnoreCase("Q")){
			System.out.println("Program terminated.");
			return "Quit";}
		if (input.equalsIgnoreCase("A")){
			addEmployee();
			return "Added";}
		if (input.equalsIgnoreCase("R")){
			removeEmployee();
			return "Removed";}
		if (input.equalsIgnoreCase("L")){
			listEmployee();
			return "List";}
		if (input.equalsIgnoreCase("G")){
			getEmployee();
			return "Get";}	
		if (input.equalsIgnoreCase("S")){
			sortEmployee();
			return "Sorted";}
		System.out.println("Invalid command");
		return "Invalid Format!";
	}
		return "Null";
	}
	
	public static ArrayList<Employee> createEmployees() {		
		ArrayList<Employee> directory = new ArrayList<>();
		directory.add(new Dev("Begeima, Anton", "Mobile Developer"));
		directory.add(new QA("Sauther, Richard","Lead QA Analyst"));
		directory.add(new Product("Smith, Matt","Senior Director of Product Management"));
		directory.add(new Project("Gelinas, David","Director of Project Management"));
		directory.add(new Dev("Manchikanti, Shyam", "Mobile Developer"));
		directory.add(new Dev("Kunnemeyer, Hubert", "Mobile Developer"));
		directory.add(new Dev("Alburtus, Patrick", "Sr. Mobile Developer"));
		directory.add(new Dev("McHargue, Brandon","Lead Mobile Developer"));
		directory.add(new QA("Cox, Thomas","Mobile QA Manager"));
		directory.add(new Dev("Bhatia, Nick","Director of Mobile Engineering"));
		directory.add(new Dev("Beyer, Paul","Mobile Development Manager"));
		directory.add(new Dev("Nilsen, David","Mobile Developer"));
		directory.add(new Dev("Valcourt, Kervins","Mobile Developer"));
		directory.add(new Dev("Caldwell, Alison","Assoc. Mobile Developer"));
		directory.add(new Dev("Katta, Gurpreet","Sr. Mobile Developer"));
		directory.add(new Dev("Mokretsov, Oleksandr","Mobile Developer"));
		directory.add(new Dev("Ho, Derrick","Vendor"));
		directory.add(new Dev("Thai, David","Vendor"));
		directory.add(new QA("Tayyab, Tabassum","Lead QA Analyst"));
		directory.add(new Product("Goldstein, Jesse","Product Manager"));
		directory.add(new Product("Wohlrob, Kenneth","Assoc. Director of Product Management"));
		directory.add(new Product("Gubernick, Jay","Sr. Product Manager"));
		directory.add(new Product("Frantzis, Philip","Sr. Product Manager"));
		return directory;		
	}
	
	public static void addEmployee() throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the employee's name in the following format: LastName, FirstName");
    String name = br.readLine();
    System.out.println("Enter the employee's title:");
    String title = br.readLine();
    System.out.println("Enter the number coresponding to the employee's role:");
    System.out.println("Enter 1 for QA");
    System.out.println("Enter 2 for Project");
    System.out.println("Enter 3 for Dev");
    System.out.println("Enter 4 for Product");
    String role = br.readLine();
    if (role.equals("1")){
    	eDirectory.add(new QA(name, title));
    } else if (role.equals("2")){
		eDirectory.add(new Project(name, title));
	}
    else if (role.equals("3")){
		eDirectory.add(new Dev(name, title));}
    else if (role.equals("4")){
		eDirectory.add(new Product(name, title));}
    else {
		eDirectory.add(new Employee(name, title));}
    System.out.println(name + " has been added to the Employee Directory.");
	}
	
	public static void removeEmployee() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter the employee's name to remove in the following format: LastName, FirstName");
	    String name = br.readLine();
		int current = -1;
		for(Employee e: eDirectory)	{
			if(e.getName().equalsIgnoreCase(name)){
				current = eDirectory.indexOf(e);
				break;
				}
			}
		if (current != -1){
		System.out.println(eDirectory.get(current).getName()+" has been removed from the Employee Directory.");
		eDirectory.remove(current);
		}	
		else
		{ System.out.println(name + " was not found in the Employee Directory.");}
	}
		
	
	public static void getEmployee() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter the employee's name (LastName, FirstName) to get their info:");
	    String name = br.readLine();
		int current = -1;
		for(Employee e: eDirectory){
		    if(e.getName().equalsIgnoreCase(name)){
		    	current = eDirectory.indexOf(e);
		    	break;
		    }
		}
		if (current != -1){
		System.out.println(eDirectory.get(current).getName()+" info:");
		System.out.println("Title: " + eDirectory.get(current).getTitle());
		System.out.println("Role: " + eDirectory.get(current).getRole());
		System.out.println("Task: " + eDirectory.get(current).getTasks());	
		}
		else { System.out.println(name + " was not found in the Employee Directory.");}
	}

	public static void listEmployee() throws IOException{
		int count = 1;
		System.out.println("This is the current list of employess:");
		for (Employee e: eDirectory){
			System.out.println("Employee("+count+"): " + e.getName());
			count++;
			}
		}
	
	public static void sortEmployee() throws IOException{
		Collections.sort(eDirectory, new Comparator<Employee>() {
		    public int compare(Employee one, Employee other) {
		        return one.getName().compareToIgnoreCase(other.getName());
		    }
		}); 
		System.out.println("The Employee list has been sorted by Last Name.");
		}
	
/*	public static Comparator<Employee> COMPARE_BY_NAME = new Comparator<Employee>() {
        public int compare(Employee one, Employee other) {
        	return one.mName.compareToIgnoreCase(other.mName);
        }
    };		*/
}






