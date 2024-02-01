package General;

import java.util.*;

public class PenStreamMax {
    public static void main(String[] args) {
        List<Character> pens = new ArrayList<>(Arrays.asList('b', 'b', 'g', 'r', 'v', 'r', 'v', 'b', 'r', 'r'));

        Map<Character, Integer>  penMap = new HashMap<>();
        for (Character c: pens) penMap.put(c, penMap.getOrDefault(c, 0)+1);

        System.out.println(penMap);

        int max = 0, min = Integer.MAX_VALUE;
        Character mxc = null, mnc = null;

        for (Character c:penMap.keySet()){
            if (penMap.get(c) > max){
                max = penMap.get(c);
                mxc = c;
            } else if (penMap.get(c) < min) {
                min = penMap.get(c);
                mnc = c;
            }
        }
        System.out.println(max+": "+mxc+", "+min+": "+mnc);

        Map.Entry<Character, Integer> mx = penMap.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();
        Map.Entry<Character, Integer> mn = penMap.entrySet().stream().min(Map.Entry.comparingByValue()).orElseThrow();

        System.out.println(mx+", "+mn);
    }
}
