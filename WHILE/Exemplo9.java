import java.util.Scanner;

public class Exemplo9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalCompra = 0;
        char continuar = 'S'; // Inicializa a variável com um valor válido

        do {
            int codigo, quantidade;
            double preco = 0;

            // Solicita o código do produto
            System.out.print("Digite o código do produto: ");
            codigo = input.nextInt();

            // Define o preço com base no código
            switch (codigo) {
                case 100:
                    preco = 1.20;
                    break;
                case 101:
                    preco = 1.30;
                    break;
                case 102:
                    preco = 1.50;
                    break;
                case 103:
                    preco = 1.20;
                    break;
                case 104:
                    preco = 1.30;
                    break;
                case 105:
                    preco = 1.00;
                    break;
                default:
                    System.out.println("Código inválido. Tente novamente.");
                    continue; // Volta para solicitar um código válido
            }

            // Solicita a quantidade do produto
            System.out.print("Digite a quantidade: ");
            quantidade = input.nextInt();

            // Calcula o total do produto e soma ao total da compra
            double totalProduto = preco * quantidade;
            totalCompra += totalProduto;

            System.out.println("Total do produto: R$" + totalProduto);

            // Limpa o buffer antes de ler a resposta
            input.nextLine();

            // Pergunta se o cliente deseja continuar comprando
            System.out.print("Deseja comprar mais produtos? (S/N): ");
            continuar = input.nextLine().trim().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        // Exibe o total final da compra
        System.out.println("Valor total da compra: R$" + totalCompra);
        input.close();
    }
}
