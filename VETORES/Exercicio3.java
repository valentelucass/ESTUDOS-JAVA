import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomes[] = new String[5];

        for (int i = 0; i < 5; i++){
            System.out.print(i + " - Escreva o nome: ");
            nomes[i] = input.nextLine();
        }

        for (int i = 4; i >= 0; i--){ // vai imprimir ao contrário com essa condição aqui
            System.out.print(nomes[i] + ", ");
        }

        System.out.println(); // pula linha
        
        System.out.println("Primeiro nome: " + nomes[0]);
        System.out.println("Último nome: " + nomes[4]);
        System.out.println(); // pula linha

        input.close();
    }
}
