package Ex02;

public enum StatusPlace {

    EMPTY(0), PLAYER1(1), PLAYER2(2);

    private final int valor;

    StatusPlace(int valorOpcao) {
        valor = valorOpcao;
    }

    public int getValor() {
        return valor;
    }
}
