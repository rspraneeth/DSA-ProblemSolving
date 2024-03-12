public class LC791_CustomString {
    public static void main(String[] args) {
        String order = "cba", s = "abcd";
        System.out.println(customSortString(order, s));
    }

    public static String customSortString(String order, String s) {
        int[] arr = new int[26]; //saving chars in s with respective position in array, along with occurrences
        for (int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++; // occurrences
        }

        StringBuilder st = new StringBuilder();

        //for chars in order, appending all chars present in arr, (maintaining order)
        for (int i=0; i<order.length(); i++){
            int pos = order.charAt(i)-'a';
            while (arr[pos]>0){
                st.append(order.charAt(i));
                arr[pos]--;
            }
        }


        //appending other characters which are not present in 'order'
        for (int i=0; i<arr.length; i++){
            while (arr[i]>0) {
                st.append((char)(i+'a'));
                arr[i]--;
            }
        }


        return st.toString();
    }
}


/*You are given two strings order and s. All the characters of order are unique and
were sorted in some custom order previously. Permute the characters of s so that
they match the order that order was sorted. More specifically, if a character x
occurs before a character y in order, then x should occur before y in the permuted string.
Return any permutation of s that satisfies this property.*/

