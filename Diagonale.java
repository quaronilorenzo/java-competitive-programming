public class Diagonale {
    public static void main(String[] args) {
        // Stampa una matrice 5x5 piena di 1 tranne la diagonale principale a 0
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
