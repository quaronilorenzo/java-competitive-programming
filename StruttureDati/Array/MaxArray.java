package StruttureDati.Array;
public class MaxArray {
    public static void main(String args[]){
        int arr[] = {1,2,10,4,6,6100,1000,3000};
        int max =  0;
        for(int i = 0 ;  i < arr.length; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        System.out.println(arr[max]);
    }
}
