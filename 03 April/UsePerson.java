/*Create a parent class called "Person" with attributes such as name, age, and a method called "speak". 
Create a child class called "Student" that inherits from Personand has an additional attribute called "grade" and a method called "study".
Create an object of the Student class and call both the 'speak" and "study methods.*/

class Person                                              //creating parent class
{
   String name;                                           //data members
   int age;
   public void speak(String name,int age)                 //creaing speak method
   {
      this.name=name;
	  this.age=age;
	  System.out.println("Name: " +name+ " Age: " +age);
   }
   
}
class Student extends Person                             //creaing child class
{
   String grade;                                         //data members
   public void study(String grade)                       //creaing study method
   {
    this.grade=grade;
	 System.out.println("Grade: " +grade);
   }

}
public class UsePerson                                   //main class

{
   public static void main(String args[])                //main method
   {
      Student s=new Student();                           //creating object
	  s.speak("SUDARSHAN", 11);                          //calling speak method
	  s.study("A+");                                     //calling study method
   }
}