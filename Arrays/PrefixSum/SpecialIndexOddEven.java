package PrefixSum;

import java.util.ArrayList;
import java.util.List;

public class SpecialIndexOddEven {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(List.of(2, 1, 6, 4));
        System.out.println(solve(a));
    }

    public static int solve(ArrayList<Integer> A) {
        int c = 0;
        PrefixSumArray pf = new PrefixSumArray();
        int[] pfEven = pf.pfEven(A);
        int[] pfOdd = pf.pfOdd(A);
        int t_even, t_odd, n = A.size();
        for (int i = 0; i < n; i++){
            if (i == 0){
                t_even = pfOdd[n-1];
                t_odd = pfEven[n-1] - pfEven[0];
            }
            else {
                t_even = pfEven[i-1] + pfOdd[n-1] - pfOdd[i];
                t_odd = pfOdd[i-1] + pfEven[n-1] - pfEven[i];
            }
            if (t_even == t_odd) c++;
        }
        return c;
    }
}
