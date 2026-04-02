package Heranças;

class Pessoa{
    String nome;
    int idade;
};

class Aluno extends Pessoa{
    String curso;
}

class Professor extends Pessoa{
    String disciplina;
}

public class Main{
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        aluno1.nome = "Nicoli";
        aluno1.idade = 23;
        aluno1.curso = "ADS";

        System.out.println(aluno1.nome);
        System.out.println(aluno1.idade);
        System.out.println(aluno1.curso);

    }
}