package SortingAlgorthms;

public class bubbleSort {
    public static int[] bubbleSortFunction(int[] arr){
        int temp;
        int n = arr.length;
        for(int k = 0; k< n-1; k++) {
        // (n-k-1) is for ignoring comparisons of elements which have already been compared in earlier iterations
            for(int i = 0; i < n-k-1; i++) {
                if(arr[i] > arr[i+1] ) {
                    // here swapping of positions is being done.
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {23,45,2,5,6};
        System.out.println(bubbleSortFunction(arr));
    }
}
