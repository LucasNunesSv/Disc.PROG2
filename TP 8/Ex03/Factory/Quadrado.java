package Ex03.Factory;

public class Quadrado extends FormaGeometrica {

    protected Quadrado() {
        super(4);
    }

    @Override
    public void desenhar() {
        System.out.println("Forma: Quadrado || Quantidade de lados: " + super.getQtdLados());
    }
}
