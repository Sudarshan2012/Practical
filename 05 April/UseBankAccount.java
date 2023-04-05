/*Create an interface called "BankAccount" with methods called "deposit" and "withdraw".
Create a class called "CheckingAccount" that implements the BankAccount interface and implements the "deposit" and "withdraw" methods.
Create an object of the CheckingAccount class and call both the "deposit" and "withdraw" methods.*/

interface BankAccount                                       //creating interface
{
   public void deposit();                                   // creating interface method
   public void withdraw();                                  //creating interface method
}
class CheckingAccount implements BankAccount               //implemented class 
{
   public void deposit()                                  //implementing deposit method
   {
    System.out.println("We are implenting deposit method");
   }
   public void withdraw()                                 //implementing withdraw method
   {
    System.out.println("We are implenting withdraw method");
   }
}
class UseBankAccount
{
   public static void main(String args[])                  //main class
   {
     CheckingAccount d=new CheckingAccount();            //creating object for implemented class
	 d.deposit();                                       //calling deposit method
	 d.withdraw();                                       //calling withdraw method
   
   }

}
