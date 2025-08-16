import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Esse foi de longe o código mais complicado que fiz até agora, mas fico feliz por ter tido êxito */

        int totalAprovados = 0; // Contador de alunos aprovados
        int totalExames = 0;
        int totalReprovados = 0;

        double somaNota1 = 0; // Acumula todas as notas digitadas
        double somaNota2 = 0;

        for (int i = 1; i <= 6; i++) { // Loop para os 6 alunos
            System.out.println("Aluno " + i + ":");

            System.out.print("Primeira nota: ");
            double nota1 = input.nextDouble();
            somaNota1 += nota1;
    
            System.out.print("Segunda nota: ");
            double nota2 = input.nextDouble();
            somaNota2 += nota2;

            // Calcula a média individual do aluno
            double media = (nota1 + nota2) / 2;

            // Exibe o resultado individual
            System.out.println("Média do aluno " + i + ": " + media);
            if (media >= 7){
                System.out.println("Aprovado!");
                totalAprovados++; // Incrementa o número de aprovados

            } else if (media > 3 && media < 7) {
                System.out.println("EXAME!");
                totalExames++;

            } else {
                System.out.println("RESPROVADO!");
                totalReprovados++;
            }
            System.out.println("---------------------"); // Apenas para separar os alunos
        }
        System.out.println("Total de alunos aprovados: " + totalAprovados);
        System.out.println("Total de alunos em exame: " + totalExames);
        System.out.println("Total de alunos reprovados: " + totalReprovados);

        double media = (somaNota1 + somaNota2) / (6 * 2); // 6 alunos, cada um com 2 notas
        System.out.println("Média geral das notas: " + String.format("%.2f", media));

        input.close();
    }
}
