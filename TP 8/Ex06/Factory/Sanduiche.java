package Ex06.Factory;

public class Sanduiche {

    private String lanchonete;
    private PaoIF pao;
    private QueijoIF queijo;
    private PresuntoIF presunto;
    private SaladaIF salada;

    public Sanduiche(String lanchonete, PaoIF pao, QueijoIF queijo, PresuntoIF presunto, SaladaIF salada) {
        this.lanchonete = lanchonete;
        this.pao = pao;
        this.queijo = queijo;
        this.presunto = presunto;
        this.salada = salada;
    }

    @Override
    public String toString() {
        return "\n----------- Lanchonete do " + this.lanchonete + " -----------" +
                "\nOpção de Pão: " + this.pao.toString() + "\nOpção de Queijo: " + this.queijo.toString() + "\n" +
                "Opção de Presunto: " + this.presunto.toString() + "\nOpção de Salada: " + this.salada.toString();
    }
}
