public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            System.out.println("Preço deve ser maior que 0!");
        } else {
            this.preco = preco;
        }
    }

    public static void main(String[] args) {
        Produto p = new Produto("Mouse", 0);
        System.out.println("Preço: " + p.getPreco());
    }
}
