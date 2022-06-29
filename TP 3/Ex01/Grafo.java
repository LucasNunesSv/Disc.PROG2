package Ex01;

public class Grafo {

    private static int[][] matriz_adj;

    public Grafo() {
        matriz_adj = new int[][]{{0, 1, 0, 0, 1},
                {1, 0, 1, 1, 1},
                {0, 1, 0, 1, 0},
                {0, 1, 1, 0, 1},
                {1, 1, 0, 1, 0}};
    }

    public void imprime_matriz() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz_adj[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void lista_vizinhos(int V) {
        System.out.print("\nLista de pontos Adjascentes do Vértice *" + V + "* = {");
        for (int i=0; i<5; i++){
            if(matriz_adj[i][V] != 0){
                System.out.print(" " + i + " ");
            }
        }
        System.out.print("}");
    }

    public void verifica_vizinhos(int V, int A) {
        if (matriz_adj[A][V] != 0) {
            System.out.println("\n!!! O vertice *" + A + "* possui adjacencia com o vertíce *" + V + "*");
        }
        if (A == V) {
            System.out.println("\n!!! O vértice *" + A + "* não pode ter adjascência com ele mesmo ");

        } else {
            if (matriz_adj[A][V] == 0) {
                System.out.println("\n!!! O vertice *" + A + "* Não possui adjacencia com o vertíce *" + V + "*");
            }
        }
    }
}
