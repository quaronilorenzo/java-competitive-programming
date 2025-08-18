package SortingAlgorthms;

public class quickSort {

    // Funzione ricorsiva QuickSort
    public static void qs(int[] arr, int l, int r) {
        if (l >= r)
            return;

        int p = partition(arr, l, r); 
        qs(arr, p + 1, r); 
    }
    public static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = l - 1;

        for (int j = l; j <= r - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,0};
        qs(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    } 
}
