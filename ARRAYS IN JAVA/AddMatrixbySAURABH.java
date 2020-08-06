import java.util.Scanner;
class AddMatrixbySAURABH
{
public static void main(String args[])
{
int r, c,i,j;
Scanner temp = new Scanner(System.in);
 
System.out.println("Enter number of rows");
r = temp.nextInt();
 
System.out.println("Enter number columns");
c = temp.nextInt();
 
int matrix1[][] = new int[r][c];
int matrix2[][] = new int[r][c];
int addofmatrix[][] = new int[r][c];
 
System.out.println("Enter the elements of matrix1");
 
for ( i= 0 ; i < r ; i++ )
{ 
 
for ( j= 0 ; j < c ;j++ )
matrix1[i][j] = temp.nextInt();
 
System.out.println();
}
System.out.println("Enter the elements of matrix2");
 
for ( i= 0 ; i < r ; i++ )
{
 
for ( j= 0 ; j < c ;j++ )
matrix2[i][j] = temp.nextInt();
 
System.out.println();
}
 
for ( i= 0 ; i < r ; i++ )
for ( j= 0 ; j < c ;j++ )
addofmatrix[i][j] = matrix1[i][j] + matrix2[i][j] ; 
 
System.out.println("Addition  of matrices is:-");
 
for ( i= 0 ; i < r ; i++ )
{ 
for ( j= 0 ; j < c ;j++ )
System.out.print(addofmatrix[i][j]+"  ");
 
System.out.println();
}
 
}
}
