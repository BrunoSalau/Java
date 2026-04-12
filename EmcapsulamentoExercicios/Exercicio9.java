public class Pedido {
    private int numero;
    private double valor;

    public Pedido(int numero, double valor) {
        this.numero = numero;
        this.valor = valor;
    }

    public int getNumero() {
        return numero;
    }

    public double getValor() {
        return valor;
    }

    public static void main(String[] args) {
        Pedido p = new Pedido(1, 150);
        System.out.println(p.getValor());
    }
}
