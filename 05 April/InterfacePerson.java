/*Create an interface called ""Person"" with a method called ""speak"".
 Create two classes called ""Student"" and "Teacher" that implement the 
 Person interface and implement the "speak"method. Create objects of both 
 the Student and Teacher classes and call their respective ""speak"" methods.*/


interface Person                              // //creating interface
{
   public void speak();                       // creating interface method
  
}
class Student implements Person               //implemented student class 
{
   public void speak()                       //implementing interface method
   {
    System.out.println("I am implementing speak method for Student class");
   }
   
}
class Teacher implements Person             //implemented teacher class 
{
    public void speak()                    //implementing interface method
   {
    System.out.println("I am implementing speak method for Teacher class");
   } 
}


class InterfacePerson                      
{
   public static void main(String args[])   //main method
   {
     Student s=new Student();                //creating object for student class
	 s.speak();                               //calling speak method of student class
	
	Teacher t=new Teacher();                  //creating object for Teacher class
	t.speak();                               //calling speak method for teacher class
   }

}