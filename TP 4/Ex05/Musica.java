package Ex05;

import Ex03.Melodia;
import Ex04.Letra;

public class Musica {

    private Melodia[] melo = new Melodia[50];
    private Letra[] let = new Letra[50];
    private int cont_melo = 0;
    private int cont_let = 0;

    public Musica(Melodia melodia, Letra letra){
        this.melo[this.cont_melo] = melodia;
        this.let[this.cont_let] = letra;
        this.cont_melo++;
        this.cont_let++;
    }

    public int getCont_melo() {
        return cont_melo;
    }

    public int getCont_let() {
        return cont_let;
    }

    public void pot_pourrie(Musica musica){
        for (int i=0; i< musica.getCont_melo(); i++){
            this.melo[this.cont_melo] = musica.melo[i];
            this.cont_melo++;
        }
        for (int i=0; i< musica.getCont_let(); i++){
            this.let[this.cont_let] = musica.let[i];
            this.cont_let++;
        }
    }

    public void play(){
        System.out.println("Melodia: \n");
        for (int i = 0; i<this.cont_melo; i++){
            this.melo[i].play_melodia();
        }
        System.out.println("\n\nLetra:\n");
        for (int i=0; i<this.cont_let; i++){
            this.let[i].play();
        }
    }
}
