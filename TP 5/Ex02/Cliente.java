package Ex02;

public class Cliente extends Pessoa{

    private double valor_divida;
    private int ano_nas;

    public Cliente(String nome, int idade, String sexo, double divida_ativa, int nasc){
        super(nome, idade, sexo);
        this.valor_divida = divida_ativa;
        this.ano_nas = nasc;
    }

    public double getValor_divida() {
        return valor_divida;
    }

    public void setValor_divida(double valor_divida) {
        this.valor_divida = valor_divida;
    }

    public int getAno_nas() {
        return ano_nas;
    }

    public void setAno_nas(int ano_nas) {
        this.ano_nas = ano_nas;
    }

    public String toString() {
        return "\n***** Dados cadastrais *****\n" + "Nome: " + super.getNome() + " / CLIENTE\n" +
                "Idade: " + super.getIdade() + "  -  Sexo: " + super.getSexo() +"\n" +
                "Valor da Dívida: R$" + this.valor_divida + "  -  Ano de nascimento: " + this.ano_nas;

    }
}
