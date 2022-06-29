package Ex06.Factory;

public class SanduichesIngredientFactoryCG implements SanduichesIngredientesFactory {

    @Override
    public PaoIF definePao() {
        return new PaoIntegral();
    }

    @Override
    public PresuntoIF definePresunto() {
        return new PresuntoFrango();
    }

    @Override
    public QueijoIF defineQueijo() {
        return new QueijoPrato();
    }

    @Override
    public SaladaIF defineSalada() {
        return new SaladaSemVerdura();
    }

}
