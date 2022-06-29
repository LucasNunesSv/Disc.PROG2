package Ex03.Factory;

public abstract class FormaGeometrica {

    private int qtdLados;

    protected FormaGeometrica(int qtdLados) {
        this.qtdLados = qtdLados;
    }

    public int getQtdLados() {
        return this.qtdLados;
    }

    public abstract void desenhar();
}
