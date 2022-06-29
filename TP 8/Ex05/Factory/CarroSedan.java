package Ex05.Factory;

public abstract class CarroSedan {

    private String placa;
    private String modelo;

    protected CarroSedan(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public abstract void exibirInfoSedan();

}
