import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite quantos anos tem na empresa: ");
        int anos = input.nextInt();

        System.out.println("Qual seu salário? ");
        double salario = input.nextDouble();

        double bonus;

        if (anos >= 5) {
            bonus = ((20.0/100)*salario); //nessa parte se não estiver 20.0 daria o resultado 0.
                                          //Em Java, 20 / 100 retorna 0, pois a divisão de inteiros ignora casas decimais.
        } else {
            bonus = (0.10*salario); //essa seria outra forma de fazer
        }
            System.out.println("Seu bônus é: " + bonus);

    input.close();

    }
}