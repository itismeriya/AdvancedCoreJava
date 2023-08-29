package ArrayDemo;
import java.util.Scanner;
import java.util.Arrays;

public class DeleteFromSpecificPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int [10];    //specify a amx size
		int size,i;
		Scanner sc = new Scanner(System.in);
			System.out.println("enter no of elements");
			size=sc.nextInt();
			System.out.println("enetr"+size+"elements in an array");
			for(i=0;i<size;i++) {//initializing
				arr[i]=sc.nextInt();
			}
		     System.out.println("Enter the position you want to remove ");
		     int pos = sc.nextInt();
		     
		     if(pos>size || pos<=0 ||pos>arr.length) {
					System.out.println("invalid position");
				}else {					
					for(i = 0; i < arr.length; i++)
				    {
				      if(arr[i] == pos)   
				      {
				        for(int j = i; j < arr.length - 1; j++)
				        {
				            arr[j] = arr[j+1];
				        }
				        size--;
				        break;
				      }
				    }
		       System.out.println("Elements after deletion " );
		       for(i = 0; i < size; i++)
		       {
		             System.out.print(arr[i]+ " ");
		       }  
		    }
	}
}