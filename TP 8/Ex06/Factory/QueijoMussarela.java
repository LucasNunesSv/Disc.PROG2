package Ex06.Factory;

public class QueijoMussarela implements QueijoIF {

    private String tipo;

    public QueijoMussarela() {
        this.tipo = "Queijo Mussarela";
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public QueijoIF criaQueijo() {
        return new QueijoMussarela();
    }

    @Override
    public String toString() {
        return this.tipo;
    }

}
