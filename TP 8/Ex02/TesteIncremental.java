package Ex02;

public class TesteIncremental {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Incremental inc = new Incremental();
            System.out.println(inc);
        }

        System.out.println("\n!! São criados vários objetos 'Incremental' e cada um é incrementado ");
    }
}
