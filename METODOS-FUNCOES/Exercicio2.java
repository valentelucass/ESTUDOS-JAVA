public class Exercicio2 {
    // Função que recebe uma 'mensagem' como parâmetro e imprime uma frase junto com essa mensagem
    public static void imprimeNovaMensagem(String mensagem){
        System.out.println("Meu primeiro programa com funções e parametro: " + mensagem);
        // Aqui o programa imprime a frase fixa + o valor recebido no parâmetro 'mensagem'
    }

    public static void main(String[] args) {
        imprimeNovaMensagem("Mensagem 1");
        imprimeNovaMensagem("Mensagem 2");
        imprimeNovaMensagem("Mensagem 3");
    }
}
