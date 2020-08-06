import java.util.Scanner;
public class SAURABH35
{
    public static void main(String[] args) 
    {
        int a;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the number to check:");
        a = r.nextInt();
        if(a % 5 == 0 & a % 3 ==0)
        {
            System.out.println(a +" is divisible by 3 and 5");
        }
        else
        {
            System.out.println(a +" is not divisible by 3 and 5");
        }
    }
}
