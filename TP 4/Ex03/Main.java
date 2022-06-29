package Ex03;

import Ex02.Nota;

public class Main {

    public static void main(String[] args) {

        Nota Do = new Nota("C", 0);
        Nota Re = new Nota("D", 0);
        Nota Mi = new Nota("E", 0);
        Nota Fa = new Nota("F", 0);
        Nota Sol = new Nota("G", 0);
        Nota La = new Nota("A", 0);
        Nota Si = new Nota("B", 0);

        Melodia M1 = new Melodia();
        Melodia M2 = new Melodia();
        Melodia M3 = new Melodia();

        M1.adc_nota(Do, 5);
        M1.adc_nota(Re, 4);
        M1.adc_nota(Si, 2);
        M2.adc_nota(Fa, 5);
        M2.adc_nota(La, 4);
        M2.adc_nota(Mi, 2);
        M3.adc_nota(Sol, 5);
        M3.adc_nota(Si, 4);
        M3.adc_nota(La, 2);

        System.out.println("\nTeste da função Play: \n");
        M1.play_melodia();
        System.out.println();
        M2.play_melodia();
        M1.adc_melo_inteira(M2);
        System.out.println();
        System.out.println("\nTeste da funçao adc_melo_inteira: \n");
        M1.play_melodia();
        M2.adc_trecho_melo(M3, 1, 1);
        System.out.println();
        System.out.println("\nTeste da função adc_trecho_melo: \n");
        M2.play_melodia();
        
    }
}
