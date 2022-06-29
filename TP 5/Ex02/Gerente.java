package Ex02;

public class Gerente extends Empregado{

    private String nomeGerencia;
    private double INSS = super.valor_INSS();

    public Gerente(String nome, int idade, String sexo, double salario, String matricula, String nomeGerencia){
        super(nome, idade, sexo, salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    public String toString() {
        return "\n***** Dados Cadastrais *****\n" + "Nome: " + super.getNome() + " / GERENTE\n" +
                "Idade: " + super.getIdade() + "  -  Sexo: " + super.getSexo() +"\n" +
                "Matricula: " + super.getMatricula() + "  -  Salário: R$" + super.getSalario() + "\n" +
                "Nome de Gerência (cargo): " + this.nomeGerencia + "\nValor do INSS: " + this.INSS;
    }
}
