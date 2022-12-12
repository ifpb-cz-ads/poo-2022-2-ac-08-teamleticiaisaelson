public class ContaPoupança extends Conta {
    public ContaPoupanca() {}

    public ContaPoupanca(int numero, String nome_titular, String cpfTitular) {
        super(numero, nome_titular, cpfTitular);
    }
    
    public void rejustar(double percentual) {
        double reajuste = this.getSaldo() * percentual;
        this.depositar(reajuste);
    }
    
    public boolean sacar(double valor){
        if(this.getSaldo() >= valor){
            this.saldo -= valor;
            return true;
        } else{
            return false;
        }
    }
}
