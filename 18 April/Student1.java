/*Write a program to print the names of students by creating a Student class. 
 * If no name is passed while creating an object of Student class,
 *  then the name should be "Unknown", 
 * otherwise the name should be equal to the String value passed while creating object of Student class*/

package practicalpackage;   //creating a package

class Student              //creating a class
{
   String name;            //data members
   public Student(String name) //creating parametrized constructor
   {
		if(name == "")      //if condition 
		{
			this.name="Unknown";
        }
		else                     //else condition
		{
			this.name=name;
		}
	}
	public void printname()     //creating method
	{
		System.out.println("Student Name: "  + name);
	}
}

public class Student1       // main class
{
    public static void main(String[] args) //main method
	{
		Student s1=new Student("");    //creating object
		s1.printname();                   //calling metohd
		Student s2=new Student("SUDARSHAN");  //creating object
		s2.printname();                       //calling method
		
	}

}
