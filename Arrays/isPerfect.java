import java.util.Scanner;

public class isPerfect {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n>0){
            int a = in.nextInt();
            int s = 0;
            for (int i=1;i<a/2+1;i++){
                if (s==a)
                    break;
                else if (a%i==0)
                    s += i;
                if (s>a)
                    break;
            }
            if (s==a)
                System.out.println("YES");
            else
                System.out.println("NO");
            n--;
        }

    }
}

// You are given N positive integers. For each given integer A,
// you have to tell whether it is a perfect number or not.
//A perfect number is a positive integer which is equal
// to the sum of its proper positive divisors.