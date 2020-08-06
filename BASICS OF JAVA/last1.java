import java.util.*; 
import java.lang.*;
public class last1{
	public static void main(String[] args) {
		Scanner inp= new Scanner(System.in);
		System.out.println("Enter the number to start: ");
		int num= inp.nextInt();
		for( int i=1 ;i<=num;i++)
		{
			for( int j=1; j<=i;j++){
				System.out.print(j);
				}
				System.out.println( );}
		for( int i=num; i>=1;i--)
		{
			for( int j=1; j<=i;j++){
				System.out.print(j);
				}
				System.out.println( );
		}}}
