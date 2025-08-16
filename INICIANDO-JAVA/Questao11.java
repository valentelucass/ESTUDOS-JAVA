import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //11 - Construir um algoritmo que leia:
        //– o ano de nascimento de uma pessoa e o ano atual.
        //- Calcule e mostre:
        //– a idade dessa pessoa;
        //– quantos anos essa pessoa terá em 2030.

        System.out.println("Coloque aqui a idade: ");
        int idade = input.nextInt();

        int ano_futuro = 2030;
        int ano_atual = 2025;

        int idade_futura = idade + (ano_futuro - ano_atual);

        System.out.println("Idade atual: " + idade + " anos.");
        System.out.println("Idade em 2030: " + idade_futura + " anos.");

        input.close();

    }
}