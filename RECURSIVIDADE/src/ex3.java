public class ex3 {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            contagemRegressiva(i);
        }
    }

    public static void contagemRegressiva(int n) {
        if (n == 0) {
            System.out.println("Fim da contagem!");
        } else {
            System.out.println(n);
        }
    }
}
