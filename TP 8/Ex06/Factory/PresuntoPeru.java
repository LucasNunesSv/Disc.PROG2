package Ex06.Factory;

public class PresuntoPeru implements PresuntoIF {

    private String tipo;

    public PresuntoPeru() {
        this.tipo = "Presunto de Peru";
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public PresuntoIF criaPresunto() {
        return new PresuntoPeru();
    }

    @Override
    public String toString() {
        return this.tipo;
    }

}
