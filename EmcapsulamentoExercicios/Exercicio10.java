public class Usuario {
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        setSenha(senha);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha.length() < 6) {
            System.out.println("Senha inválida!");
        } else {
            this.senha = senha;
        }
    }

    public static void main(String[] args) {
        Usuario u = new Usuario("Bruno", "email@gmail.com", "123");
        System.out.println(u.getSenha());
    }
}
