package Ex02;

public class Main {

    public static void main(String[] args) {

        Gerente g1 = new Gerente("Lucas", 18, "M", 1045, "20.2.8040", "Gerente de Estoque");
        Vendedor v1 = new Vendedor("Luan", 21, "M", 1045, "20.2.8041", 42, 500);
        Cliente c1 = new Cliente("Laura", 25, "F", 5012, 1997);

        System.out.println(g1);
        System.out.println(v1);
        System.out.println(c1);

    }
}
