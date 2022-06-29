package Ex05.Factory;

public abstract class FabricaDeCarros {

    public abstract CarroPopular criarCarroPopular(String placa, String modelo);

    public abstract CarroSedan criarCarroSedan(String placa, String modelo);

}
