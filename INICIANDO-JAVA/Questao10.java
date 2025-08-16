public class Questao10 {
    public static void main(String[] args) {

        //10 - Construir um algoritmo para imprimir:
        //–o cálculo da área de um círculo com raio de 5 cm. (*π* = 3.14159)
        //–área do círculo = *π ** *r*2

        double raio = 5.0;
        double pi = 3.14159;

        double area = pi * Math.pow(raio, 2);
        System.out.println("A área de um círculo com raio de 5 cm é: " + area + " cm²");

    }
}