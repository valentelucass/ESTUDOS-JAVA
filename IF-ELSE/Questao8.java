import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senha = input.nextLine();

        if (senha.equals("R10p5")){
            System.out.println("Acesso concedido!");

        } else {
            System.out.println("Acesso negado!");
        }

        input.close();
    }
}