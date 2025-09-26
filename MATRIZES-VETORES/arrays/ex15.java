package arrays;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ex15 {
        public static void main(String[] args) {
            int[][] A = {
                    {1, 2, 3},
                    {4, 5, 6}
            };

            int[][] B = {
                    {6, 5, 4},
                    {3, 2, 1}
            };

            int[][] soma = new int[2][3];

            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    soma[i][j] = A[i][j] + B[i][j];
                }
            }
            System.out.println(soma[1][0]);
        }
}
