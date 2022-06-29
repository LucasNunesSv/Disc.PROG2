package Ex05.Factory;

public class Fiesta extends CarroPopular {

    protected Fiesta(String placa) {
        super(placa, "Fiesta");
    }

    @Override
    public void exibirInfoPopular() {
        System.out.println("\n --- Informações do Carro Popular ---\n" + "Modelo: " + super.getModelo() +
                "\nPlaca: " + super.getPlaca());
    }
}
