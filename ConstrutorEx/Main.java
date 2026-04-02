package ConstrutorEx;

class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nomeC, int idadeC){
        this.nome = nomeC;
        this.idade = idadeC;
    }
    
}



public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Nicoli", 23);

        System.out.println(p1.nome+" "+p1.idade);
    }
}
