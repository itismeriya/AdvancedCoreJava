package ArrayDemo;
public class ArrayEvenOdd 
{
	public static void main(String args[])
	{
		int[] arr = {2,3,4,5,6,7,8};
		System.out.println("The odd numbers are : ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 != 0)
			{
				System.out.println(arr[i]);
			}
		}
		System.out.println("The even numbers are : ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 == 0)
			{
				System.out.println(arr[i]);
			}
		}
	}
}