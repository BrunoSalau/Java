public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Preço inválido!");
        } else {
            this.preco = preco;
        }
    }

    public static void main(String[] args) {
        Produto p = new Produto("Mouse", -50);
        System.out.println(p.getPreco());
    }
}
