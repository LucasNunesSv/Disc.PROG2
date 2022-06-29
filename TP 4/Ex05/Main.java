package Ex05;

import Ex02.Nota;
import Ex03.Melodia;
import Ex04.Letra;

public class Main {

    public static void main(String[] args) {

        Nota Do = new Nota("C", 2);
        Nota Fa = new Nota("F", 1);

        Melodia melo = new Melodia();
        Letra l1 = new Letra();

        melo.adc_nota(Do, 5);
        melo.adc_nota(Fa, 4);

        l1.adc_frase("L L L L L L L L L", 2);
        l1.adc_frase("U U U U U U U U U ", 5);
        l1.bis(1);

        Musica MUSIC = new Musica(melo, l1);
        Musica music = new Musica(melo, l1);

        System.out.println("\nTeste da função Play\n");
        MUSIC.play();
        System.out.println("\n");
        MUSIC.pot_pourrie(music);
        System.out.println("Teste da função Pot_pourrie: \n");
        MUSIC.play();


    }
}
