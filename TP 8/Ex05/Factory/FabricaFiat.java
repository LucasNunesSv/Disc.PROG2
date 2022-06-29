package Ex05.Factory;

public class FabricaFiat extends FabricaDeCarros {

    @Override
    public CarroSedan criarCarroSedan(String placa, String modelo) {
        if (modelo.equals("Siena")) {
            return new Siena(placa);
        } else if (modelo.equals("Fiesta Sedan")) {
            return new FiestaSedan(placa);
        } else {
            System.out.println(" !! Modelo nao pertence a fabricante Fiat !!!");
            return null;
        }
    }

    @Override
    public CarroPopular criarCarroPopular(String placa, String modelo) {
        System.out.println(" !!! a Fábrica Fiat não produz modelos Populares !!!");
        return null;
    }
}
