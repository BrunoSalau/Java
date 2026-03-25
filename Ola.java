import java.util.ArrayList;

class Produto {
    String nome;
    double preço;

    public Produto(String a, double b) {
        this.nome = a;
        this.preço = b;
    }

}

class Pedido {
    String nome;
    double preço;

    ArrayList<Produto> produtos = new ArrayList<>();

    void mostrarPedido() {

        for (Produto p : produtos) {
            System.out.println(p.nome + " por " + p.preço);
        }
    }
}

public class Ola {
    public static void main(String[] args) {

        Produto produto1 = new Produto("machonha", 90.99);
        Produto produto2 = new Produto("baba", 2983);
        Produto produto3 = new Produto("hjfbuiae", 274);

        Pedido ped = new Pedido();

        ped.produtos.add(produto1);
        ped.produtos.add(produto2);
        ped.produtos.add(produto3);

        ped.mostrarPedido();

    }
}
