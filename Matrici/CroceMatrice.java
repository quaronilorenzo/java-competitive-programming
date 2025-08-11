public class CroceMatrice {

    public static void main(String[] args) {
        int[][] matrice = {
            {1,  2,  3},
            {4,  5,  6},
            {7,  8,  9}
        };

        int righe = matrice.length;
        int colonne = matrice[0].length;

        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                // Diagonale principale: i == j
                // Diagonale secondaria: i + j == colonne - 1
                if (i == j || i + j == colonne - 1) {
                    System.out.print(matrice[i][j] + "\t");
                } else {
                    System.out.print("\t"); // spazio vuoto
                }
            }
            System.out.println();
        }
    }
}
