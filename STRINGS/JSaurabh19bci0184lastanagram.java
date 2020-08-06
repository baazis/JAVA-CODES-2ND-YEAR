import java.util.Scanner;

public class JSaurabh19bci0184lastanagram
{
    public static void main(String[] input)
    {
        String str1, str2;
        int lena, lenb, lenc;
        int temp=0, antitemp=0;
        Scanner strn = new Scanner(System.in);
        
        System.out.print("Enter the First String : ");
        str1 = strn.nextLine();
        System.out.print("Enter the Second String : ");
        str2 = strn.nextLine();
        
        lenb = str1.length();
        lenc = str2.length();
		
        if(lenb == lenc)
        {
            lena = lenb;
            for(int i=0; i<lena; i++)
            {
                temp= 0;
                for(int j=0; j<lena; j++)
                {
                    if(str1.charAt(i) == str2.charAt(j))
                    {
                        temp = 1;
                        break;
                    }
                }
                if(temp == 0)
                {
                    antitemp = 1;
                    break;
                }
            }
            if(antitemp== 1)
            {
                System.out.print("The entered Strings are not Anagram to Each Other..!!");
            }
            else
            {
                System.out.print("The Entered Strings are Anagram Thankyou");
            }
        }
        else
        {
            System.out.print(" Strings don't have the same number of Characters ");
        }
    }
}
