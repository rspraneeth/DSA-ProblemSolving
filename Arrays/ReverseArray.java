import java.util.ArrayList;

public class ReverseArray {
    public static void reverseArr(ArrayList<Integer> A, int i, int j) {
        int t;
        while(i<j){
            t = A.get(i);
            A.set(i, A.get(j));
            A.set(j, t);
            i = i + 1;
            j = j - 1;
        }
    }
}
