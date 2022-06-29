package Ex04;

public abstract class Midia {

    private int cod;
    private double price;
    private String nome;

    public Midia(){

    }
    public Midia(int cod, double price, String nome){
        this.cod = cod;
        this.price = price;
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String getTipo();

    public abstract String getDetalhes();

    public abstract void printDados();

    public abstract void inserirDados();

}
