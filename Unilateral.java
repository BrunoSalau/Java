//Cadastro de usuário
//Login (autenticação)
//Conta bancária
//Saldo
//Depósito
//Saque
//Transferência entre contas
//Histórico de transações

class Jogador{
    String nome;
    Time time;
    public Jogador(String nomeC, Time team){
        this.nome = nomeC;
        this.time = team;
    }
}
class Time{
    String nome;
    public Time(String nomeC){
        this.nome = nomeC;
    }
}



public class Main {
    public static void main(String[] args) {
    Time Times = new Time("Brasil");

    Jogador jogador = new Jogador("Bruno",Times);

    System.out.println(jogador.nome+" "+jogador.time.nome);
    }   
}
