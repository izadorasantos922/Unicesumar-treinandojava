public class ContaBancaria{
    String titular;
    double saldo;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Deposito de " + valor + "R$");

    }

    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de " + valor + "R$");
        }
        else{
            System.out.println("Saldo insuficiente. ");
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo de " + titular + ": " + saldo + "R$");
    }
}