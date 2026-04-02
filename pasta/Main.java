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

class ProdutoFisico extends Produto{
    double peso;

    public ProdutoFisico(String oNome, double oPreco, double oPeso){
        super(oNome, oPreco);

        this.peso = oPeso;
    };



}

class ProdutoDigital extends Produto{
    double tamanhoArquivo;

    public ProdutoDigital(String oNome, double oPreco, double oTamanhoArquivo){
        super(oNome, oPreco);

        this.tamanhoArquivo = oTamanhoArquivo;
    };
}

class Carrinho{
    String nome;

    ArrayList<Produto> carrinho = new ArrayList<>();
    
    

    void mostrarPedido(){
        System.out.println("===Carrinho===");
        for(Produto p : carrinho){

            if(p instanceof ProdutoDigital){
                ProdutoDigital pd = (ProdutoDigital) p;
                System.out.println("Produto Digital:"+pd.nome+" por "+pd.preco +" Com tamanho de "+pd.tamanhoArquivo+"mb");
                System.out.println();
            }
            else{
                ProdutoFisico pf = (ProdutoFisico) p;
                System.out.println("Produto Fisico:"+pf.nome+" por "+pf.preco+" Que pesa "+pf.peso);
                System.out.println();
            }

        }
    }

    void addCarrinho(Produto produto){
        carrinho.add(produto);
    }



    void calcularTotal(){
        double total = 0;
        System.out.println("===Preço Total===");
        for(Produto p : carrinho){
            total += p.preco;
        }

        System.out.println("Preço total:"+ total);
        System.out.println();
    }

}


public class Main {

    public static void main(String[] args) {
        
        ProdutoFisico produto1F = new ProdutoFisico("Lapis",23.34,45);
        ProdutoFisico produto2F = new ProdutoFisico("Bolsa",34.99,33);
        ProdutoFisico produto3F = new ProdutoFisico("Caderno",11.76,22);

        ProdutoDigital produto1D = new ProdutoDigital("Curso",53.02,2142);
        ProdutoDigital produto2D = new ProdutoDigital("Jogo",34.99,123);
        ProdutoDigital produto3D = new ProdutoDigital("Netflix",11.76,2);

        Carrinho car = new Carrinho();

        car.addCarrinho(produto1F);
        car.addCarrinho(produto2F);
        car.addCarrinho(produto3F);

        car.addCarrinho(produto1D);
        car.addCarrinho(produto2D);
        car.addCarrinho(produto3D);



        car.mostrarPedido();
    
        car.calcularTotal();



    }


}