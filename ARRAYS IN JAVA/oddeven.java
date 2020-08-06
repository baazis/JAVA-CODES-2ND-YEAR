import java.util.Arrays;
public class oddeven
{
	
	 public static void main (String[] args)
     {
        int nums[] = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
        int result[];
        System.out.println("Original Array ");
        System.out.println(Arrays.toString(nums));

        result = sepoddeven(nums);
 
        System.out.print("Array after separation is given by: ");
        System.out.println(Arrays.toString(result));
    }
	
    static int [] sepoddeven(int arr[])
    {
        int ls = 0, rs = arr.length - 1;
        while (ls < rs)
        {
            while (arr[ls]%2 == 0 && ls < rs)
                ls++;
 
            while (arr[rs]%2 == 1 && ls < rs)
                right_side--;
 
            if (ls < rs)
            {
                int temp = arr[ls];
                arr[ls] = arr[rs];
                arr[right_side] = temp;
                ls++;
                rs--;
            }
        }
        return arr;
    }
}
