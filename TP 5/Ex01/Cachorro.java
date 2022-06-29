package Ex01;

public class Cachorro extends Animal{

    private String raça;

    public Cachorro(String nome, double peso, String raça) {
        super(nome, peso);
        this.raça = raça;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String toString() {
        return "\n** Dados do Doguinho **" + "\nNome: " + super.getNome() + "\nPeso (em Kg): " + super.getPeso() +
                "\nRaça: " + this.raça;

    }
}
