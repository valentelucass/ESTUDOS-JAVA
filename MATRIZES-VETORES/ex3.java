public class ex3 {
    public static void main(String[] args) {
        int[][] matrizA = {
                {1, 2},
                {4, 5},
        };

        int[][] matrizB = {
                {5, 2},
                {9, 2},

        };

        int[][] matrizC = new int[2][2];

        for (int linha = 0; linha < matrizA.length; linha++) {
            for (int coluna = 0; coluna < matrizB[linha].length; coluna++) {
                matrizC[linha][coluna] = (matrizA[linha][coluna])*(matrizB[linha][coluna]);
            }
        }
        for (int linha = 0; linha < matrizC.length; linha++) {
            for (int coluna = 0; coluna < matrizC[linha].length; coluna++) {
                System.out.print(matrizC[linha][coluna] + "\t");
            }
            System.out.println(); // Pula para a próxima linha da matriz
        }
    }
}
