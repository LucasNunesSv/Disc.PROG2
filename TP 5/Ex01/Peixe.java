package Ex01;

public class Peixe extends Animal{

    private String tipo_habitat;

    public Peixe(String nome, double peso, String tipo_habitat){
        super(nome,peso);
        this.tipo_habitat = tipo_habitat;
    }

    public String getTipo_habitat() {
        return tipo_habitat;
    }

    public void setTipo_habitat(String tipo_habitat) {
        this.tipo_habitat = tipo_habitat;
    }

    public String toString() {
        return "\n** Dados do Peixinho **" + "\nNome: " + super.getNome() + "\nPeso (em Kg): " + super.getPeso() +
                "\nTipo de Habitat: " + this.tipo_habitat;
    }
}
