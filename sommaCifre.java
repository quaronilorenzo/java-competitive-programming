public class sommaCifre {
    public static void main(String[] args) {
        int numero = 1234;
        int somma = 0;
        while (numero > 0) {
            int cifra = numero % 10;
            somma += cifra;
            numero = numero / 10;
        }

        System.out.println(somma);
        
    }
}
