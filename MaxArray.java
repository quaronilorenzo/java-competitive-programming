public class MaxArray {
    public static void main(String args[]){
        int arr[] = {1,2,10,4,5};
        int max =  0;
        for(int i = 0 ;  i < arr.length; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        System.out.println(arr[max]);
    }
}
