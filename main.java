package pasta;

import java.util.ArrayList;

class Produto{
    String nome;
    double preco;

    public Produto(String oNome, double oPreco){
        this.nome = oNome;
        this.preco = oPreco;
    }

}

class Carrinho{
    String nome;

    ArrayList<Produto> carrinho = new ArrayList<>();
    

    void mostrarPedido(){
        for(Produto p : carrinho){
        System.out.println(p.nome+" por "+p.preco);
        }
    }
}


public class main {

    public static void main(String[] args) {
        
        Produto produto1 = new Produto("Lapis",23.34);
        Produto produto2 = new Produto("Bolsa",34.99);
        Produto produto3 = new Produto("Caderno",11.76);

        Carrinho car = new Carrinho();

        car.mostrarPedido();
    }


}
