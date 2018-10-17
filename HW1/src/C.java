// CLASS: C
// AUTHOR: Andrew Seba, aseba, aseba@asu.edu
public class C {
	
	//Variables
	private int mX;
	private int mY = 0;
	private final int A = 100;
	public final int B = 200;
	
	//Public GetSet Methods
	public int getX()
	{
		return mX;
	}
	
	public void setX(int pX)
	{
		mX = pX;
	}
	
	public int getY()
	{
		return mY;
	}
	
	public void setY(int pY)
	{
		mY = pY;
	}
	
	//Public Default Constructor
	public C()
	{
		mX = -1;
	}
	
	public C(int pX)
	{
		setX(pX);
	}
}
