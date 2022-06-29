package Ex06.Factory;

public interface SanduichesIngredientesFactory {

    PaoIF definePao();

    PresuntoIF definePresunto();

    QueijoIF defineQueijo();

    SaladaIF defineSalada();

}
