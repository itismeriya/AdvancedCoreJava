package ArrayMatrix;
import java.util.*;
public class SubArraySorting {
		public static void main(String[] args)
		{
			int temp;
			Scanner sc = new Scanner(System.in);
			int arr[] = {2,9,5,4,3,8,7,10,1,11,45,67};
			int subarray[] = new int[arr.length];
			
			System.out.println("The array is : ");
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
			
			
			System.out.println("Enter the starting index : ");
			int starting = sc.nextInt();
			
			System.out.println("Enter the ending index : ");
			int ending = sc.nextInt();
			
			int newarraylength = (ending-starting)+1;
			
			for(int i=0;i<newarraylength;i++)
			{
				subarray[i] = arr[starting];
				starting++;
			}
			
			System.out.println("The sub array is : ");
			for(int i=0;i<subarray.length;i++)
			{
				System.out.println(subarray[i]);
			}
			
			
			for(int i=0;i<subarray.length;i++)
			{
				for(int j=i+1;j<subarray.length;j++)
				{
					if(subarray[i]>subarray[j])
						{
							temp=subarray[i];
							subarray[i]=subarray[j];
							subarray[j]=temp;
						}
					}
				}
				System.out.println("\n\nThe sorted sub array is : ");
				for(int i=0;i<subarray.length;i++)
				{
					System.out.println(arr[i]);
				}
			}
	}

