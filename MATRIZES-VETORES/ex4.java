public class ex4 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int i = matriz.length;
        int j = matriz[0].length;

        int[][] transposta = new int[j][i];

        System.out.println("Matriz Original:");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
                transposta[coluna][linha] = matriz[linha][coluna];
            }
            System.out.println();
        }

        System.out.println("\nMatriz Transposta:");
        for (int linha = 0; linha < transposta.length; linha++) {
            for (int coluna = 0; coluna < transposta[linha].length; coluna++) {
                System.out.print(transposta[linha][coluna] + "\t");
            }
            System.out.println(); // quebra de linha
        }
    }
}
