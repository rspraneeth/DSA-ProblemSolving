package Strings;

public class SingleStringRev {
    public static void main(String[] args) {
        String a = "hello";
        char[] s = a.toCharArray();
        int l = 0, h = s.length-1;
        while (l < h){
            char t = s[l];
            s[l] = s[h];
            s[h] = t;
            l++;h--;
        }

        System.out.println(new String(s));
    }
}
