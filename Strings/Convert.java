package Strings;

import java.util.Arrays;

public class Convert {
    public static void main(String[] args) {
        char[] s = {'a', 'B', '0', '@', 'E', 'j'};

        for (int i = 0; i < s.length; i++){
            if (s[i] >= 'a' && s[i] <= 'z') s[i] = (char)(s[i]-32);
            else if (s[i] >= 'A' && s[i] <= 'Z') s[i] = (char)(s[i]+32);
        }
        System.out.println(Arrays.toString(s));
    }
}
