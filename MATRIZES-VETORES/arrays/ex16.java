package arrays;
import java.util.Arrays;

public class ex16 {
    public static void main(String[] args) {
        int[][] A = {
                {2, 3},
                {1, 4}
        };

        int[][] B = {
                {5, 2},
                {0, 1}
        };

        int[][] resultado = new int[2][2];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    resultado[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(resultado));
    }
}
