package Ex06.Factory;

public class PresuntoFrango implements PresuntoIF {

    private String tipo;

    public PresuntoFrango() {
        this.tipo = "Presunto de Frango";
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public PresuntoIF criaPresunto() {
        return new PresuntoFrango();
    }

    @Override
    public String toString() {
        return this.tipo;
    }

}
