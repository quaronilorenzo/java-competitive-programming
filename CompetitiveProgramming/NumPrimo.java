package CompetitiveProgramming;
public class NumPrimo {
    public static void main(String[] args){
        int num = 169  ;
        int x = 2;
        boolean primo = true;
        for(int i = 0; i <= Math.sqrt(num); i++){ // i numeri primi possono arrivare fino a il n^2
            if(num % x == 0 && num != x){
                primo = false;
                break;
            }
            x++;
        }
        System.out.println(primo);
    }
}