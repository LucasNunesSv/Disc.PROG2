package Ex03.Factory;

public class Poligono extends FormaGeometrica {

    protected Poligono(int lados) {
        super(lados);
    }

    @Override
    public void desenhar() {
        System.out.println("Forma: Polígono || Quantidade de lados: " + super.getQtdLados());
    }
}
