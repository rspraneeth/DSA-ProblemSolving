import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LC349_IntersectionArrays {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        Set<Integer> s1 = new HashSet<>();
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        for (int n: nums1) s.add(n);
        for (int n: nums2) {
            if (s.contains(n)) s1.add(n);
        }

        int[] n1 = new int[s1.size()];
        int i=0;
        for (int n: s1){
            n1[i]=n;
            i++;
        }

        System.out.println(Arrays.toString(n1));
    }
}
//Given two integer arrays nums1 and nums2, return an array of their intersection.
// Each element in the result must be unique and you may return the result in any order.