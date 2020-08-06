import java.util.Scanner;
public class Square{  
    public static void main(String args[]){
    int count=1,total=0;
    Scanner inp= new Scanner(System.in);
    System.out.println("Enter the number till sum to be calculated: "); 
    int no= inp.nextInt(); 
    while(count<=no)
    {
    total=total+count*count;
    count++;}
    System.out.println("Sum is: "+total);  
    } 
} 
