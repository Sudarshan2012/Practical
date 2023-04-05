/*"Create an abstract class called "Shape" with an abstract method called "calculateArea". 
Create two subclasses called "Circle" and "Rectangle" that inherit from Shape and 
implement the "calculateArea" method. Create objects of both the Circle and Rectangle classes and call their respective "calculateArea" methods.*/

abstract class Shape                           //creating abstract class
{
	
	public abstract double calculateArea();    //abstract method

}
class Circle extends Shape                     //creating subclass inherit from abstract class
{
	double radius;
	
    public Circle(double radius)               //parameterized constructor
    {
    	
		this.radius=radius;
    	
    }
    public double calculateArea()             //creating calculateArea method for circle class
    {
    	return 3.14*radius*radius;
    }
}
class Rectangle extends Shape                 //creating subclass inherit from abstract class
{
	 double length;
	 double breadth;
	 double calculateArea;
   public Rectangle(double length, double breadth)     //parameterized constructor
   {
	  
	   this.length=length;
	   this.breadth=breadth;
   }
   public double calculateArea()                    //creating calculateArea method for rectangle class
   {
	  return length*breadth;
   }
}
public class Cal                            //main class
{
	
	public static void main(String args[])    //main method
	{
		Circle c=new Circle(5);                              //creating object for circle method
		System.out.println("Circle:"+c.calculateArea());     //calling calculateArea method of circle and print  output
		
		Rectangle r=new Rectangle(2,3);                      //creating object for rectangle method
		System.out.println("Rectanle:"+r.calculateArea());    //calling calculateArea method of circle and print   output 
	}
}