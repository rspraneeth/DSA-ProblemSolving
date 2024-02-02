package Strings;

public class AlphaNumerical {
    public static void main(String[] args) {
        char[] s = {'a', 'B', '0', '@', 'E', 'j'};
        System.out.println(solve(s));
    }

    public static int solve(char[] A) {
        for(int i=0;i<A.length;i++){
            char ch = A[i];
            if((ch>='A' &&ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                continue;
            }
            else{
                return 0;
            }
        }
        return 1;
    }
}
