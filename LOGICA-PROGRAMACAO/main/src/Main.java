import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<ListaTarefas.Tarefa> tarefas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            ListaTarefas.exibirMenu();
            opcao = ListaTarefas.lerEntrada();

            switch (opcao) {
                case 1: // Adicionar tarefa
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = sc.nextLine();
                    tarefas.add(new ListaTarefas.Tarefa(descricao));
                    System.out.println("Tarefa adicionada com sucesso!");
                    ListaTarefas.pausarTela();
                    break;

                case 2: // Listar tarefas
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        System.out.println("=== LISTA DE TAREFAS ===");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + " - " + tarefas.get(i));
                        }
                    }
                    ListaTarefas.pausarTela();
                    break;

                case 3: // Concluir tarefa
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa para concluir.");
                    } else {
                        System.out.print("Digite o número da tarefa a concluir: ");
                        int indiceConcluir = ListaTarefas.lerEntrada() - 1;
                        if (indiceConcluir >= 0 && indiceConcluir < tarefas.size()) {
                            tarefas.get(indiceConcluir).concluida = true;
                            System.out.println("Tarefa marcada como concluída!");
                        } else {
                            System.out.println("Número inválido!");
                        }
                    }
                    ListaTarefas.pausarTela();
                    break;

                case 4: // Remover tarefa
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa para remover.");
                    } else {
                        System.out.print("Digite o número da tarefa a remover: ");
                        int indiceRemover = ListaTarefas.lerEntrada() - 1;
                        if (indiceRemover >= 0 && indiceRemover < tarefas.size()) {
                            tarefas.remove(indiceRemover);
                            System.out.println("Tarefa removida com sucesso!");
                        } else {
                            System.out.println("Número inválido!");
                        }
                    }
                    ListaTarefas.pausarTela();
                    break;

                case 0: // Sair
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    ListaTarefas.pausarTela();
            }
        } while (opcao != 0);

        sc.close();
    }
}