import java.util.Arrays;

public class LC977_Squares_of_a_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        Arrays.stream(nums).map(n->n*n).sorted().forEach(System.out::println);

        twoPointers(nums);
    }

    private static void twoPointers(int[] nums) {

        int n = nums.length, i=0, j = n-1, k=n-1;
        int[] sorted = new int[n];

        while (i < j){
            if (nums[i]*nums[i] > nums[j]*nums[j]){
                sorted[k] = nums[i]*nums[i];
                i++; k--;
            } else {
                sorted[k] = nums[j]*nums[j];
                j--; k--;
            }
        }

        for (int num: sorted) System.out.print(num+" ");
    }
}


//Given an integer array nums sorted in non-decreasing order, return an array
// of the squares of each number sorted in non-decreasing order.