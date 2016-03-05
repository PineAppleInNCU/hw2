package A2_103403526;

/* Rectangle.java */
public class Rectangle {
	// retangle's height and width
	private double height, width;
	
	
	public Rectangle(double inputHeight,double inputWidth)//constructor
	{
		setHeight(inputHeight);
		setWidth(inputWidth);
	}
	public Rectangle(){//second constructor
		this(1.0,1.0);
	}
	
	public void setHeight(double inputHeight){
		
		height=inputHeight;
	}
	public void setWidth(double inputWidth){
		width=inputWidth;
	}
	public double getHeight(){
		return height;
	}
	public double getWidth(){
		return width;
	}
	public double getArea(){
		return getHeight()*getWidth();
	}
	
	/*-- Create 1st Constructor to set default value of height and width --*/
	
	/*-- Create 2nd Constructor with given height and width 
	      from user input in main function --*/
	
	/*-- Create a public method named getArea() for computing area of rectangle and returning to caller --*/
	
	
}
