import java.util.ArrayList;
import java.util.Arrays;

public class MultipleRotations_OofN {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(A);

        ReverseArray.reverseArr(A, 0, A.size()-1);
        ReverseArray.reverseArr(A, 0, 1);
        ReverseArray.reverseArr(A, 2, A.size()-1);

        System.out.println(A);
    }
}
