package Strings;

//Given a string Return the length of longest palindromic substring
public class PalindromeSubString {
    public static void main(String[] args) {
        String s = "ababcbab";

        int len=1,l,r, c;
        for (int i = 1; i < s.length()-1; i++){
            l = i-1;
            r = i+1;
            c=1;
            while (l >= 0 && r <= s.length()-1 && s.charAt(l)==s.charAt(r)){
                l--;
                r++;
                c+=2;
            }

            len=Math.max(len, c);
//            System.out.println(len);
        }

        System.out.println(len);
    }
}
