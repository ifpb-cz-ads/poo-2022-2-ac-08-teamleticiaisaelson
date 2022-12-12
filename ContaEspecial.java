public class ContaEspecial extends Conta{
    
    private double limite;
    public ContaEspecial(){}
        public ContaEspecial(int numero, String nome_titular, String cpfTitular, double limite){
            super(numero, nome_titular, cpfTitular);
            this.limite = limite;
    }
    public double getLimite(){
        return this.limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public boolean sacar (double valor){
        if(this.limite + this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        } 
        return false;
    }
}
