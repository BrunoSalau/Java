package HerançasEx;

class Pessoa{
    String nome;
    int idade;
}

class Funcionario extends Pessoa{
    Double salario;
}

public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();

        func1.nome = "Nicoli";
        func1.idade = 23;
        func1.salario = 4325.99;

        System.out.println("Fuincionario: "+func1.nome);
        System.out.println("Idade: "+func1.idade);
        System.out.println("Salario: "+func1.salario);


    }
}
