import java.util.Scanner; // Importa a classe Scanner, que permite a entrada de dados pelo teclado.

public class Questao3 { // Declara a classe principal chamada Main.
    public static void main(String[] args) { // O método principal main é o ponto de entrada do programa.
        Scanner input = new Scanner(System.in); // Cria um objeto Scanner chamado 'input' para capturar a entrada do usuário.

        //Questão 3 - Construir um algoritmo para ler dois números inteiros – e imprimir o seu produto.

        System.out.println("Coloque o primeiro número:"); // Exibe uma mensagem solicitando o primeiro número.
        int numero1 = input.nextInt(); // Lê o número inteiro digitado pelo usuário e armazena na variável 'numero1'.

        System.out.println("Agora coloque o segundo número:"); // Exibe uma mensagem solicitando o segundo número.
        int numero2 = input.nextInt(); // Lê o número inteiro digitado pelo usuário e armazena na variável 'numero2'.

        int produto = (numero1 * numero2); // Multiplica os dois números e armazena o resultado na variável 'produto'.
        System.out.println("O produto é: " + produto); // Exibe o resultado da multiplicação, concatenando a mensagem com o valor de 'produto'.

        input.close(); // Fecha o objeto Scanner para liberar os recursos do sistema.
    }
}
