package Ex04;

public class Frase {

    private String frase;
    private int tempo;

    public Frase(String frase, int tempo){
        this.frase = frase;
        this.tempo = tempo;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public void play() {
        System.out.print(this.frase + " /" + this.tempo + "s/ ");
    }

}
