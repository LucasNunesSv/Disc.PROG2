package Ex05.Factory;

public class Palio extends CarroPopular {

    protected Palio(String placa) {
        super(placa, "Palio");
    }

    @Override
    public void exibirInfoPopular() {
        System.out.println("\n --- Informações do Carro Popular ---\n" + "Modelo: " + super.getModelo() +
                "\nPlaca: " + super.getPlaca());
    }
}
