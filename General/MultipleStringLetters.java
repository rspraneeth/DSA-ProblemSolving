package General;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MultipleStringLetters {
    public static void main(String[] args) {
        String word = "hhjjhhkk";
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < word.length(); i++){
            Character c = word.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }

        hm.forEach((k, v)->{ System.out.print(k+": "+v+", "); });

        for (Map.Entry<Character, Integer> entry : hm.entrySet()){
            System.out.print(entry.getKey()+": "+entry.getValue()+", ");
        }
    }
}
