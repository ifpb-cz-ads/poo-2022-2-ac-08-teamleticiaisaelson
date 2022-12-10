public class ContaEspecial extends Conta{
    
    private double limite;
     
    public boolean sacar(double valor){
        if(valor <= this.limite + this.valor){
            this.saldo -= valor;
            return true;
        } else{
            return false;
        }
    } 
}
