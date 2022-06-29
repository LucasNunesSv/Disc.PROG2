package Ex06.Principal;

import Ex06.Factory.Sanduiche;
import Ex06.Factory.SanduicheFactory2;

public class Main {

    public static void main(String[] args) {

        SanduicheFactory2 fabricaSanduba = new SanduicheFactory2();

        Sanduiche sanduba1 = fabricaSanduba.fazerSanduiche("CG");
        Sanduiche sanduba2 = fabricaSanduba.fazerSanduiche("JP");
        Sanduiche sanduba3 = fabricaSanduba.fazerSanduiche("RT");
        Sanduiche sanduba4 = fabricaSanduba.fazerSanduiche("Quanlquer");

        System.out.println(sanduba4);
        System.out.println(sanduba1);
        System.out.println(sanduba2);
        System.out.println(sanduba3);

    }
}
