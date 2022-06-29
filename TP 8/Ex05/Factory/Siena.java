package Ex05.Factory;

public class Siena extends CarroSedan {

    protected Siena(String placa) {
        super(placa, "Siena");
    }

    @Override
    public void exibirInfoSedan() {
        System.out.println("\n --- Informações do Sedan ---\n" + "Modelo: " + super.getModelo() +
                "\nPlaca: " + super.getPlaca());
    }
}
