public class ex1 {
    public static void main(String[] args) {

        int[][] matrizA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrizB = {
                {5, 2, 4},
                {9, 2, 6},
                {7, 8, 6}
        };

        int[][] matrizC = new int[3][3];

        for (int linha = 0; linha < matrizA.length; linha++) {
            for (int coluna = 0; coluna < matrizB[linha].length; coluna++) {
                matrizC[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna];
            }
        }

        // Impressão em formato de matriz
        for (int linha = 0; linha < matrizC.length; linha++) {
            for (int coluna = 0; coluna < matrizC[linha].length; coluna++) {
                System.out.print(matrizC[linha][coluna] + "\t"); // \t dá um espaçamento
            }
            System.out.println(); // quebra de linha
        }
    }
}
