import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Program {
	


	public static void main(String[] args) {
		
		//lessonOne();
		//lessonTwo();
		//lessonThree();
		//lessonFour();
		//lessonFive();
		//lessonSix();
		lessonSeven();
	}
	
	public static void lessonSeven(){
		
		//replace with linkedList
		// look up binary search
		
		int[] searchArray = new int[5];
		searchArray[0] = 88;
		searchArray[1] = 77;
		searchArray[2] = 66;
		searchArray[3] = 55;
		searchArray[4] = 44;
		
		System.out.println(LinearSearch.LSearch(searchArray, 40));
		
		System.out.println(LinearSearch.LSearch(searchArray, 77));
		
		ArrayList<String> mArrayList = new ArrayList<String>();
		mArrayList.add("zero");
		mArrayList.add("one");
		mArrayList.add("two");
		mArrayList.add("three");
		mArrayList.add("four");	
		mArrayList.add("four");

		ArrayList<String> mArrayList2 = new ArrayList<String>();
		mArrayList2.add("zero2");
		mArrayList2.add("one2");
		mArrayList2.add("two2");
		mArrayList.addAll(mArrayList2);
		
		System.out.println("the index of the searched item is: " + mArrayList.indexOf("four"));
		System.out.println("the index of the searched item is: " + mArrayList.lastIndexOf("four"));	
		
		//sort
		Collections.sort(mArrayList);
		for (int i=0; i<mArrayList.size(); i++){
			System.out.println(mArrayList.get(i));
		}
		
		int[] searchArray2 = new int[5];
		searchArray2[0] = 88;
		searchArray2[1] = 77;
		searchArray2[2] = 66;
		searchArray2[3] = 55;
		searchArray2[4] = 44;
		
		//bubble sort
		/*for (int k=0; k<searchArray2.length-1; k++){			
		
		for (int j=0; j<searchArray2.length-1; j++)
		{
			if (searchArray2[j]>searchArray2[j+1]){
				//System.out.println("before swap j = " + searchArray2[j]);
				//System.out.println("before swap j+1 = " + searchArray2[j+1]);
				int temp = searchArray2[j+1];
				searchArray2[j+1] = searchArray2[j];
				searchArray2[j] = temp;
				//System.out.println("after swap j = " + searchArray2[j]);
				//System.out.println("after swap j+1 = " + searchArray2[j+1]);			
			}
			for (int p = 0; p<searchArray2.length; p++){
			System.out.println("element " + p + " of the array is " +searchArray2[p]);
			}
		}
		//System.out.println("k = " + searchArray2[k]);
		
		}*/
		
		Arrays.sort(searchArray2);
		for (int p = 0; p<searchArray2.length; p++){
			System.out.println("element " + p + " of the array is " +searchArray2[p]);
			}
		
		
		HashMap<String , String> searchHash = new HashMap();
		searchHash.put("employeeName1", "Rich");
		searchHash.put("employeeName2", "Richard");
		searchHash.put("employeeName3", "Richie");
		searchHash.put("employeeName4", "Richy");
		searchHash.put("employeeName5", "Rick");
		
		//System.out.println(searchHash.get("employeeName3"));
		Set<String> employees = searchHash.keySet();
		for (String name: employees){System.out.println(searchHash.get(name));}
		
		LinkedHashMap<String , String> searchHash2 = new LinkedHashMap();
		searchHash2.put("employeeName1", "Rich");
		searchHash2.put("employeeName2", "Richard");
		searchHash2.put("employeeName3", "Richie");
		searchHash2.put("employeeName4", "Richy");
		searchHash2.put("employeeName5", "Rick");
		
		//System.out.println(searchHash.get("employeeName3"));
		Set<String> employees2 = searchHash2.keySet();
		for (String name2: employees2){System.out.println(searchHash2.get(name2));}
		
		//searchHash.entrySet()
		
		
		
	}
	
	public static void lessonSix(){
		
		//replace with linkedList
		// look up binary search
		
		int[] searchArray = new int[5];
		searchArray[0] = 88;
		searchArray[1] = 77;
		searchArray[2] = 66;
		searchArray[3] = 55;
		searchArray[4] = 44;
		
		System.out.println(LinearSearch.LSearch(searchArray, 40));
		
		System.out.println(LinearSearch.LSearch(searchArray, 77));
		
		ArrayList<String> mArrayList = new ArrayList<String>();
		mArrayList.add("zero");
		mArrayList.add("one");
		mArrayList.add("two");
		mArrayList.add("three");
		mArrayList.add("four");	
		mArrayList.add("four");

		ArrayList<String> mArrayList2 = new ArrayList<String>();
		mArrayList2.add("zero2");
		mArrayList2.add("one2");
		mArrayList2.add("two2");
		mArrayList.addAll(mArrayList2);
		
		System.out.println("the index of the searched item is: " + mArrayList.indexOf("four"));
		System.out.println("the index of the searched item is: " + mArrayList.lastIndexOf("four"));		
	}
	
	
	public static void lessonFive(){
		StackImplementation stack = new StackImplementation(5);
		stack.push(9);
		stack.push(7);
		stack.push(5);
		stack.push(3);
		stack.push(1);
		stack.push(-1);
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		stack.pop();
		stack.pop();
		
		
	}
		
		public static void lessonFour(){
		
		
		
		Alarm alarm = new Alarm(new IAlarmEvent(){
		@Override
		public void fireAlarm(){
			System.out.println("Ring, Ring");
		}
		});
		
		alarm.startCountDown();
		
		
		
	
		
		
		//iAlarm event needs a snooze event 
	//snooze event informs the user snoozing for 5 minutes
	
	}	
		
		
		
		
	public static void lessonThree(){
		
		//come up with a second interface that both your shapes will implement
				// make them implement and print out the results
				
		Rectangle rec1 = new Rectangle(10,5);
		System.out.println("The surface area of the first rectangle is "+rec1.getSurfaceArea());
		ThreeDimensionalRectangle thrDRec1 = new ThreeDimensionalRectangle(10,5,2);
		//rec1.setName("Rectangle");
		//rec2.setName("Something Else");		
		//System.out.println(Rectangle.mName);
		System.out.println("The volume of the second rectangle is "+thrDRec1.getVolume());		
		System.out.println("The surface area of the second rectangle is "+thrDRec1.getSurfaceArea());
		printShapeArea(rec1);
		printShapeArea(thrDRec1);
				
				} 
					
	
	
	public static void printShapeArea(IShape shape){
		System.out.println("The surface area of the"+shape.getName() + " is " + shape.getSurfaceArea()+ shape.getSurfaceAreaUnitOfMeasure() + " and it's color is "+((IColor) shape).getColor());
		
	}
	
	
	public static void lessonTwo(){
		
		Rectangle rec1 = new Rectangle(10,5);
		rec1.setLength(20);
		System.out.println("height of rec1 "+ rec1.getLength());		
		System.out.println("area of rec1 "+ rec1.getSurfaceArea());	
		
		Rectangle rec2 = new Rectangle(10,30);
		System.out.println("height of rec2 "+ rec2.getLength());		
		System.out.println("area of rec2 "+ rec2.getSurfaceArea());	
		
		// second rectangle and which has the larger area
		// remind to explain static
		
			if ((rec1.getSurfaceArea())>(rec2.getSurfaceArea())){System.out.println("Rec1 is largest");
			} else{System.out.println("Rec2 is largest");
			}
			}
		

			
			
	
	
	
	public static void lessonOne(){
		
		
		int value1 = 9;
		int comparison1 = 7;
		int value2 = 19;
		int comparison2 = 27;
		int value3 = 39;
		int comparison3 = 57;
		
		absMethod(value1, comparison1);
				
		if (value1 > comparison1){
			System.out.println(value1 + " is greater than " + comparison1);
		}
		if (value1 < comparison1){
			System.out.println(value1 + " is less than " + comparison1);
		}
		System.out.println("The difference between "+ value1 + " and " + comparison1 + " is " + (value1 - comparison1));
		int absolute1 = value1 - comparison1;
		if (absolute1<0){
			absolute1 = absolute1 * -1;
		}		
		System.out.println("The absolute value of the difference is " + absolute1);
		
		
		if (value2 > comparison2){
			System.out.println(value2 + " is greater than " + comparison2);
		}
		if (value2 < comparison2){
			System.out.println(value2 + " is less than " + comparison2);
		}
		System.out.println("The difference between "+ value2 + " and " + comparison2 + " is " + (value2 - comparison2));
		int absolute2 = value2 - comparison2;
		if (absolute2<0){
			absolute2 = absolute2 * -1;
		}		
		System.out.println("The absolute value of the difference is " + absolute2);
		
		if (value3 > comparison3){
			System.out.println(value3 + " is greater than " + comparison3);
		}
		if (value3 < comparison3){
			System.out.println(value3 + " is less than " + comparison3);
		}
		System.out.println("The difference between "+ value3 + " and " + comparison3 + " is " + (value3 - comparison3));
		int absolute3 = value3 - comparison3;
		if (absolute3<0){
			absolute3 = absolute3 * -1;
		}		
		System.out.println("The absolute value of the difference is " + absolute3);
		
		
		
		int[] list = new int[10];
	//	for(int i=0;i<10; i++){
	//		list[i] = i;
	//	}
		list[0] = 3;
		list[1] = 31;
		list[2] = 13;
		list[3] = 43;
		list[4] = 34;
		list[5] = 73;
		list[6] = 37;
		list[7] = 93;
		list[8] = 39;
		list[9] = 22;
		
		int total = 0;
		for(int i=0;i<10; i++){
				total = total + list[i];
				System.out.println(total);
		}
		
		System.out.println("The total of all of the integers in the array is " + total);
				
		total = 0;
		for(int i=list.length-1;i>=0; i--){
			total = total + list[i];
			System.out.println(total);
		}
		
		absMethod(value1, comparison1);
		absMethod(value2, comparison2);
		absMethod(value3, comparison3);
		
		
		
	}

	private static void absMethod(int a, int b) {
		if (a > b){
			System.out.println(a + " is greater than " + b);
		}
		if (a < b){
			System.out.println(a + " is less than " + b);
		}
		System.out.println("The difference between "+ a + " and " + b + " is " + (a - b));
		int absolute1 = a - b;
		if (absolute1<0){
			absolute1 = absolute1 * -1;
		}		
		System.out.println("The method absolute value of the difference is " + absolute1);
		
	}
	

	

}
