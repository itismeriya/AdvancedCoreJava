package ArrayDemo;

import java.util.Scanner;
public class ArrayTest 
{
	public static void main(String[] args)
	{
		//int[] arr = new int[5];   //declare and instantiate array
		//Class c = arr.getClass();
		//System.out.println(c);
		//System.out.println(arr.length);
		
		
		//initialization
		//arr[0]=10;
		//arr[1]=78;
		//arr[2]=67;
		
		//int[] arr = {34,56,78,78,90};   //declare and instantiating and initializing
		
		//from user at runtime
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		System.out.println("Enter 5 elements : ");
		for(int i=0; i<arr.length; i++)   //i=5<5
		{
			arr[i] = sc.nextInt();   //arr[4]
		}
		
		for(int i=0; i<arr.length; i++)     // 0  1  2  3  4
		{
			System.out.println("arr["+i+"]="+arr[i]);
		}
		
	}
}