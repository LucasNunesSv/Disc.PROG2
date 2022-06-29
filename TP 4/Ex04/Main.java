package Ex04;

import Ex02.Nota;

public class Main {

    public static void main(String[] args) {

        Letra l1 = new Letra();

        System.out.println("\nTeste da Classe Letra\n");

        l1.adc_frase("L L L L L L ", 2);
        l1.adc_frase("U U U U U", 4);
        l1.adc_frase("C C C C ", 8);
        l1.bis(1);
        l1.to_refrao(0);
        l1.play();
    }
}
