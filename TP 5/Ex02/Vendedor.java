package Ex02;

public class Vendedor extends Empregado{

    private double valor_venda;
    private int quantidade_venda;

    public Vendedor(String nome, int idade, String sexo, double salario, String matricula, double Vl_venda, int qtd_venda){
        super(nome, idade, sexo, salario, matricula);
        this.valor_venda = Vl_venda;
        this.quantidade_venda = qtd_venda;
    }

    public double getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(double valor_venda) {
        this.valor_venda = valor_venda;
    }

    public int getQuantidade_venda() {
        return quantidade_venda;
    }

    public void setQuantidade_venda(int quantidade_venda) {
        this.quantidade_venda = quantidade_venda;
    }

    public String toString() {
        return "\n***** Dados cadastrais *****\n" + "Nome: " + super.getNome() + " / VENDEDOR\n" +
                "Idade: " + super.getIdade() + "  -  Sexo: " + super.getSexo() +"\n" +
                "Matricula: " + super.getMatricula() + "  -  Salário: R$" + super.getSalario() + "\n" +
                "Valor da venda: " + this.valor_venda + "  -  Quantidade de vendas: " + this.quantidade_venda;
    }
}
