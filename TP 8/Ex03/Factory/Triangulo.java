package Ex03.Factory;

public class Triangulo extends FormaGeometrica {

    protected Triangulo() {
        super(3);
    }

    @Override
    public void desenhar() {
        System.out.println("Forma: Triangulo || Quantidade de lados: " + super.getQtdLados());
    }
}
