package CompetitiveProgramming;
public class NumPari {
    public static void main(String[] args) {
    //  Stampa tutti i numeri pari in un array di interi.
        int a[] = {1,2,3,4,5,6,7,8};
        for(int num : a){
            if(num%2 == 0){
                System.out.println(num);
            }
        }
    }
}
