public class Bubble {
    public static void main(String[] args) {
        int[] nums = {6, 5, 2, 8, 9, 4};

        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.print(num+" ");
        }

        int size = nums.length;
        for (int i = 0; i < size-1; i++){
            for (int j = 0; j < size-i-1; j++){
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }



        System.out.println("\n\nAfter Sorting");
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }
}
