package Ex02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Jogo_da_Velha game = new Jogo_da_Velha();
        Scanner scan = new Scanner(System.in);
        int linha, coluna;
        int cont = 0, jogador = 1, valida = 0;
        System.out.println("Diagrama: ");
        System.out.println("Colunas : 0 1 2 \nLinha:  0 - - - \nLinha:  1 - - -  \nLinha:  2 - - - ");
        System.out.println();
        while (cont == 0) {
            if (jogador == 1) {
                do {
                    System.out.println(" - Vez do jogador 1 - ");
                    System.out.print("Linha: ");
                    linha = scan.nextInt();
                    System.out.print("Coluna: ");
                    coluna = scan.nextInt();
                    valida = game.valida_jogada(linha, coluna);
                    game.PlayGame(StatusPlace.PLAYER1, linha, coluna);
                    System.out.println();
                } while (valida == 0);
            }
            jogador = 2;
            valida = 0;
            game.print_game();

            System.out.println();
            game.verifica_campeão();

            if (jogador == 2) {
                do {
                    System.out.println(" - Vez do jogador 2 - ");
                    System.out.print("Linha: ");
                    linha = scan.nextInt();
                    System.out.print("Coluna: ");
                    coluna = scan.nextInt();
                    valida = game.valida_jogada(linha, coluna);
                    game.PlayGame(StatusPlace.PLAYER2, linha, coluna);
                    System.out.println();
                } while (valida == 0);
            }
            jogador = 1;
            valida = 0;
            game.print_game();
            System.out.println();
            game.verifica_campeão();
        }
    }
}
