package Ex06.Factory;

public class PaoIntegral implements PaoIF {

    private String tipo;

    public PaoIntegral() {
        this.tipo = "Pão Integral";
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public PaoIF criaPao() {
        return new PaoIntegral();
    }

    @Override
    public String toString() {
        return this.tipo;
    }
}
