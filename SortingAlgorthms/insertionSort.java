package SortingAlgorthms;

public class insertionSort {
    public static void insertionSortFunction(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i]; // salvo l'array princ
            int j = i - 1; // parto dall'ultimo elemento della parte ordinata
            while(j >= 0 && arr[j] > key ){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,2,15,4,3,2};
        insertionSortFunction(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
