package Ex02;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nA representação das Notas foi feita em formato de cifra:\n\nDó = C\n" +
                "Ré = D\nMi = E\nFá = F\nSol = G\nLá = A\nSi = B\n" +
                "# = sustenido  --  Ex: F# (Fá sustenido)\nb = bemol  --  " +
                "Ex: Bb (Si bemol)\n");

        Nota Do = new Nota("C", 1);
        Nota Re = new Nota("D", 2);
        Nota Mi = new Nota("E", 3);
        Nota Fa = new Nota("F", 4);
        Nota Sol = new Nota("G", 4);
        Nota La = new Nota("A", 3);
        Nota Si = new Nota("B", 2);

        //Cada nota é instanciada recebendo a cifra da nota e o tempo de execução como parâmetros do método construtor

        System.out.print("Notas = ");
        System.out.print(Do.getNota() + " ");
        System.out.print(Re.getNota() + " ");
        System.out.print(Mi.getNota() + " ");
        System.out.print(Fa.getNota() + " ");
        System.out.print(Sol.getNota() + " ");
        System.out.print(La.getNota() + " ");
        System.out.print(Si.getNota() + " ");

        System.out.println("\n");
        System.out.println(" # Teste da Função to_bemol e to_sus #\n");

        Do.to_sustenido();
        Re.to_sustenido();
        Mi.to_sustenido();
        Fa.to_sustenido();
        Sol.to_bemol();
        La.to_bemol();
        Si.to_bemol();

        //As funções "to_bemol" e "to_sus" alteram a nota, que passa a ser bemol ou sustenida

        System.out.print("Notas = ");
        System.out.print(Do.getNota() + " ");
        System.out.print(Re.getNota() + " ");
        System.out.print(Mi.getNota() + " ");
        System.out.print(Fa.getNota() + " ");
        System.out.print(Sol.getNota() + " ");
        System.out.print(La.getNota() + " ");
        System.out.print(Si.getNota() + " ");


        System.out.println("\n");
        System.out.println(" # Teste da função tira_bemol_ou_sus #\n");

        Do.tira_bemol_ou_sus();
        Mi.tira_bemol_ou_sus();
        Sol.tira_bemol_ou_sus();

        // Esta função é responsável por desfazer a alteração feita pelas funçções "to_bemol" e "to_sus"
        // para retornar a nota à seu valor original de instanciação.

        System.out.print("Notas = ");
        System.out.print(Do.getNota() + " ");
        System.out.print(Re.getNota() + " ");
        System.out.print(Mi.getNota() + " ");
        System.out.print(Fa.getNota() + " ");
        System.out.print(Sol.getNota() + " ");
        System.out.print(La.getNota() + " ");
        System.out.print(Si.getNota() + " ");

        System.out.println("\n");

        System.out.println(" # Teste da função play (toca a música) # ");

        Do.play();Re.play();Mi.play();Fa.play();Sol.play();La.play();Si.play();

        System.out.println();

        // A função "play" imprime a nota original ou com o modificador sustenido/bemol, seguido do tempo de duração da nota.
    }
}
