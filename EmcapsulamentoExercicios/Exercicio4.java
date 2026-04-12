public class ContaBancaria2 {
    private String titular;
    private double saldo;

    public ContaBancaria2(String titular, double saldo) {
        this.titular = titular;

        if (saldo < 0) {
            System.out.println("Saldo inválido!");
        } else {
            this.saldo = saldo;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        ContaBancaria2 c = new ContaBancaria2("Maria", 500);
        System.out.println("Saldo: " + c.getSaldo());
    }
}
