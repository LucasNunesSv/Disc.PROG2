package Ex04.Factory;

public class Sanduiche {

    private String lanchonete;
    private String pao;
    private String queijo;
    private String presunto;
    private String salada;

    protected Sanduiche(String lanchonete, String pao, String queijo, String presunto, String salada) {
        this.lanchonete = lanchonete;
        this.pao = pao;
        this.presunto = presunto;
        this.queijo = queijo;
        this.salada = salada;
    }

    @Override
    public String toString() {
        return "--- Sanduíche do " + this.lanchonete + " ---\nPão: " + this.pao +
                "\nQueijo: " + this.queijo + "\nPresunto: " + this.presunto + "\nSalada: " +
                this.salada + "\n-----------------------\n";
    }
}
