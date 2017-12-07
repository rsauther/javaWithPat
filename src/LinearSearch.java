
public class LinearSearch {
	
	public static int LSearch(int[] a, int lookup){
		
		boolean check = false;
		for(int i=0; i<a.length; i++){
		
			if (lookup == a[i]){
				System.out.println("the position of you element is: "+ i);
				//check = true;
				return i;
			}
			//else System.out.println("your variable is not at position: "+ i); ; 
			
		}
		if(!check)System.out.println(lookup + " was no present at all"); 
		return -1;
	}

}
