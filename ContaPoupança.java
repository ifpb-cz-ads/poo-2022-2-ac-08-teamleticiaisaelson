public class ContaPoupança extends Conta {
    
    public boolean sacar(double valor){
        if(this.getSaldo() >= valor){
            this.saldo -= valor;
            return true;
        } else{
            return false;
        }
    }
}
