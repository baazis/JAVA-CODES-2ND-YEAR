import java.util.*;

public class TransposeofMatrixbySAURABH19BCI0184
{
	public static void main(String args[])
	{
		int r,c;
		Scanner temp=new Scanner(System.in);
		System.out.print("Enter your number of rows: ");
		r=temp.nextInt();
		System.out.print("Enter your number of columns: ");
		c=temp.nextInt();
		
		int a[][]=new int[r][c];
		System.out.println("Enter elements of matrix A:");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print("Element is : ");
				a[i][j]=temp.nextInt();
			}
		}
		System.out.println("Matrix a is given by:");
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				System.out.print(a[i][j] + "  ");
			}
			System.out.print("\n");
		}
		System.out.println(" Transpose Matrix is given by : ");
		for(int i=0; i<c; i++){
			for(int j=0; j<r; j++){
				System.out.print(a[j][i] + "  ");
			}
			System.out.print("\n");	
		}
		
	}	
}
