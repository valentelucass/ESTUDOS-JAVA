import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu salário: R$");
        double salario = input.nextDouble();

        if (salario <= 600) {
            System.out.println("Resultado: Isento");
        } else if (salario > 600 && salario <= 1200) {
            System.out.println("Resultado:" + (20.0/100*salario));
        } else if (salario > 1200 && salario <= 2000) {
            System.out.println("Resultado: " + (25.0/100*salario));
        } else if (salario > 2000) {
            System.out.println("Resultado: " + (30.0/100*salario));
        }

        input.close();
    }
}