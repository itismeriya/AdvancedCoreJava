package ArrayDemo;
import java.util.*;
public class ArrayFactorialEachElement 
{
	static void factorial(int[] arr) //formal parameter
	{
		int fact;
		for(int n:arr) // 5  3  4  2  1       n=5
		{
			fact=1;
			for(int i=1;i<=n;i++) //i=1; i<=5   t
			{
				fact=fact*i;
			}
			System.out.println("The factorial of "+n+" is : "+fact);
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int [] arr;  //declare array
		int size,i;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the size of an array : ");
		size=sc.nextInt();  //5
		
		arr=new int[size];  //instantiating; here memory and object both are created using "new" keyword
		System.out.println("Enter "+size+" elements in an array : ");
		for(i=0;i<size;i++)   //initializing; storing value in an array and assigning value
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The array elements are: ");
		for(i=0;i<size;i++)   //initializing
		{
			System.out.println(arr[i]);
		}
		
		System.out.println();
		factorial(arr); //reference; actual parameter; this is the object reference
	}
}