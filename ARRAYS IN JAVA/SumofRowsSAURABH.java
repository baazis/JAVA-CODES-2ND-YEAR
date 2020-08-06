public class SumofRowsSAURABH
{  
    public static void main(String[] args) {  
        int row, col, sumofRow;  
           
        int a[][] = {     
                        {12, 24, 13},  
                        {34, 3, 16},  
                        {52, 29, 49}  
                    };  
             
          row = a.length;  
          col= a[0].length;  
          
        for(int i = 0; i < row; i++)
        {  
            sumofRow = 0;  
            for(int j = 0; j < col; j++){  
              sumofRow +=a[i][j];  
            }  
            System.out.println("Sum of " + (i+1) +" row is following: " + sumofRow);  
        }  
         
    }  
}  
