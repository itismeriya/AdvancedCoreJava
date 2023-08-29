package ArrayMatrix;

public class MatrixMultiplication 
{
	public static void main(String[] args)
	{
		int a[][] = {{1,2,3},{4,5,1},{7,3,5}};
		int b[][] = {{5,6,2},{2,3,4},{2,4,4}};
		
		int c[][] = new int[3][3];
		
		System.out.println("The product of the two matrices is as follows : \n");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j] = 0;
				
				for(int k=0;k<3;k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j]+"  ");
			}
			
			System.out.println();
		}
	}
}
