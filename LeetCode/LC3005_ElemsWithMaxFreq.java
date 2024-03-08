import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;

public class LC3005_ElemsWithMaxFreq {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4,};
        System.out.println(freqCount(nums));

        System.out.println("sssss: "+freqCount1(nums));


    }

    private static int freqCount1(int[] nums) {
//        int mx = Arrays.stream(nums).max().orElse(0);
        int mx = Integer.MIN_VALUE;
        for(int n: nums) if (n>mx) mx=n;

        int[] arr = new int[mx+1];

        for (int n: nums) arr[n]++;

//        int mxF = Arrays.stream(arr).max().orElse(0);
        int mxF=Integer.MIN_VALUE;
        int s=0;
        for (int n: arr) {
            if (n==mxF) {
                s+=mxF;
            }
            else if (n>mxF){
                mxF=n;
                s=mxF;
            }
        }

        return s;
//        return Arrays.stream(arr).filter((n)->n==mxF).sum();

    }

    private static int freqCount(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int n: nums){
            count.put(n, count.getOrDefault(n, 0)+1);
        }
        System.out.println(count);

        Integer c = count.values().stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println(c);
        return count.values().stream().mapToInt(entry -> (entry.equals(c) ? c : 0)).sum();
    }
}


//3005. Count Elements With Maximum Frequency
//You are given an array nums consisting of positive integers.
//Return the total frequencies of elements in nums such that those elements all
// have the maximum frequency.
//The frequency of an element is the number of occurrences of that element in the array.

//Example 1:
//Input: nums = [1,2,2,3,1,4]
//Output: 4
//Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum
//frequency in the array.
//So the number of elements in the array with maximum frequency is 4.