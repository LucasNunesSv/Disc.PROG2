package Ex04;

import java.util.Scanner;

public class CD extends Midia implements Mp3eMp4 {

    private int nMusicas;
    private String info;
    private double numDouble;
    private int numInt;

    private Scanner scan = new Scanner(System.in);

    public CD() {

    }

    public CD(int cod, double price, String nome, int musicas) {
        super(cod, price, nome);
        this.nMusicas = musicas;
    }

    @Override
    public String getTipo() {
        return "Tipo de Mídia: CD";
    }

    @Override
    public String getDetalhes() {
        play_music_or_image();
        return "Código: " + super.getCod() +
                "\nNome: " + super.getNome() + " --- Preço: R$" + super.getPrice() +
                "\nNº de Músicas: " + this.nMusicas + "\n";
    }

    public void setnMusicas(int musicas) {
        this.nMusicas = musicas;
    }

    @Override
    public void inserirDados() {
        System.out.print("Digite os dados do CD abaixo:\nCódigo: ");
        numInt = scan.nextInt();
        super.setCod(numInt);
        System.out.print("Nome: ");
        scan.nextLine();
        info = scan.nextLine();
        super.setNome(info);
        System.out.print("Preço: ");
        numDouble = scan.nextDouble();
        super.setPrice(numDouble);
        System.out.print("Nº de Músicas: ");
        numInt = scan.nextInt();
        this.nMusicas = numInt;
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
        System.out.println("Tocando Música: ♬ ♪ \uD83C\uDFB8 ♩ \uD83C\uDFA4 ♬♭ \uD83D\uDCFB");
    }

}
