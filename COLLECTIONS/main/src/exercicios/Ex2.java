package exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex2 {
    /*
        - 2. Apresente o menu de opções abaixo:
            1 – Cadastrar número
            2 – Mostrar números pares
            3 – Excluir número
            4 – Sair
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> fila = new LinkedList<>();
        int opcao;

        do {
            // Exibe o menu sempre
            System.out.println("\n--- MENU ---");
            System.out.println("1 – Cadastrar número");
            System.out.println("2 – Mostrar números pares");
            System.out.println("3 – Excluir número");
            System.out.println("4 – Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Quantos números deseja cadastrar? ");
                    int quantidade = sc.nextInt();

                    for (int i = 0; i < quantidade; i++) {
                        System.out.print("Digite o número " + (i + 1) + ": ");
                        int valor = sc.nextInt();
                        fila.add(valor);
                    }
                    System.out.println("Números cadastrados: " + fila);
                    break;

                case 2:
                    System.out.println("Números pares cadastrados:");
                    for (Integer num : fila) {
                        if (num % 2 == 0) {
                            System.out.println(num + " é par!");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Números cadastrados: " + fila);
                    System.out.print("Quantos números deseja excluir? ");
                    int num_qtd = sc.nextInt();

                    for (int i = 0; i < num_qtd; i++) {
                        System.out.print("Digite o número que deseja excluir: ");
                        int num_excluir = sc.nextInt();
                        fila.remove(num_excluir);
                    }
                    System.out.println("Fila atualizada: " + fila);
                    break;

                case 4:
                    System.out.println("Finalizando programa...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }

        } while (opcao != 4);

        sc.close();
    }
}
