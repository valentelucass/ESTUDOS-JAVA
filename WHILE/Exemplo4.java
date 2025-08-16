public class Exemplo4 {
    public static void main(String[] args) {

        int numero = 10;
        double metade; // Declaramos a variável, mas ainda não atribuímos um valor
        while (numero <= 20) {
            metade = (numero/2.0); // Se esta linha estiver abaixo do print, a variável "metade" será usada antes de receber um valor.
            System.out.println("a metade de " + numero + " é: " + metade);
            numero++;
        }
    }
}
