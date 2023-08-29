package ArrayDemo;

import java.util.Scanner;

//annotation - interface (which is written with @ symbol)
//u cann't reassign size in run time

public class InsertIntoSpecificPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int [10];    //specify a amx size
		int size,num,pos,i;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter no of elements");
			size=sc.nextInt();
			System.out.println("enetr"+size+"elements in an array");
			for(i=0;i<size;i++) {//initializing
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter pos: ");
			pos=sc.nextInt();
			
			if(pos>size || pos<=0 ||pos>arr.length) {
				System.out.println("invalid position");
			}else {
				System.out.println("enter element :");
				num=sc.nextInt();
				
				//shifting code
				
				for(i=size;i>pos;i--) {
					arr[i]=arr[i-1];
				}
				
				//inserting new element in a specific position 
				arr[pos-1]=num;  //arr[2-1] arr[1] =78
				size++;
				
				//display the array
				System.out.println("after insert,new array elements are :");
				for(i=0;i<size;i++) {  //initializing
					System.out.println(arr[i]+" ");
				}  
					
			}
		}
	}

}