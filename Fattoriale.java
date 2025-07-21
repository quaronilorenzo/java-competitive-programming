public class Fattoriale {
    public static void main(String[] args) {
        int x = 5;
        // Calcola il fattoriale di un numero n, usando una funzione ricorsiva.
        int sum = 1;
        for(int i = x; i != 1; i--){
            sum *=  i;
        }
        System.out.println(sum);
    }
}
