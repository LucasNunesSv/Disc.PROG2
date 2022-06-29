package EX05;

public class Resultado {

    private String nomeEspecie;
    private int quantidade = 0;

    public Resultado() {

    }

    public Resultado(String nomeEspecie, int quantidade) {
        this.nomeEspecie = nomeEspecie;
        this.quantidade = quantidade;
    }

    public String getNomeEspecie() {
        return nomeEspecie;
    }

    public void setNomeEspecie(String nomeEspecie) {
        this.nomeEspecie = nomeEspecie;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void printDados() {
        System.out.println("Nome da Espécie: " + getNomeEspecie());
        System.out.println("Quantidade de indivíduos da Espécie: " + getQuantidade());
    }
}
