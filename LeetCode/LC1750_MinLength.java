public class LC1750_MinLength {
    public static void main(String[] args) {
        String s= "aabccabba";
        System.out.println(minimumLength(s));

    }

    public static int minimumLength(String s) {
        int i=0, j = s.length()-1, n=s.length();
        char c = 0;
        while (i < j && s.charAt(i)==s.charAt(j)){

            c = s.charAt(i);
            System.out.print(s.charAt(i)+" "+s.charAt(j)+" "+n+" ---- ");
            i++;
            j--;
            n-=2;
            System.out.println(s.charAt(i)+" "+s.charAt(j)+" "+n);

            while (s.charAt(i)==c && i <= j){
                i++;n--;
                System.out.println("i check exec");
            }
            while (s.charAt(j)==c && i < j){
                j--;n--;
                System.out.println("j check exec");
            }
            System.out.println(s.charAt(i)+" "+s.charAt(j)+" "+n);
        }
        return s.length()==1?1:n;
    }
}


//https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/?envType=daily-question&envId=2024-03-10