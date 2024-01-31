package PrefixSum;

// Given 'N' array elements, count no of elements having at least one element greater than itself.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountMax {
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 7, 3, 2, 10, 8};
        System.out.println(cmax(arr));

    }

    private static int cmax(int[] arr) {
        int count = 0;
        int n = arr.length;
        int max = arr[0];
        for (int i = 0; i < n; i++){

            if(arr[i] == max) count++;

            if (arr[i] > max) max = arr[i];

        }

        return n-count;
    }
}
