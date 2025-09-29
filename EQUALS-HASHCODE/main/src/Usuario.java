public class Usuario {
    String nome;
    String email;

    public boolean equals(Object objeto) {

        if(objeto instanceof Usuario) {
            Usuario outroUsuario = (Usuario) objeto;

            boolean nomeIgual = outroUsuario.nome.equals(this.nome);
            boolean emailIgual = outroUsuario.email.equals(this.email);
            return nomeIgual && emailIgual;
        } else {
            return false;
        }

    }

    public int hashCode() {
        return this.nome.length();
    }

}
