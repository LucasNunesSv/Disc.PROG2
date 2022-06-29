package Ex02;

public class Incremental_Alterado {

    private static int count = 0;
    private int numero;
    private static Incremental_Alterado instance;

    private Incremental_Alterado() {
        numero = ++count;
    }

    public static Incremental_Alterado getInstance() {
        if (instance == null) {
            instance = new Incremental_Alterado();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Incremental " + numero;
    }
}
