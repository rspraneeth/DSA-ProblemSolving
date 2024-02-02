package Strings;

import java.util.Arrays;

public class StringRev {
    public static void main(String[] args) {
        String s = "Hi how are you";
        String[] a = s.split(" ");
        //System.out.println(Arrays.toString(a));
        int l = 0, r = a.length-1;
        String temp;
        while (l < r){
            temp = a[l];
            a[l] = a[r];
            a[r] = temp;

            l++;r--;
        }

        StringBuilder fin= new StringBuilder();
        for (int i = 0; i < a.length;i++){
            if (i == a.length-1) fin.append(a[i]);
            else fin.append(a[i]).append(" ");
        }

        System.out.println(fin);
    }
}
