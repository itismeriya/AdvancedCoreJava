package ArrayMatrix;
import java.util.Scanner;
import static java.lang.System.*;
public class DeleteElement {
	   

	public class DeleteElementFromSpecificPosition 
	{
		public static void main(String[] args)
		{
				int[] arr = new int[100];    //specify a max size
				int size,num,pos=0,i;
				Scanner sc = new Scanner(in);
				out.println("Enter no. of elements in an array : ");
				size = sc.nextInt();
				
				out.println("Enter "+size+" elements in an array : ");
				for(i=0;i<size;i++)
				{
					arr[i] = sc.nextInt();
				}
				
				out.println("Enter the position from where you want to delete the element : ");
				pos = sc.nextInt();
				
				if(pos>size || pos<=0 || pos>arr.length)
				{
					out.println("Invalid position!");
				}
				
				else
				{
					out.println("Enter the element which you want to delete : ");
					num = sc.nextInt();
					
					//shifting code
					for(i=pos-1;i<size-1;i++)
					{
						arr[i] = arr[i+1];
					}
					
					size--;          
					
					//display the array
					out.println("After deleting, the new array elements are : ");
					for(i=0;i<size;i++)
					{
						System.out.println(arr[i]);
					}
				}
		}
	}
}
