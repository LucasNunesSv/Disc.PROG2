package Ex03;

import Ex02.Nota;

public class Melodia {

    //Para este exercício será definida uma quantidade máxima de 50 notas por melodia.

    private Nota[] notas = new Nota[50];
    private int[] tempo = new int[50];
    private int cont = 0;

    public int getCont() {
        return cont;
    }

    public Nota[] getNotas() {
        return notas;
    }

    public void setNotas(Nota[] notas) {
        this.notas = notas;
    }

    public void adc_nota(Nota nota, int tempo) {
        if (this.notas[this.cont] == null) {
            this.notas[this.cont] = nota;
            this.tempo[this.cont] = tempo;
            cont++;
        } else {
            System.out.println(" !! Não foi possível adicionar !!");
        }
    }

    public void adc_melo_inteira(Melodia melo) {
        if (this.notas[this.cont] == null) {
            for (int i = 0; i < melo.getCont(); i++) {
                this.notas[this.cont] = melo.notas[i];
                this.tempo[this.cont] = melo.tempo[i];
                cont++;
            }
        } else {
            System.out.println(" !! Não foi possível adicionar !!");
        }
    }

    public void adc_trecho_melo(Melodia melo, int posi_nota_inicial, int posi_nota_final) {
        if (this.notas[this.cont] == null) {
            for (int i = posi_nota_inicial; i <= posi_nota_final; i++) {
                this.notas[this.cont] = melo.notas[i];
                this.tempo[this.cont] = melo.tempo[i];
                cont++;
            }
        } else {
            System.out.println(" !! Não foi possível adicionar !!");
        }
    }

    public void troca_nota(Nota nota, int posição){
        this.notas[posição] = nota;
    }

    public void play_melodia() {
        for (int i = 0; i < cont; i++) {
            System.out.print(this.notas[i].getNota() + " |-----" + this.tempo[i] + "s-----| ");
        }
    }
}
