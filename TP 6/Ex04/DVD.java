package Ex04;

import java.util.Scanner;

public class DVD extends Midia implements Mp3eMp4 {

    private int nFaixas;
    private String info;
    private int numInt;
    private double numDouble;
    Scanner scan = new Scanner(System.in);

    public DVD() {

    }

    public DVD(int cod, double price, String nome, int faixas) {
        super(cod, price, nome);
        this.nFaixas = faixas;
    }

    @Override
    public String getTipo() {
        return "\nTipo de Mídia: / DVD /";
    }

    @Override
    public String getDetalhes() {
        play_music_or_image();
        return "Código: " + super.getCod() +
                "\nNome: " + super.getNome() + " --- Preço: R$" + super.getPrice() +
                "\nNº de Faixas: " + this.nFaixas + "\n";
    }

    public void setnFaixas(int faixas) {
        this.nFaixas = faixas;
    }

    @Override
    public void inserirDados() {
        System.out.print("Digite os dados do DVD abaixo:\nCódigo: ");
        numInt = scan.nextInt();
        super.setCod(numInt);
        System.out.print("Nome: ");
        scan.nextLine();
        info = scan.nextLine();
        super.setNome(info);
        System.out.print("Preço: ");
        numDouble = scan.nextDouble();
        super.setPrice(numDouble);
        System.out.print("Nº de Faixas: ");
        numInt = scan.nextInt();
        this.nFaixas = numInt;
    }

    @Override
    public void printDados() {
        info = getTipo();
        System.out.println(info);
        info = getDetalhes();
        System.out.println(info);
    }

    @Override
    public void play_music_or_image() {
        System.out.println("Imagem da capa do DVD: 🖼 Arquivo.jpg 🖼");
    }
}
