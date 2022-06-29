package EX05;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Animal porco = new Animais("Porco", "Mamifero");
        Animal galinha = new Animais("Galinha", "Ave");
        Animal girafa = new Animais("Girafa", "Mamifero");
        Animal cobra = new Animais("Cobra", "Réptil");
        Animal gato = new Animais("Gato", "Mamifero");
        Animal largato = new Animais("largato", "Réptil");
        Animal pintado = new Animais("Pintado", "Peixe");
        Animal robalo = new Animais("Robalo", "Peixe");
        Animal cavalo = new Animais("Cavalo", "Mamifero");
        Animal salamandra = new Animais("Salamandra",  "Anfíbio");

        Animal[] zoo = {porco, galinha, girafa, cobra, gato, largato, pintado, robalo, cavalo, salamandra};

        Tools tool = new Tools();

        App app = new App();

        Resultado[] resultado = new Resultado[50];

        resultado = app.contabilizador(zoo, tool);

        for (int i = 0; i < resultado.length; i++) {
            if (resultado[i] != null) {
                System.out.println("\n----- Espécie " + i + " -----");
                resultado[i].printDados();
            }
        }
    }
}
