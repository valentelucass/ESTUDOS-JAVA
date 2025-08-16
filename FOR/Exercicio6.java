import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int votosCiro = 0, votosItamar = 0, votosLula = 0, votosBrizola = 0, votosNulo = 0, votosBranco = 0;
        
        for (int i = 1; i <=10; i++) {
        System.out.println("=====================================================");
        System.out.println("Olá, eleitor número " + i + ", escolha o seu candidato");
        System.out.println("=====================================================");
        System.out.println("1 - Candidato Ciro Gomes");
        System.out.println("2 - Candidato Itamar Franco");
        System.out.println("3 - Candidato Lula da Silva");
        System.out.println("4 - Candidato Leonel Brizola");
        System.out.println("5 - Nulo");
        System.out.println("6 - Branco");
        System.out.println("=====================================================");
        System.out.println("Digite abaixo: ");
        int voto = input.nextInt();

        switch (voto) {
            case 1:
                votosCiro++;
                break;

            case 2:
                votosItamar++;
                break;

            case 3:
                votosLula++;
                break;

            case 4:
                votosBrizola++;
                break;

            case 5:
                votosNulo++;
                break;

            case 6:
                votosBranco++;
                break;
        
            default:
                System.out.println("Opção invalida. Tente novamente.");
                i--; // Voltar a mesma iteração para que o eleitor vote novamente. Função interessante que coloquei para sempre revisar e ver nos meus exemplos
            }
        }
        
        System.out.println("Total de votos Ciro Gomes: " + votosCiro);
        System.out.println("Total de votos Itamar Franco: " + votosItamar);
        System.out.println("Total de votos Lula da Silva: " + votosLula);
        System.out.println("Total de votos Leonel Brizola: " + votosBrizola);
        System.out.println("Total de votos Nulos: " + votosNulo);
        System.out.println("Total de votos em Branco: " + votosBranco);
        System.out.println("Percentual entre Nulos e Brancos: " + ((double) votosNulo/votosBranco)*100 + "%");
        System.out.println("=====================================================");

        input.close();
    }
}
