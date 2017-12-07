
public class StackImplementation {

	int mArraySize;
	int[] mArray;
	int mTop;
	
	public StackImplementation(int size){
		mArraySize = size;
		mArray = new int[mArraySize];
		mTop = -1;
	}
	
	public void push(int value){
		if (isFull()){
			System.out.println("The array is full");
			//increase size of the array
			
		}
		else{
		mTop++;
		mArray[mTop] = value;
		System.out.println("The value added is "+value);
		}
				
	}
	
	public int pop(){	
		if (isEmpty()){
			System.out.println("The array is empty");
			return -1;
		}
		else{
		System.out.println("The value removed is "+ mArray[mTop]);
		return mArray[mTop--];//This decrements after the return
		}
		
	}
	
	public int peek(){		
		return mArray[mTop];
		
		
	}
	
	public boolean isEmpty(){
		return mTop==-1;
		
	}
	
	public boolean isFull(){
		
		return mTop==mArraySize-1;
		
	}

	
	
}
