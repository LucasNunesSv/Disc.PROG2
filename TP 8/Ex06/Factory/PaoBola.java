package Ex06.Factory;

public class PaoBola implements PaoIF {

    private String tipo;

    public PaoBola() {
        this.tipo = "Pão Bola";
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public PaoIF criaPao() {
        return new PaoBola();
    }

    @Override
    public String toString() {
        return this.tipo;
    }

}
