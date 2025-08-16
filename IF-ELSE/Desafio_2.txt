import java.util.Scanner;

public class Desafio_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        input.nextLine(); // Consumir a quebra de linha pendente

        if (idade < 16) {
            System.out.println("Não pode votar!");
            return; // Sai do programa imediatamente
        }

        System.out.println("Seu título de eleitor está regular? (Sim/Não)");
        String titulo = input.nextLine();

        if (!"Sim".equalsIgnoreCase(titulo)) { 
            System.out.println("Não pode votar!");
            return;
        }

        System.out.println("Você está na sua zona eleitoral no dia da votação? (Sim/Não)");
        String zona = input.nextLine();

        if (!"Sim".equalsIgnoreCase(zona)) { 
            System.out.println("Não pode votar!");
            return;
        }

        System.out.println("Apto a votar!");
        input.close();
    }
}
