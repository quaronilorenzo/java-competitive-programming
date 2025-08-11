public class sommaDiagonale {
    public static void main(String[] args) {
        // Data una matrice quadrata NxN, calcola la somma degli elementi della diagonale principale e della secondaria
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int sum = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(i == j){
                    sum += mat[i][j];
                }
                if(i==j+1){
                    sum += mat[i][j];
                }
            }
        }
        System.out.println(sum);

    }
}
