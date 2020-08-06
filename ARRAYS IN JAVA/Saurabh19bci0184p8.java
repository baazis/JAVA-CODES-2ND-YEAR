import java.util.Scanner;

public class Saurabh19bci0184p8 {

	public static void main(String[] args) {
        double k;
        int a, b;


        int arr[][] = new int[4][]; 
        Scanner rit = new Scanner(System.in);
        for(a = 0; a < arr.length; a++){
            System.out.print("Enter number of weak students for the batch " + (a+1) + ": ");
            k = rit.nextDouble();
            int n= (int)k/4;
            System.out.print("Number of tutor for the batch " +(a+1) +"is :");
            if ((k/4)>(n)){
				System.out.println(n+1);}
            else {
				System.out.println(n);}
            arr[a] = new int[(int)Math.ceil(k/4)];
            for(b = 0; b < arr[a].length; b++)
            {
                if(k >= 4)
                    arr[a][b] = 4;
                else
                    arr[a][b] = (int)k;
                k = k - 4;
            }
             
        }
        rit.close();
 
        int jaggres = 0;
        System.out.println(" 2D Jagged Array is shown by : "); 
        System.out.println();
        for (a = 0; a < arr.length; a++) { 
            for (b = 0; b < arr[a].length; b++) {
            		System.out.print(arr[a][b] + " ");
            		if(arr[a][b] == 4)
            			jaggres++;
            }
            System.out.println(); 
        }

        System.out.println("Number of tutors with 4 students are: " + jaggres );
    }
}
