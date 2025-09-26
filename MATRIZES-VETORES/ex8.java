import java.util.Scanner;
import java.util.Arrays;

public class ex8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos alunos: ");
        int qtdAlunos = entrada.nextInt();

        System.out.print("Quantidade de notas: ");
        int qtdNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

        double total = 0;
        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++) {
                System.out.printf("Informe a nota %d do aluno %d: ", i + 1, j + 1);
                notasDaTurma[i][j] = entrada.nextDouble();
                total += notasDaTurma[i][j];
            }
        }

        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("Media da turma: " + media);

        System.out.println(Arrays.deepToString(notasDaTurma));
        entrada.close();
    }
}
