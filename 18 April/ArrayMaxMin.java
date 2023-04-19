/*Write a program to create an arrray and 
*then Find largest and smallest elements of an array*/

package practicalpackage;     //creating a package

public class ArrayMaxMin      //main class
{
	public static void main(String[] args) //main method
	{
		int [] arr= {35,15,98,100,145};  //initialise array
		int min=arr[0];                 //assign value to min
		int max=arr[0];                 //assign value to max
		for(int i=0;i<arr.length;i++)    //run for loop  until length of array
		{
			if(arr[i]>max)             //if condition
			{
				max=arr[i];
			}
			else                          //else condition
			{
				min=arr[i];
			}
		}
		System.out.println("Maximum Element:" +max);   //print maximum element
		System.out.println("Minimum Element:" +min);   //print minimum element
	} 

}
