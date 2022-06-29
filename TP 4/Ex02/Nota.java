package Ex02;

public class Nota {

//    Representação das Notas (cifra ou tablatura):
//
//    Dó = C
//    Ré = D
//    Mi = E
//    Fá = F
//    Sol = G
//    Lá = A
//    Si = B
//
//    # = sustenido  --  Ex: F# (Fá sustenido)
//    b = bemol  --  Ex: Bb (Si bemol)

    private String nota;
    private int tempo;

    private boolean Tem_sus = false;
    private boolean Tem_bemol = false;

    public Nota(String nota, int tempo) {
        if (nota.equals("C") || nota.equals("D") || nota.equals("E")
                || nota.equals("F") || nota.equals("G") || nota.equals("A")
                || nota.equals("B")) {
            this.nota = nota;
        }else {
            System.out.println("!!!! NOTA INVÁLIDA !!!!");
        }
        this.tempo = tempo;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        if (nota.equals("C") || nota.equals("D") || nota.equals("E")
                || nota.equals("F") || nota.equals("G") || nota.equals("A")
                || nota.equals("B")) {
            this.nota = nota;
        }
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public void to_bemol() {
        if ((nota.equals("D") || nota.equals("E") || nota.equals("G") || nota.equals("A") || nota.equals("B")) && this.Tem_bemol == false) {
            this.nota = this.nota.concat("b");
            this.Tem_bemol = true;
        } else {
            System.out.println("!!! " + nota + "b não existe\n");
        }
    }

    public void to_sustenido() {
        if ((nota.equals("C") || nota.equals("D") || nota.equals("F") || nota.equals("G") || nota.equals("A")) && this.Tem_sus == false) {
            this.nota = this.nota.concat("#");
            this.Tem_sus = true;
        } else {
            System.out.println("!!! " + nota + "# não existe\n");
        }
    }

    public void tira_bemol_ou_sus() {
        if (Tem_sus == true) {
            this.nota = this.nota.replace("#", "");
        } else {
            if (Tem_bemol == true) {
                this.nota = this.nota.replace("b", "");
            } else {
                System.out.println("!!! " + this.nota + " Não possui b nem #\n");
            }
        }
    }

    public void play() {
        System.out.print(this.nota + " |-----" + this.tempo + "s-----| ");
    }
}
