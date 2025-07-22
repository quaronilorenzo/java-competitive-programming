public class AspiraleContraria {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = mat.length;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        while(top <= bottom && left <= right){
            for(int i = top; i <= bottom; i++){
                System.out.println(mat[i][left] + " ");
            }
            left++;
            for(int i = left; i <= right; i++){
                System.out.println(mat[bottom][i] +  " ");
            }
            bottom--;
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    System.out.println(mat[bottom][i] + " ");
                }
                right--;
            }
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    System.out.println(mat[top][i]);
                }
                top++;
            }

        }



    
    
    }
}
