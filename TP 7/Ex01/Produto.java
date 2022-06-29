package Ex01;

import java.util.Scanner;

public class Produto {

    private int cod;
    private String nome;
    private double preco;
    Scanner scan = new Scanner(System.in);

    public Produto(int contador){
        System.out.print("\nDigite o código do produto " + contador + ": ");
        this.cod = scan.nextInt();
        System.out.print("Digite o nome do produto " + contador + ": ");
        scan.nextLine();
        this.nome = scan.nextLine();
        System.out.print("Digite o preço do produto " + contador + ": ");
        this.preco = scan.nextDouble();
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object produto){
        Produto p = (Produto) produto;
        if(this.getCod() == p.getCod()){
            return true;
        }else
            return false;
    }

    @Override
    public int hashCode(){
        return this.getCod();
    }

    @Override
    public String toString(){
        return "\n\n_________________________" +
                "\nCodigo de barras: " + this.cod + "\nNome do Produto: " +
                this.nome + "\nPreço: R$" + this.preco + "\n_________________________";
    }
}
