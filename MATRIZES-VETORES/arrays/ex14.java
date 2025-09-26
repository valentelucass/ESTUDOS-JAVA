package arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class ex14 {
    public static void main(String[] args) {
        int[][] matriz = {
                {7,1,2,3,1},
                {5,2,8,5,8},
                {6,1,9,3,2}
        };

        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        System.out.println(soma);
    }
}
