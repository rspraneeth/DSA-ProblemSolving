package Strings;

import java.util.Arrays;

public class SortLowerCaseAlpha {
    public static void main(String[] args) {
        String s = "babababababa";

        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++){
            int index = s.charAt(i)-'a';
            a[index]++;
        }
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < a.length; i++){
            while (a[i] > 0){
                ss.append((char) (97 + i));
                a[i]--;
            }
        }

        System.out.println(ss);
    }
}
