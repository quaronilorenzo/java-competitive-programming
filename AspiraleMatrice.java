public class AspiraleMatrice {
    public static void main(String[] args) {
        int[][] matrice = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12},
            {13,14, 15,16}
        };
        // 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
        int N = matrice.length;
        int top = 0;
        int bottom = N - 1;
        int left = 0;
        int right = N - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(matrice[top][i] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(matrice[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrice[bottom][i] + " ");
                }
                bottom--;
            }

            // ↑ dal basso verso l’alto
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrice[i][left] + " ");
                }
                left++;
            }
        }
        


    }
}
