public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario + (salario * 0.10);
    }

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Carlos", 1000);
        System.out.println(f.getSalario());
    }
}
