package ArrayDemo;
public class CopyArray{
	public static void main(String args[]) {
		int arr[]= {2,3,4,5,6,7,8};
		
		int[] dest=arr.clone();
		System.out.println("copied 1D array");
		for(int i:dest)
		{
			System.out.println(i);
		}
		
		int[][] arr1= {{1,2,3},{4,5,6},{7,8,9}};
		int dest1[][]=arr1.clone();
		System.out.println("copied 2D array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(dest1[i][j]+" ");
			}
			System.out.println();
		}
}
}