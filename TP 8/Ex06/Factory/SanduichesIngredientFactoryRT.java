package Ex06.Factory;

public class SanduichesIngredientFactoryRT implements SanduichesIngredientesFactory {

    @Override
    public PaoIF definePao() {
        return new PaoBola();
    }

    @Override
    public PresuntoIF definePresunto() {
        return new PresuntoPeru();
    }

    @Override
    public QueijoIF defineQueijo() {
        return new QueijoCheddar();
    }

    @Override
    public SaladaIF defineSalada() {
        return new SaladaSemVerdura();
    }
}
