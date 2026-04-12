public class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        setIdade(idade);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade não pode ser negativa!");
        } else {
            this.idade = idade;
        }
    }

    public static void main(String[] args) {
        Aluno a = new Aluno("Bruno", -5);
        System.out.println("Idade: " + a.getIdade());
    }
}
