import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class Selection {

    /*Selection sort is a simple and efficient sorting algorithm that works
    by repeatedly selecting the smallest (or largest) element from the
    unsorted portion of the list and moving it to the sorted portion of the list. */
    public static void main(String[] args) {
        int[] nums = {6, 5, 2, 8, 9, 4};

        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.print(num+" ");
        }

        int size = nums.length;
        int mini = 0, temp;
        for (int i = 0; i < size - 1; i++){

            mini = i; //consider as min index value

            for (int j = i; j < size - 1; j++){
                if (nums[j+1] < nums[mini]){
                    mini = j+1; //finding min index value for the iteration
                }
            }

            temp = nums[mini]; // taking min value in temp to place in sorted part
            nums[mini] = nums[i];
            nums[i] = temp; //placing in the end of sorted part
        }




        System.out.println("\n\nAfter Sorting");
        for (int num : nums) {
            System.out.print(num+" ");
        }

    }
}
