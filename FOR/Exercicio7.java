import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pessoas_50mais = 0;
        int totalAlturas = 0;
        int somaAlturas = 0;
        int porcentagemPesoInferior = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("========================");
            System.out.println("Participante número " + i);
            System.out.println("Digite a idade: ");
            int idade = input.nextInt();

            System.out.println("Digite a altura: ");
            int altura = input.nextInt();

            System.out.println("Digite o peso: ");
            int peso = input.nextInt();

            if (idade > 50) {
                pessoas_50mais++;

            } if (idade > 10 && idade < 20) {
                totalAlturas++;
                somaAlturas += altura;

            } if (peso < 40) {
                porcentagemPesoInferior++;
            }

        }
        input.close();

        double mediaAltura = 0;

        if (totalAlturas > 0) {
            mediaAltura = (double) somaAlturas / totalAlturas;
        }

        double porcentagemPesoInferiorFinal = ((double) porcentagemPesoInferior /10) * 100;
        
        System.out.println("========================");
        System.out.println("Quantidade de pessoas com mais de 50 anos: " + pessoas_50mais);
        System.out.println("Porcentagem de pessoas com peso inferior a 40kg: " + porcentagemPesoInferiorFinal + "%");
        System.out.println("A média das alturas: " + mediaAltura);
    }
}
