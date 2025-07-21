public class Fattoriale {
    public int x = 2;
    public static void main(String[] args) {
        // Calcola il fattoriale di un numero n, usando una funzione ricorsiva.
        int sum = 1;
        for(int i = 5; i != 1; i--){
            sum *=  i;
        }
        System.out.println(sum);
    }
}
