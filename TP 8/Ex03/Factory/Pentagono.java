package Ex03.Factory;

public class Pentagono extends FormaGeometrica {

    protected Pentagono() {
        super(5);
    }

    @Override
    public void desenhar() {
        System.out.println("Forma: Pentágono || Quantidade de lados: " + super.getQtdLados());
    }
}
