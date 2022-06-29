package Ex05.Factory;

public abstract class CarroPopular {

    private String placa;
    private String modelo;

    protected CarroPopular(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public abstract void exibirInfoPopular();

}
