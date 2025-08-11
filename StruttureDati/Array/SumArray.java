package StruttureDati.Array;
public class SumArray {
        public static void main(String[] args) {
    //  Somma di tutti i contenuti dell'array.
        int a[] = {1,2,3};
        int sum = 0;
        for(int i = 0; i < a.length ; i++){
            sum += a[i];
        }
        System.out.println(sum);
    }
}
