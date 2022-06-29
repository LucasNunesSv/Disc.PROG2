package Ex06.Factory;

public class QueijoPrato implements QueijoIF {

    private String tipo;

    public QueijoPrato() {
        this.tipo = "Queijo Prato";
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public QueijoIF criaQueijo() {
        return new QueijoPrato();
    }

    @Override
    public String toString() {
        return this.tipo;
    }
}
