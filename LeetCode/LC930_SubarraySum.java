public class LC930_SubarraySum {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0,1};
        int goal = 2;
        System.out.println(numSubarraysWithSum(nums, goal));
    }

    public static int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
//        int[] pf = new int[n];
//        pf[0]=nums[0];
//        for(int i = 1; i<n; i++) pf[i]=pf[i-1]+nums[i];

        int count=0, sum=0, steps=0;

        for(int i = 0; i < n; i++){
            steps++;
            sum+=nums[i];
            if(sum==goal) count++;
            int k = 0, s=sum;
            for(int j=i+1; j < n; j++ ){
                steps++;
                s=s-nums[k]+nums[j];
                k++;
                if(s==goal) count++;
            }
        }
        System.out.println("steps "+steps);
        return count;

    }
}
