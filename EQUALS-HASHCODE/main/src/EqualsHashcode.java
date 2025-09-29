import java.util.Date;

public class EqualsHashcode {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Lucas";
        u1.email = "teste@teste.com";

        Usuario u2 = new Usuario();
        u2.nome = "Lucas";
        u2.email = "teste@teste.com";

        Usuario u3 = new Usuario();
        u3.nome = "Pedro";
        u3.email = "teste2@teste.com";


        System.out.println(u1.equals(u2));
        System.out.println(u1.equals(u3));
        System.out.println(u1.hashCode());
        System.out.println(u2.equals(new Date()));
    }
}
