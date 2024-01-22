public class Insertion {
    public static void main(String[] args) {
        int[] nums = {6, 5, 2, 8, 9, 4};

        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.print(num+" ");
        }

        int n = nums.length;

        for (int i = 1; i < n; i++){
            int key = nums[i];
            int j = i-1;
            while (j >= 0 && key < nums[j]){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }


        System.out.println("\n\nAfter Sorting");
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }
}
