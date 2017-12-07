import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import junit.framework.Assert;

public class EmployeeDirTest {

	
	@Test
	public void PassIReturnInstructionsTest() throws IOException {		
		String actual = EmployeeDir.testInput("I");
		System.out.println("Input I, received "+ actual+ ".");
		Assert.assertEquals("Expected I, received "+ actual+ ".", "Instructions", actual);
	}
	
	@Test
	public void PassiReturnInstructionsTest() throws IOException {		
		String actual = EmployeeDir.testInput("i");
		System.out.println("Input i, received "+ actual+ ".");
		Assert.assertEquals("Expected i, received "+ actual+ ".", "Instructions", actual);
	}
	
	@Test
	public void PassEmptyReturnInvalidFormatTest() throws IOException {		
		String actual = EmployeeDir.testInput("");
		System.out.println("Input empty, received "+ actual+ ".");
		Assert.assertEquals("Expected Invalid Format!, received "+ actual+ ".", "Invalid Format!", actual);
	}
	
	@Test
	public void PassNullReturnInvalidFormatTest() throws IOException {		
		String actual = EmployeeDir.testInput(null);
		System.out.println("Input null, received "+ actual+ ".");
		Assert.assertEquals("Expected null, received "+ actual+ ".", "Null", actual);
	}
	
	@Test
	public void PassSpaceReturnInvalidFormatTest() throws IOException {		
		String actual = EmployeeDir.testInput(" ");
		System.out.println("Input space, received "+ actual+ ".");
		Assert.assertEquals("Expected Invalid Format!, received "+ actual+ ".", "Invalid Format!", actual);
	}
	
	@Test
	public void PassQReturnQuitTest() throws IOException {		
		String actual = EmployeeDir.testInput("Q");
		System.out.println("Input Q, received "+ actual+ ".");
		Assert.assertEquals("Expected Q, received "+ actual+ ".", "Quit", actual);
	}
	
	@Test
	public void PassqReturnQuitTest() throws IOException {		
		String actual = EmployeeDir.testInput("q");
		System.out.println("Input q, received "+ actual+ ".");
		Assert.assertEquals("Expected q, received "+ actual+ ".", "Quit", actual);
	}
	
	@Test
	public void CreateEmployeeTest() {		
		
		//Assert.assertEquals("Expected q, received "+ actual+ ".", "Quit", actual);
	}
	
	@Test
	public void AddEmployeeTest() {		
		
		//Assert.assertEquals("Expected q, received "+ actual+ ".", "Quit", actual);
	}
	
	@Test
	public void PassSReturnSortTest() throws IOException {		
		String actual = EmployeeDir.testInput("S");
		System.out.println("Input S, received "+ actual+ ".");
		Assert.assertEquals("Expected S, received "+ actual+ ".", "Sorted", actual);
	}
	
	@Test
	public void PassLReturnListTest() throws IOException {		
		String actual = EmployeeDir.testInput("L");
		System.out.println("Input L, received "+ actual+ ".");
		Assert.assertEquals("Expected L, received "+ actual+ ".", "List", actual);
	}
	
	@Test
	public void PassAReturnAddTest() throws IOException {		
		String actual = EmployeeDir.testInput("A");
		System.out.println("Input A, received "+ actual+ ".");
		Assert.assertEquals("Expected A, received "+ actual+ ".", "Added", actual);
	}
	
	@Test
	public void PassRReturnRemoveTest() throws IOException {		
		String actual = EmployeeDir.testInput("R");
		System.out.println("Input R, received "+ actual+ ".");
		Assert.assertEquals("Expected R, received "+ actual+ ".", "Removed", actual);
	}
	
	@Test
	public void PassGReturnGetTest() throws IOException {		
		String actual = EmployeeDir.testInput("G");
		System.out.println("Input G, received "+ actual+ ".");
		Assert.assertEquals("Expected G, received "+ actual+ ".", "Get", actual);
	}
	
	@Test
	public void RemoveExistingEmployeeTest() throws IOException {		
		/*String actual = EmployeeDir.testInput("R");
		System.out.println("Input R, received "+ actual+ ".");
		Assert.assertEquals("Expected R, received "+ actual+ ".", "Removed", actual);
	*/}
	
	@Test
	public void RemoveNonexistingEmployeeTest() throws IOException {		
		/*String actual = EmployeeDir.testInput("R");
		System.out.println("Input R, received "+ actual+ ".");
		Assert.assertEquals("Expected R, received "+ actual+ ".", "Removed", actual);
	*/}

}
