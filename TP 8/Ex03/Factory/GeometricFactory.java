package Ex03.Factory;

public class GeometricFactory {

    public static FormaGeometrica Cria_forma(int lados) {
        if (lados == 3) {
            return new Triangulo();
        } else if (lados == 4) {
            return new Quadrado();
        } else if (lados == 5) {
            return new Pentagono();
        } else {
            return new Poligono(lados);
        }
    }
}
