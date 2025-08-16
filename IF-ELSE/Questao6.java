import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o sexo (Masculino/Feminino): ");
        String sexo = input.nextLine().trim();

        System.out.println("Digite a altura (Ex: 1,55): ");
        double altura = input.nextDouble();

        double pesoIdeal;

        if (sexo.equalsIgnoreCase("masculino")) {
            pesoIdeal = (72.7 * altura) - 58.0;
        } else if (sexo.equalsIgnoreCase("feminino")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        }else {
            System.out.println("Erro: Sexo inválido! Digite 'Masculino' ou 'Feminino'.");
            input.close();
            return; // Sai do programa se a entrada for inválida

        }
            System.out.printf("Peso ideal: %.2f kg%n", pesoIdeal);
    input.close();

    }
}