import java.util.Arrays;

public class LC2971LongestPerimeter {

    public static void main(String[] args) {
        int[] nums = {300005055, 352368231, 311935527, 315829776, 327065463, 388851949, 319541150, 397875604, 311309167, 391897750, 366860048, 359976490, 325522439, 390648914, 359891976, 369105322, 350430086, 398592583, 354559219, 372400239, 344759294, 379931363, 308829137, 335032174, 336962933, 380797651, 378305476, 336617902, 393487098, 301391791, 394314232, 387440261, 316040738, 388074503, 396614889, 331609633, 374723367, 380418460, 349845809, 318514711, 308782485, 308291996, 375362898, 397542455, 397628325, 392446446, 368662132, 378781533, 372327607, 378737987};
        System.out.println(largestPerimeter(nums));

    }
    public static long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        long max=-1, sum=0;

        for(int i = 0; i < n; i++){
            sum += nums[i];
            if(i>=2){
                if(nums[i]<sum-nums[i]) max = sum;
            }
        }

        return max;
    }
}

/*2971. Find Polygon With the Largest Perimeter
 * You are given an array of positive integers nums of length n.
 * A polygon is a closed plane figure that has at least 3 sides. The longest side of a
 * polygon is smaller than the sum of its other sides. Conversely, if you have k (k >= 3)
 * positive real numbers a1, a2, a3, ..., ak where a1 <= a2 <= a3 <= ... <= ak and
 * a1 + a2 + a3 + ... + ak-1 > ak, then there always exists a polygon with k sides whose lengths
 * are a1, a2, a3, ..., ak.
 * The perimeter of a polygon is the sum of lengths of its sides.
 * Return the largest possible perimeter of a polygon whose sides can be formed from
 * nums, or -1 if it is not possible to create a polygon.
 * Input: nums = [1,12,1,2,5,50,3] Output: 12
 * Explanation: The polygon with the largest perimeter which can be made from nums has
 * 5 sides: 1, 1, 2, 3, and 5. The perimeter is 1 + 1 + 2 + 3 + 5 = 12.
 * We cannot have a polygon with either 12 or 50 as the longest side because it is not possible
 * to include 2 or more smaller sides that have a greater sum than either of them.
 * It can be shown that the largest possible perimeter is 12.*/
