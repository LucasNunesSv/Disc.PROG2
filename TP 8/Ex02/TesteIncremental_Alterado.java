package Ex02;

public class TesteIncremental_Alterado {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Incremental_Alterado inc = Incremental_Alterado.getInstance();
            System.out.println(inc);
        }

        System.out.println("\nApenas um objeto 'Incremental' é criado, portanto o Sysout sempre imprimira \nos dados do primeiro objeto que foi criado");
    }
}
