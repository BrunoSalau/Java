public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        setSaldo(saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("Saldo não pode ser negativo!");
        } else {
            this.saldo = saldo;
        }
    }

    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria("João", -100);
        System.out.println("Saldo: " + c.getSaldo());
    }
}
