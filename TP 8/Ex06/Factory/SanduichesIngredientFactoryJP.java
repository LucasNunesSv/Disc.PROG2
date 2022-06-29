package Ex06.Factory;

public class SanduichesIngredientFactoryJP implements SanduichesIngredientesFactory {

    @Override
    public PaoIF definePao() {
        return new PaoFrances();
    }

    @Override
    public PresuntoIF definePresunto() {
        return new PresuntoFrango();
    }

    @Override
    public QueijoIF defineQueijo() {
        return new QueijoMussarela();
    }

    @Override
    public SaladaIF defineSalada() {
        return new SaladaComVerdura();
    }
}
