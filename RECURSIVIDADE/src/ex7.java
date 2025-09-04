// 03) Faça uma função recursiva que calcule e retorne o Enésimo termo da sequência
// Fibonacci. Alguns números desta sequência são: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89

public class ex7 {
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        } else if(n==1){
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            System.out.println(fibonacci(i));
        }
    }
}
