package Ex06.Factory;

public class SanduicheFactory2 {

    private SanduichesIngredientesFactory cg = new SanduichesIngredientFactoryCG();
    private SanduichesIngredientesFactory jp = new SanduichesIngredientFactoryJP();
    private SanduichesIngredientesFactory rt = new SanduichesIngredientFactoryRT();

    public Sanduiche fazerSanduiche(String lanchonete) {
        if (lanchonete.equals("CG")) {
            return new Sanduiche("CG", cg.definePao(), cg.defineQueijo(), cg.definePresunto(), cg.defineSalada());
        } else if (lanchonete.equals("JP")) {
            return new Sanduiche("JP", jp.definePao(), jp.defineQueijo(), jp.definePresunto(), jp.defineSalada());
        } else if (lanchonete.equals("RT")) {
            return new Sanduiche("RT", rt.definePao(), rt.defineQueijo(), rt.definePresunto(), rt.defineSalada());
        } else {
            System.out.println("\n!!! Lanchonete inválida !!!\nTrabalhamos apenas com as empresas 'CG' 'JP' e 'RT'\n");
            return null;
        }
    }
}
