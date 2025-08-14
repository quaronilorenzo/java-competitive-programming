package SortingAlgorthms;

public class bubbleSort {
    public static void bubbleSortFunction(int[] arr){
        int temp;
        int len = arr.length;
        for(int k = 0; k< len-1; k++) {
            for(int i = 0; i < len-k-1; i++) {
                if(arr[i] > arr[i+1] ) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {23,45,2,5,6};
        bubbleSortFunction(arr);
    }
}
