/*Problem Description: You are given an integer array A. You have to find the
second-largest element/value in the array or report that no such element exists.

Problem Constraints
1 <= |A| <= 105
0 <= A[i] <= 109

Input Format: The first argument is an integer array A.
Output Format: Return the second-largest element. If no such element exist then return -1.*/

import java.util.ArrayList;
import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 4, 1, 6, 3, 54, 65, 34, 234, 74, 38, 30));
        System.out.println(sMax(A));
    }

    private static int sMax(ArrayList<Integer> a) {
        int n = a.size();
        if (n==1) return -1;

        int fmax = -1;
        int smax = -1;

        for (int el: a){
            if (el > fmax){
                smax = fmax;
                fmax = el;
            } else if (el > smax) {
                smax = el;
            }
        }

        return  smax;
    }
}
