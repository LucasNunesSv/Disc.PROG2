package Ex04.Principal;

import Ex04.Factory.*;

public class Main {

    public static void main(String[] args) {

        SanduicheFactory CG = new CG_Factory();
        SanduicheFactory JP = new JP_Factory();
        SanduicheFactory RT = new RT_Factory();

        Sanduiche sandubaCG = CG.criaSanduba();
        Sanduiche sandubaJP = JP.criaSanduba();
        Sanduiche sandubaRT = RT.criaSanduba();

        System.out.println();
        System.out.println(sandubaCG);
        System.out.println(sandubaJP);
        System.out.println(sandubaRT);

    }
}
