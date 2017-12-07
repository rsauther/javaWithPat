import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class StringCalculatorTest {

	@Test
	public void PassTwoNumbersReturnSumTest() {		
		int actual = StringCalculator.add("5,6");
		Assert.assertEquals("Expected 11, received "+ actual+ ".", 11, actual);
	}

	@Test
	public void PassEmptyReturnZeroTest() {		
		int actual = StringCalculator.add("");
		Assert.assertEquals("Expected null, received "+ actual+ ".", 0, actual);
	}
	
	@Test
	public void PassNullReturnZeroTest() {		
		int actual = StringCalculator.add(null);
		Assert.assertEquals("Expected null, received "+ actual+ ".", 0, actual);
	}
	
	@Test
	public void PassSpacesReturnZeroTest() {		
		int actual = StringCalculator.add("  ");
		Assert.assertEquals("Expected null, received "+ actual+ ".", 0, actual);
	}
	
	@Test(expected = NumberFormatException.class)
	public void PassLetterThrowsExceptionTest() {		
		int actual = StringCalculator.add("K,5");		
	}	
	
	@Test(expected = Exception.class)
	public void ThrowsExceptionWithBadMessageTest() throws Exception {		
		try {
			StringCalculator.testException(1);
		} catch (Exception e) {
			Assert.assertEquals("bad exception", e.getMessage());
			throw e;
		}	
	}
	
	@Test(expected = Exception.class)
	public void ThrowsExceptionWithReallyBadMessageTest() throws Exception {		
		try {
			StringCalculator.testException(7);
		} catch (Exception e) {
			Assert.assertEquals("really bad exception", e.getMessage());
			throw e;
		}	
	}
	//don't add a negative number and throw an exception with the negative numbers displayed.
	
	
	
}
