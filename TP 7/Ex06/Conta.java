package Ex06;

public class Conta {

    private double limite = 0;
    private double saldo = 0;

    public Conta(){

    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saca(double valor){
        if(valor > this.saldo){
            ContaException e = new ContaException("\nA conta não tem saldo " +
                    "suficiente para realizar este saque \nAbortando código !!!\n");
            System.out.println(e.getMsg());
            throw e;
        }else {
            this.saldo -= valor;
        }
    }

    @Override
    public String toString(){
        return "--- Dados Bancários ---\nLimite: " + this.limite + "\nSaldo: " + this.saldo;
    }
}
