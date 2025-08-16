import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu salário: R$");
        double salario = input.nextDouble();

        System.out.print("Empréstimo desejado: R$");
        double emprestimo = input.nextDouble();

        if (emprestimo < (30.0/100*salario)){
            System.out.println("Empréstimo concedido!");

        } else {
            System.out.println("Empréstimo negado!");
        }

        input.close();
    }
}