public class BinaryAndLinear {
    public static void main(String[] args) {
        int[] nums = {5, 7, 9, 11, 13};
//        int[] nums = new int[10];
        int target = 13;

        int result = linearSearch(nums, target);
        int result1 = binarySearch(nums, target);
        int result2 = binarySearchRecursive(nums, target, 0, nums.length-1, 0);

        if (result != -1)
            System.out.println("Element found at index "+result);
        else
            System.out.println("Element not found");
    }

    public static int linearSearch(int[] nums, int target) {
        int steps = 0;

        for (int i = 0; i < nums.length; i++){
            steps++;
            if (nums[i] == target){
                System.out.println("Steps taken by linear: "+steps);
                return i;
            }
        }
        System.out.println("Steps taken by linear: "+steps);
        return -1;
    }

    public static int binarySearch(int[] nums, int target){
        int steps = 0;
        int left = 0;
        int right = nums.length-1;
        while (left <= right){
            steps++;
            int mid = (left+right)/2;

            if (nums[mid] == target){
                System.out.println("Steps taken by binary: "+steps);
                return mid;
            }
            else if (nums[mid] < target) left = mid+1;
            else right = mid-1;
        }
        System.out.println("Steps taken by binary: "+steps);
        return -1;
    }

    public static int binarySearchRecursive(int[] nums, int target, int left, int right, int steps){
        steps++;

        if (left <= right){
            int mid = (left+right)/2;
            if (nums[mid] == target){
                System.out.println("Steps taken by binary: "+steps);
                return mid;
            }
            else if (nums[mid] < target)
                return binarySearchRecursive(nums, target, mid+1, right, steps);
            else
                return binarySearchRecursive(nums, target, left, mid-1, steps);
        }
        System.out.println("Steps taken by binary: "+steps);
        return -1;
    }
}
