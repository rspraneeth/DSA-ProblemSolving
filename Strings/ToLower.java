package Strings;

import java.util.Arrays;

public class ToLower {
    public static void main(String[] args) {
        char[] a= {'A', 'B', 'C'};
        for (int i = 0; i < a.length; i++){
            a[i] = (char)(a[i]+32);
        }


        System.out.println(Arrays.toString(a));


    }
}
