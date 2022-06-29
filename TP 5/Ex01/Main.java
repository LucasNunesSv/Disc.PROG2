package Ex01;

public class Main {

    public static void main(String[] args) {

        Cachorro dog = new Cachorro("Simba", 3.2, "Vira-Lata");
        Peixe pexin = new Peixe("Sr. bigode", 0.05, "Ornamental");

        Cachorro dog1 = new Cachorro("Rocky estrela guia", 4.1, "salsicha");
        Peixe pexin1 = new Peixe("Norberto", 0.03,"Água doce");

        System.out.println(pexin);
        System.out.println(pexin1);

        System.out.println(dog);
        System.out.println(dog1);

    }
}
