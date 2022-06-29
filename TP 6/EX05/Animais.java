package EX05;

public class Animais implements Animal {

    private String nome_especie;
    private String nome_animal;

    public Animais(String animal, String especie) {
        this.nome_animal = animal;
        this.nome_especie = especie;
    }

    public Animais() {

    }

    public void setNome_especie(String nome_especie) {
        this.nome_especie = nome_especie;
    }

    public void setNome_animal(String nome_animal) {
        this.nome_animal = nome_animal;
    }

    @Override
    public String getNomeEspecie() {
        return this.nome_especie;
    }

    @Override
    public String getNomeAnimal() {
        return this.nome_animal;
    }

}
