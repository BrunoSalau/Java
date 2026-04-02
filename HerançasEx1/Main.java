package HerançasEx1;

class Animal{
    String nome;   
}

class Cachorro extends Animal {
    String raça;
}

public class Main {
    public static void main(String[] args) {
        Cachorro cao = new Cachorro();

        cao.nome = "bidu";
        cao.raça = "Pudol";

        System.out.println(cao.nome);
        System.out.println(cao.raça);
    }
}
