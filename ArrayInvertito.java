import java.util.Arrays;

public class ArrayInvertito {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int invertito[] = new int[arr.length];
                for (int i = 0; i < arr.length; i++) {
                    invertito[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(invertito));
    }
}