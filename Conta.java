public abstract class Conta {
    private int numero;
    private String nome_titular;
    protected double saldo;
    public Conta() {}

    public Conta(int numero, String nome_titular, String cpfTitular) {
        this.numero = numero;
        this.titular = new Cliente(nome_titular, cpfTitular);
    }
    
    void depositar(double valor) {
        this.saldo = this.getSaldo() + valor;
    }
    
    public abstract boolean sacar(double valor);

    public double getSaldo() { 
        return this.saldo; 
    }

    public void setSaldo(Double saldo) { 
        this.saldo = saldo; 
    } 

    public Cliente getNome_titular(){
        return this.titular;
    } 

    public int getNumero(){
        return this.numero;
    }
    public void setNumero(Integer numero) { 
        this.numero = numero; 
    } 
    
    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}   
