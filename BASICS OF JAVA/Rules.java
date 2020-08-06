import java.util.*; 
import java.lang.*;
public class Rules{
	public static void main(String[] args) {
		Scanner inp= new Scanner(System.in);
		while(true){
		System.out.println("Enter 1 for adding and 2 for exit:");
		int num= inp.nextInt();
		switch(num){
			case 1:
			System.out.println("Enter two numbers:");
			int n1=inp.nextInt();
			int n2=inp.nextInt();
			int sum=n1+n2;
			System.out.println("SUm is:"+sum);
			break;
			case 2:
			System.exit(0);}}
		}}
		
