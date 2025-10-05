package exercicios;

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Stack<Double>> alunosNotas = new HashMap<>();
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 – Cadastrar aluno");
            System.out.println("2 – Cadastrar nota");
            System.out.println("3 – Calcular a média de um aluno");
            System.out.println("4 – Listar os nomes dos alunos sem notas");
            System.out.println("5 – Excluir aluno");
            System.out.println("6 – Excluir nota");
            System.out.println("7 – Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Quantos alunos deseja cadastrar? ");
                    int qtdAlunos = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < qtdAlunos; i++) {
                        System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
                        String nome = sc.nextLine();
                        alunosNotas.put(nome, new Stack<>());
                    }
                    break;

                case 2:
                    System.out.print("Digite o nome do aluno para cadastrar nota: ");
                    String aluno = sc.nextLine();
                    if (alunosNotas.containsKey(aluno)) {
                        System.out.print("Quantas notas deseja cadastrar? ");
                        int qtdNotas = sc.nextInt();
                        Stack<Double> notas = alunosNotas.get(aluno);
                        for (int i = 0; i < qtdNotas; i++) {
                            System.out.print("Digite a nota " + (i + 1) + ": ");
                            notas.push(sc.nextDouble());
                        }
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do aluno para calcular a média: ");
                    String alunoMedia = sc.nextLine();
                    if (alunosNotas.containsKey(alunoMedia)) {
                        Stack<Double> notasAluno = alunosNotas.get(alunoMedia);
                        if (!notasAluno.isEmpty()) {
                            double total = 0;
                            for (double n : notasAluno) total += n;
                            double media = total / notasAluno.size();
                            System.out.println("Média do aluno " + alunoMedia + ": " + media);
                        } else {
                            System.out.println("Aluno não possui notas cadastradas.");
                        }
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;

                case 4:
                    System.out.println("Alunos sem notas:");
                    for (String a : alunosNotas.keySet()) {
                        if (alunosNotas.get(a).isEmpty()) {
                            System.out.println(a);
                        }
                    }
                    break;

                case 5:
                    System.out.print("Digite o nome do aluno a excluir: ");
                    String alunoExcluir = sc.nextLine();
                    if (alunosNotas.remove(alunoExcluir) != null) {
                        System.out.println("Aluno excluído com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;

                case 6:
                    System.out.print("Digite o nome do aluno para excluir a nota: ");
                    String alunoNota = sc.nextLine();
                    if (alunosNotas.containsKey(alunoNota)) {
                        Stack<Double> notasAluno = alunosNotas.get(alunoNota);
                        if (!notasAluno.isEmpty()) {
                            System.out.println("Notas atuais: " + notasAluno);
                            System.out.print("Digite a nota a remover: ");
                            double notaRemover = sc.nextDouble();
                            notasAluno.remove(notaRemover);
                            System.out.println("Nota removida!");
                        } else {
                            System.out.println("Aluno não possui notas.");
                        }
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;

                case 7:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 7);

        sc.close();
    }
}
