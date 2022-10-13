package PrefixSum;

import java.util.ArrayList;

public class PrefixSumArray {
    public int[] pfSumArray(ArrayList<Integer> A){
        int[] pf = new int[A.size()];
        pf[0]= A.get(0);
        for (int i = 1; i < A.size(); i++) pf[i] = pf[i-1] + A.get(i);
        return pf;
    }

    public int[] pfOddEven(ArrayList<Integer> A){
        int[] pfeo = new int[A.size()];
        pfeo[0] = A.get(0);
        pfeo[1] = A.get(1);
        for (int i = 2; i < A.size(); i++)
            pfeo[i] = pfeo[i-2] + A.get(i);
        return pfeo;
    }
}
