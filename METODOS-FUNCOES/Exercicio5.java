import java.util.Scanner;

public class Exercicio5 {
    public static String exibirDiaSemana(int dia){
        switch (dia) {
            case 1: return "Domingo";
            case 2: return "Segunda-feira";
            case 3: return "Terça-feira";
            case 4: return "Quarta-feira";
            case 5: return "Quinta-feira";
            case 6: return "Sexta-feira";
            case 7: return "Sábado";
            default: return "Dia da semana inválido";
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int num = input.nextInt();
        
        String resultado = exibirDiaSemana(num);
        System.out.println("O dia é: " + resultado);

        input.close();
    }
}
