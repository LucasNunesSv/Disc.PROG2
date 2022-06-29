package Ex05.Factory;

public class FiestaSedan extends CarroSedan {

    protected FiestaSedan(String placa) {
        super(placa, "Fiesta Sedan");
    }

    @Override
    public void exibirInfoSedan() {
        System.out.println("\n --- Informações do Sedan ---\n" + "Modelo: " + super.getModelo() +
                "\nPlaca: " + super.getPlaca());
    }
}
