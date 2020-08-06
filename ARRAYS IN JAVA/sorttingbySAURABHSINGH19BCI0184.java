import java.util.Arrays;
 
public class sorttingbySAURABHSINGH19BCI0184
{
	    public static void main(String[] args) 
    {
        int numbers[] = new int[]{52, 28, 68, 27, 72, 98, 109, 88, 60, 10};
        int resultarra[];
         
        System.out.println("the  Array IS:  ");
        System.out.println(Arrays.toString(numbers));
         
        resultarra = rearrange(numbers,numbers.length);
         
        System.out.println("New Array is given by: ");
        System.out.println(Arrays.toString(resultarra));
     
    }
    
     static int[] rearrange(int[] new_arra, int n)
    {
        int temp[] = new int[n];
     
         int small_num = 0, large_num = n-1;
         boolean flag = true;
     
        for (int i=0; i < n; i++)
        {
            if (flag)
                temp[i] = new_arra[large_num--];
            else
                temp[i] = new_arra[small_num++];
     
            flag = !flag;
        }
     
        return temp;
    }
 

}
