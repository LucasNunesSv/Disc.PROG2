package Ex06.Factory;

public class PaoFrances implements PaoIF {

    private String tipo;

    public PaoFrances() {
        this.tipo = "Pão Frances";
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public PaoFrances criaPao() {
        return new PaoFrances();
    }

    @Override
    public String toString() {
        return this.tipo;
    }
}
