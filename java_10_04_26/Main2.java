import java.util.*;

class ContaBancaria{
    private String titular;
    private double saldo = 0.00;

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor){
        if(this.saldo < valor){
            System.out.println("Valor de saque excedido!");
            return;
        }
        else{
            this.saldo -= valor;
        }
    }
    public void exibirInfo(){
        System.out.printf("Titular: %s | SaldoTotal: %.2f\n ",this.titular, this.saldo);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria c1 = new ContaBancaria();
        c1.setTitular("Luana");
        c1.setSaldo(2000.00);

        c1.depositar(500.00);
        c1.sacar(3500.00);
        c1.exibirInfo();
    scanner.close();
    }
}