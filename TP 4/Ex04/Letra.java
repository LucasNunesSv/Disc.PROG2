package Ex04;

public class Letra {

    //Maximo de frases para esta letra = 50.

    private String[] frases = new String[50];
    private int[] tempo = new int[50];
    private int cont = 0;
    private boolean[] bis = new boolean[50];
    private String refrao;
    private boolean[] ref = new boolean[50];

    public int getCont() {
        return cont;
    }

    public void adc_frase(String frase, int tempo){
        if(this.frases[cont] == null){
            this.frases[cont] = frase;
            this.tempo[cont] = tempo;
            cont ++;
        }else {
            System.out.println("!! erro ao adicionar !!");
        }
    }

    public void bis(int posi_frase){
        if(this.bis[posi_frase] == false){
            this.bis[posi_frase] = true;
        }else {
            System.out.println("!! esta frase ja tem bis !!");
        }
    }

    public void to_refrao(int posi_frase){
        if(this.frases[posi_frase] != null){
            this.refrao = this.frases[posi_frase];
            this.ref[posi_frase] = true;
        }else {
            System.out.println("!! A frase " + " ainda não foi preenchida e nao pode se tornar o refrao");
        }
    }

    public void play(){
        for(int i=0; i < this.cont; i++){
            System.out.println(this.frases[i] + " -----| " + this.tempo[i] + "s");
            if (this.bis[i] == true){
                System.out.print("(bis) ");
                System.out.println(this.frases[i] + " -----| " + this.tempo[i] + "s");
            }
            if(this.ref[i] == true){
                System.out.println("\nRefrão: " + this.refrao + " -----| " + this.tempo[i] + "s\n");
            }
        }
    }
}
