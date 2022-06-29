package Ex06.Factory;

public class QueijoCheddar implements QueijoIF {

    private String tipo;

    public QueijoCheddar() {
        this.tipo = "Queijo Cheddar";
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public QueijoIF criaQueijo() {
        return new QueijoCheddar();
    }

    @Override
    public String toString() {
        return this.tipo;
    }

}
