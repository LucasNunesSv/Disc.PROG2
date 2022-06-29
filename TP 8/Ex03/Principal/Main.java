package Ex03.Principal;

import Ex03.Factory.FormaGeometrica;
import Ex03.Factory.GeometricFactory;
import Ex03.Factory.Triangulo;

public class Main {

    public static void main(String[] args) {

        FormaGeometrica formas[] = new FormaGeometrica[7];

        for (int i = 0; i < 7; i++) {
            formas[i] = GeometricFactory.Cria_forma(3 + i);
        }
        System.out.println();
        for (int i = 0; i < 7; i++) {
            formas[i].desenhar();
        }
    }
}
