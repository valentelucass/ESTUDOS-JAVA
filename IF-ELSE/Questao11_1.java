import java.util.Scanner;

public class Questao11_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a sua idade: ");
        int idade = input.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("Resultado: Infatil A.");
        } else {
            if (idade >= 8 && idade <= 10) {
                System.out.println("Resultado: Infaltil B.");
            }else {
                if (idade >= 11 && idade <= 13) {
                    System.out.println("Resultado: Juvenil A");
                } else {
                    if (idade >= 14 && idade <= 17) {
                        System.out.println("Resultado: Juvenil B");
                    } else {
                        System.out.println("Resultado: Sênior");
                    }
                }
            }
                
            }
        
        input.close();
    }
}
