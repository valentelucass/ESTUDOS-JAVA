package arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class ex5 {
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<>(Arrays.asList(
                "Casa", "Carro", "Computador", "Livro", "Caneta",
                "Caderno", "Mesa", "Cadeira", "Janela", "Porta",
                "Telefone", "Celular", "Relógio", "Chave", "Óculos",
                "Bicicleta", "Geladeira", "Fogão", "Microondas", "Televisão"
        ));

        System.out.println("Tamanho do array é: " + palavras.size());
    }
}
