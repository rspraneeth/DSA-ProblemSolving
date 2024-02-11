package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    static int[] dp;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        dp = new int[n+1];
        System.out.println(fib(n));
        Arrays.stream(dp).forEach(i-> System.out.print(i+" "));
        System.out.println();
        System.out.println(fibn(n));
        System.out.println();
        System.out.println(fibonacci(n));

    }

    private static int fib(int n) { //recursion
        if (n<=1) return dp[n]=n;
        else if (dp[n]!=0) return dp[n];
        else return dp[n]=fib(n-1)+fib(n-2);
    }

    private static int fibn(int n){ //iterative
        dp[0]=0;
        if (n==1) dp[1]=1;
        for (int i = 2; i <=n; i++) dp[i]=dp[i-1]+dp[i-2];
        return dp[n];
    }

    private static int fibonacci(int n){ //simple, without extra space
        int prev1 = 1, prev2 = 0, fib=0;
        if (n==0 || n==1) return n;
        for (int i=2; i <=n; i++) {
            fib=prev1+prev2;
            prev2=prev1;
            prev1=fib;
        }
        return fib;
    }
}
