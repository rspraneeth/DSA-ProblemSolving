package Strings;
//Find the number of occurrences of bob in string A
public class FindSubString {
    public static void main(String[] args) {
        String a = "bobasjsbob sdkjsa bob skjn skjbob";
        int c = 0;
        for (int i = 0; i < a.length()-2; i++){
            if (a.startsWith("bob", i)) c++; //if (a.substring(i, i+3).equals("bob")) c++;
        }
        System.out.println(c);
    }
}
