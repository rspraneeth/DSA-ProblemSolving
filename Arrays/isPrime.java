package Arrays;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime or not: ");
        int n = in.nextInt();
        boolean flag = false;
        for(int i = 2; i<n;i++){
            if (n%i == 0){
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.print("NO");
        }
        else{
            System.out.print("YES");
        }
    }
}
