import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarefas {
    // Métodos já fornecidos
    public static void exibirMenu() {
        System.out.println("=== MENU LISTA DE TAREFAS ===");
        System.out.println("1 - Adicionar tarefa");
        System.out.println("2 - Listar tarefas");
        System.out.println("3 - Concluir tarefa");
        System.out.println("4 - Remover tarefa");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static int lerEntrada() {
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        sc.nextLine(); // limpar o buffer
        return opcao;
    }

    public static void pausarTela() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pressione Enter para continuar...");
        sc.nextLine();
    }

    // Classe interna para representar uma tarefa
    static class Tarefa {
        String descricao;
        boolean concluida;

        Tarefa(String descricao) {
            this.descricao = descricao;
            this.concluida = false;
        }

        @Override
        public String toString() {
            return descricao + (concluida ? " [Concluída]" : "");
        }
    }
}