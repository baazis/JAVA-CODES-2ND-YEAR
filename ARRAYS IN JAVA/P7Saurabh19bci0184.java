import java.util.Scanner;
public class P7Saurabh19bci0184 {
public static void main( String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of elements: ");
int a=sc.nextInt();
int b[];
b=new int[a];
System.out.println("ENter the array: ");
for(int i=0;i<a;i++){
b[i]=sc.nextInt();}
System.out.println("Enter the sum: ");
int c=sc.nextInt();
for(int i=0;i<a;i++){
for(int j=0;j<a;j++){
if(c==b[i]+b[j]){
System.out.print("  INDEX " + i );
System.out.print(" INDEX " + j );
System.out.println();
}}}}}
