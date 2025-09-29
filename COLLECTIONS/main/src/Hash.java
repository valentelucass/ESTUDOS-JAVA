import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Lucas"));
        usuarios.add(new Usuario("Pamela"));
        usuarios.add(new Usuario("Maria"));
        usuarios.add(new Usuario("Moana"));
        usuarios.add(new Usuario("Joana"));

        boolean resultado = usuarios.contains(new Usuario("Lucas"));
        System.out.println(resultado);
    }
}
