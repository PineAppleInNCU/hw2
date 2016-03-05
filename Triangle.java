package A2_103403526;

import java.lang.Math.*;

/* Triangle.java */
public class Triangle {
	// a,b,c denote the three side length of triangle 
	private double a, b, c;
	
	public Triangle(double inputA,double inputB,double inputC){
		setA(inputA);
		setB(inputB);
		setC(inputC);
	}
	public Triangle(){
		this(1.0,1.0,1.0);
	}
	public void setA(double inputA){
		a=inputA;
	}
	public void setB(double inputB){
		b=inputB;
	}
	public void setC(double inputC){
		c=inputC;
	}
	
	public double getArea(){
		double s=(a+b+c)/2;
		double area=Math.pow(s*(s-a)*(s-b)*(s-c),0.5);
		
		return area;
	}
	
	/*-- Create 1st Constructor to set default value of three side length --*/
	
	/*-- Create 2nd Constructor with given three side length 
	      from user input in main function --*/
	
	/*-- Create a public method named getArea() for computing area of triangle and returning to caller. 
	     hint: implement mathematical method that only use three side length of triangle to get area  --*/
	
	
}
