package General;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        System.out.println(randMath());
        System.out.println(randTimeMillis());
        System.out.println(new Random().nextFloat(20, 40));
    }

    private static int randMath(){
        return (int)(Math.random()*1000000);
    }

    private static int randTimeMillis(){
        return ((int) System.currentTimeMillis()%1000000);
    }
}
