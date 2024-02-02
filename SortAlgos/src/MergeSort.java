public class MergeSort {

    public static void main(String[] args) {
        int[] a = {10, 5, 11, 2, 1, 9, 15};
        mergeS(a, 0, a.length-1);

        System.out.println("\n\nAfter Sorting");
        for (int num : a) {
            System.out.print(num+" ");
        }

    }

    private static void mergeS(int[] a, int l, int r) {
        if (l < r){
            int m = (l+r)/2;
            mergeS(a, l, m);
            mergeS(a, m+1, r);
            merging(a, l, m , r);
        }
    }

    private static void merging(int[] a, int l, int m, int r) {
        int n1 = m-l+1; //+1 because array is 0 index based, here l, m , r are indices based on 0 indexing
        int n2 = r-m;
        int[] la = new int[n1];
        int[] ra = new int[n2];

        //copy to la, ra
        for(int x = 0; x < n1; x++) la[x] = a[l+x];

        for(int x = 0; x < n2; x++) ra[x] = a[m+1+x];

        int i = 0, j = 0, k = l;

        while (i < n1 && j <n2){
            if (la[i]<=ra[j]){
                a[k] = la[i];
                i++;
            } else {
                a[k] = ra[j];
                j++;
            }
            k++;
        }

        while (i < n1){
            a[k] = la[i];
            i++; k++;
        }

        while (j < n2){
            a[k] = ra[j];
            j++; k++;
        }

    }
}
