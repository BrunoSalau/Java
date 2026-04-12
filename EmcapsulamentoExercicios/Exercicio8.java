public class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        setNota(nota);
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida!");
        } else {
            this.nota = nota;
        }
    }

    public static void main(String[] args) {
        Aluno a = new Aluno("Bruno", 11);
        System.out.println(a.getNota());
    }
}
