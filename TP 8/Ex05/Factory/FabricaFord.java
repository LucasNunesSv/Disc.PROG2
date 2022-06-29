package Ex05.Factory;

public class FabricaFord extends FabricaDeCarros {

    @Override
    public CarroPopular criarCarroPopular(String placa, String modelo) {
        if (modelo.equals("Palio")) {
            return new Palio(placa);
        } else if (modelo.equals("Fiesta")) {
            return new Fiesta(placa);
        } else {
            System.out.println(" !! Modelo nao pertence a fabricante Ford !!!");
            return null;
        }
    }

    @Override
    public CarroSedan criarCarroSedan(String placa, String modelo) {
        System.out.println(" !!! a Fábrica Ford não produz modelos Sedan !!!");
        return null;
    }

}
