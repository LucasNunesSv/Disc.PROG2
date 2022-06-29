package Ex06.Factory;

public class SaladaSemVerdura implements SaladaIF {

    private String tipo;

    public SaladaSemVerdura() {
        this.tipo = "Sem Verdura";
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public SaladaIF criaSalada() {
        return new SaladaSemVerdura();
    }

    @Override
    public String toString() {
        return this.tipo;
    }

}
