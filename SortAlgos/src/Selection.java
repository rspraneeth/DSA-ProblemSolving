import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class Selection {
    public static void main(String[] args) {
        int[] nums = {6, 5, 2, 8, 9, 4};

        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.print(num+" ");
        }

        int size = nums.length;
        int min = 0;
        for (int i = 0; i < size - 1; i++){
            min = nums[i];

            for (int j = i; j < size - 1; j++){
                if (nums[j+1] < min){
                    min = nums[j+1];
                    nums[j+1] = nums[i];
                    nums[i] = min;
                }
            }
        }




        System.out.println("\n\nAfter Sorting");
        for (int num : nums) {
            System.out.print(num+" ");
        }

    }
}
