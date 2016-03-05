package A2_103403526;

import java.util.Scanner;
/* You can choose any IO method in JAVA to get the input */
public class TestArea {
	/* main function better to be only one in all java files,
	   so most(? maybe..I think) developer will put main function in Test class. */
	
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 double height,width;
		 double sideA,sideB,sideC;
		 
		 
		 Rectangle r1 = new Rectangle();
		 System.out.printf("Rectangle r1 has area of %f\n",r1.getArea());
		 
		 Triangle t1 = new Triangle();
		 System.out.printf("Triangle t1 has area of %f\n",t1.getArea());
		 
		 System.out.print("Enter height:");
		 height=input.nextDouble();
		 System.out.print("Enter width:");
		 width=input.nextDouble();
		 Rectangle r2 = new Rectangle(height,width);
		 System.out.printf("Rectangle r2 has area of %f\n",r2.getArea());
		 
		 System.out.print("Enter length of sideA:");
		 sideA=input.nextDouble();
		 System.out.print("Enter length of sideB:");
		 sideB=input.nextDouble();
		 System.out.print("Enter length of sideC:");
		 sideC=input.nextDouble();
		 Triangle t2 = new Triangle(sideA,sideB,sideC);
		 System.out.printf("Triangle t2 has area of %f", t2.getArea());
		 
		 
		 
		 
		 
		 
		 /*-- Create a Rectangle class object name r1 with default value --*/
		 
		 /*-- Create a Triangle class object name t1 with default value --*/
		 
		 /*-- Let user input defined value to Rectangle class object name r2 --*/
		 
		 /*-- Let user input defined value to Triangle class object name t2 --*/
		 
		 
	 }
}
