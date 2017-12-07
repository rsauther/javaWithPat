
public class Rectangle implements IShape, IColor{
	
	protected int mLength;
	protected int mWidth;
	//public static String mName = "Static";
	
	public Rectangle(int l, int w){
		System.out.println("info: in the rectangle class constructor");
		mLength = l;
		mWidth = w;
		}
	
	public int getLength(){		
		return mLength;		
	}
	
	public int getWidth(){		
		return mWidth;		
	}
	
	public void setLength(int h){		
		mLength = h;	
	}
	
	public int getSurfaceArea(){	
		return mLength * mWidth;		
	}
	
	/*public void setName(String name){		
		mName = name;	
	}*/
	
	public String getName(){	
		return " Rectangle";		
	}
	
	public String getColor(){
		return "Teal";
	}

	public String getSurfaceAreaUnitOfMeasure() {
		return " square feet";
	}
	
	
}
