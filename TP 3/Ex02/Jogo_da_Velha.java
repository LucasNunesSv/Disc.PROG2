package Ex02;

public class Jogo_da_Velha {

    private static int Game[][] = new int[3][3];

    public Jogo_da_Velha() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Game[i][j] = 0;
            }
        }
    }

    public void PlayGame(StatusPlace player, int l, int c) {
        if (Game[l][c] == 0) {
            if (player == StatusPlace.PLAYER1) {
                Game[l][c] = 1;
            }
            if (player == StatusPlace.PLAYER2) {
                Game[l][c] = 2;
            }
        }
    }

    public int valida_jogada(int l, int c) {
        if (Game[l][c] != 0) {
            System.out.println("\n## Jogada Inválida ##");
            return 0;
        } else {
            return 1;
        }
    }

    public void verifica_campeão() {
        if (Game[0][0] == 1 && Game[1][0] == 1 && Game[2][0] == 1
                || Game[0][1] == 1 && Game[1][1] == 1 && Game[2][1] == 1
                || Game[0][2] == 1 && Game[1][2] == 1 && Game[2][2] == 1
                || Game[0][0] == 1 && Game[0][1] == 1 && Game[0][2] == 1
                || Game[1][0] == 1 && Game[1][1] == 1 && Game[1][2] == 1
                || Game[2][0] == 1 && Game[2][1] == 1 && Game[2][2] == 1
                || Game[0][0] == 1 && Game[1][1] == 1 && Game[2][2] == 1
                || Game[0][2] == 1 && Game[1][1] == 1 && Game[2][0] == 1) {
            System.out.println("!!!! O Campeão é o PLAYER 1 !!!!");
            System.exit(0);
        }
        if (Game[0][0] == 2 && Game[1][0] == 2 && Game[2][0] == 2
                || Game[0][1] == 2 && Game[1][1] == 2 && Game[2][1] == 2
                || Game[0][2] == 2 && Game[1][2] == 2 && Game[2][2] == 2
                || Game[0][0] == 2 && Game[0][1] == 2 && Game[0][2] == 2
                || Game[1][0] == 2 && Game[1][1] == 2 && Game[1][2] == 2
                || Game[2][0] == 2 && Game[2][1] == 2 && Game[2][2] == 2
                || Game[0][0] == 2 && Game[1][1] == 2 && Game[2][2] == 2
                || Game[0][2] == 2 && Game[1][1] == 2 && Game[2][0] == 2) {
            System.out.println("!!!! O Campeão é o PLAYER 2 !!!!");
            System.exit(0);
        }
        if (Game[0][0] != 0 && Game[0][1] != 0 && Game[0][2] != 0
                && Game[1][0] != 0 && Game[1][1] != 0 && Game[1][2] != 0
                && Game[2][0] != 0 && Game[2][1] != 0 && Game[2][2] != 0) {
            System.out.println("!!!! Empate !!!!");
            System.exit(0);
        }
    }

    public void print_game() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Game[i][j] + " ");
            }
            System.out.println();
        }
    }
}
