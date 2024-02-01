public class QuikSort {
    public static void main(String[] args) {
        int[] a = {10, 5, 11, 2, 1, 9, 15};
        quick(a, 0, a.length-1);

        System.out.println("\n\nAfter Sorting");
        for (int num : a) {
            System.out.print(num+" ");
        }

    }

    private static void quick(int[] a, int low, int high) {
        if (low<high){
            int pi = partition(a, low, high);
            quick(a, low, pi-1);
            quick(a, pi+1, high);
        }

    }

    private static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low-1;

        for (int j = low; j <= high; j++){
            if (a[j] < pivot){
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int pi = i+1;
        int temp = a[pi];
        a[pi] = a[high];
        a[high] = temp;

        return pi;
    }
}
