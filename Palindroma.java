import java.util.Scanner;

public class Palindroma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci una parola: ");
        String parola = sc.nextLine();
        sc.close();

        String inversa = "";
        for (int i = parola.length() - 1; i >= 0; i--) {
            inversa += parola.charAt(i); // concatena a inversa la lettera [i] della parola
        }

        if (parola.equals(inversa)) {
            System.out.println("È palindroma!");
        } else {
            System.out.println("Non è palindroma.");
        }
    }
}
