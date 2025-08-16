import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] valor = new int[3];

        for(int i = 0; i < valor.length; i++){
            System.out.print("Digite o valor " + (i+1) + ": ");
            valor[i] = input.nextInt();
        }

        int resultado = max_min(valor);
        System.err.println("Resultado: " + resultado);

        input.close();
    }

    public static int maiorValor(int[] vetor){
        int maior = vetor[0]; // Começa assumindo que o primeiro é o maior

        for(int i = 1; i < vetor.length; i++){ // Por já assumirmos que 0 é o maior, o i vai começar a partir da segunda casa.
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }

        return maior;
    }

    public static int menorValor(int[] vetor){
        int menor = vetor[0];

        for(int i = 1; i < vetor.length; i++){
            if(vetor[i] < menor){
                menor = vetor[i];
            }
        }
        return menor;
    }

    public static int max_min(int[] vetor){
        int maior = maiorValor(vetor);
        int menor = menorValor(vetor);

        return (maior + menor)/2;
    }
}
