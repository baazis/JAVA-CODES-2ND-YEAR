import java.util.Scanner;
public class NamesOrderSaurabh19BCI0184
{
    public static void main(String[] args) 
    {
        String t;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of names you want to enter:");
        int m = scan.nextInt();
        String namesort[] = new String[m];
        Scanner string = new Scanner(System.in);
        System.out.println("Enter all the names:");
        for(int i = 0; i < m; i++)
        {
            namesort[i] = string.nextLine();
        }
        for (int i = 0; i < m; i++) 
        {
            for (int j = i + 1; j < m; j++) 
            {
                if (namesort[i].compareTo(namesort[j])>0) 
                {
                    t = namesort[i];
                    namesort[i] = namesort[j];
                    namesort[j] = t;
                }
            }
        }
        System.out.println("The Names in Sorted Order is: ");
        
        for (int i = 0; i < m - 1; i++) 
        {
            System.out.println(namesort[i]);
        }
        System.out.print(namesort[m - 1]);
    }
}
