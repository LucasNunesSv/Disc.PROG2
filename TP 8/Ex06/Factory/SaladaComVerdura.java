package Ex06.Factory;

public class SaladaComVerdura implements SaladaIF {

    private String tipo;

    public SaladaComVerdura() {
        this.tipo = "Com Verdura";
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public SaladaIF criaSalada() {
        return new SaladaComVerdura();
    }

    @Override
    public String toString() {
        return this.tipo;
    }

}
