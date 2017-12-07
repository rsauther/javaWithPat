
public class StringCalculator {

	public static int add(String passedNumbers) {
		// TODO Auto-generated method stub
		String numbers[] = passedNumbers.split(",");
		int total=0;
		
		for (int i=0; i<numbers.length; i++){	
			if (!numbers[i].isEmpty())total = total + Integer.parseInt(numbers[i]);
		}
		return total;
		
	}
	
	public static void testException(int value) throws Exception{
		
		if (value==1) {
			throw new Exception("bad exception");
		}
		else throw new Exception("really bad exception");
	}

}
