
public class ThreeDimensionalRectangle extends Rectangle implements IShape, IColor{
	private int mHeight;
	
	public ThreeDimensionalRectangle(int length, int width, int height){
		super(length, width);
		System.out.println("info: in the ThreeDimensionalRectangle class constructor");
		mHeight = height;
	}
	
	public int getHeight(){
		return mHeight;
	}
	
	public int getVolume(){
		return (mLength * mWidth * mHeight);
	}
	
	public String getName(){	
		return " Three Dimensional Rectangle";		
	}
	
	public String getColor(){
		return "Orange";
	}
	
	@Override
	public int getSurfaceArea(){
		System.out.println("3d");
		//2lw+2hw+2lh
		int lengthWidth = super.getSurfaceArea();
		return ((2*lengthWidth) + (2*mHeight*mWidth) + (2*mLength*mHeight));
		
	}
	

}
