package Ex01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nDiagrama do Grafo = ");
        System.out.println("" +
                " 0 --------- 1 \n" +
                " |         / |  \\ \n" +
                " |      /    |    2 \n" +
                " |   /       |  / \n" +
                " 4 --------- 3 \n");

        Grafo grafo = new Grafo();
        Scanner scan = new Scanner(System.in);
        String cond = new String();
        String lixo = new String();
        int ver_1, ver_2;

        System.out.println("Matriz de Adjascência = \n");
        grafo.imprime_matriz();
        System.out.println("\nVértices Válidos = { 0 , 1 , 2 , 3 , 4 }\n");
        System.out.println(" ! Verificação de Adjascencia ! \n");
        do {
            System.out.print("Digite um Vértice = ");
            ver_2 = scan.nextInt();
            System.out.print("Digite outro Vértice = ");
            ver_1 = scan.nextInt();
            grafo.verifica_vizinhos(ver_2, ver_1);
            System.out.print("\nDeseja verificar outros vértices adjascente? (S ou N) = ");
            lixo = scan.nextLine();
            cond = scan.nextLine();
        } while (cond.equals("S") || cond.equals("s"));

        grafo.lista_vizinhos(0);
        grafo.lista_vizinhos(1);
        grafo.lista_vizinhos(2);
        grafo.lista_vizinhos(3);
        grafo.lista_vizinhos(4);
        System.out.println();
    }
}
