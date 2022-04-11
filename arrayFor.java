import java.util.Arrays;
public class arrayFor {


        public static void main(String[] args)
        {
            int[] array_nums = {1, 2, 3, 4, 5, 6};
            System.out.println("Original Array: "+ Arrays.toString(array_nums));

            for (int i = 1;i <= 2; i++) {
                int x = array_nums[i-1];
                array_nums[i-1] = array_nums[array_nums.length - i];
                array_nums[array_nums.length - i] = x;
            }
            System.out.println("New array after swaping the first and last elements: "+Arrays.toString(array_nums));
        }



}
