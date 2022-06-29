package Ex05.Factory;

public class Cliente {

    private String nome;
    private CarroSedan carroSedan;
    private CarroPopular carroPopular;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void setCarroSedan(CarroSedan carroSedan) {
        this.carroSedan = carroSedan;
    }

    public void setCarroPopular(CarroPopular carroPopular) {
        this.carroPopular = carroPopular;
    }

    public void InfoCliente() {
        System.out.println("\n------------- Cliente " + this.nome.toUpperCase() + " -------------");
        this.carroPopular.exibirInfoPopular();
        this.carroSedan.exibirInfoSedan();
    }
}
