package ex2;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Invoice Fatura[] = new Invoice[4];
        for (int i = 0; i < Fatura.length; i++) {
            Fatura[i] = new Invoice();
        }
        Scanner scan = new Scanner(System.in);
        double fatura_item, fatura_total = 0;
        String getEnter;

        System.out.println("\nCadastre 4 produtos a Fatura");
        for (int i = 0; i < 4; i++) {
            System.out.println("\n ------ Item " + (i + 1) + " ------ ");
            System.out.print("\nNúmero (cod) - ");
            Fatura[i].setNum_item(scan.nextInt());
            System.out.print("Descrição do Item - ");
            getEnter = scan.nextLine();
            Fatura[i].setDescription(scan.nextLine());
            System.out.print("Quantidade adquirida do item - ");
            Fatura[i].setQtd_comprada(scan.nextInt());
            System.out.print("Preço unitário - ");
            Fatura[i].setPreço(scan.nextFloat());
        }

        System.out.println("\n ****** Itens Cadastrados ****** \n");

        for (int i = 0; i < 4; i++) {
            System.out.println("Item * " + (i + 1) + " *  -  cód: " + Fatura[i].getNum_item());
            System.out.println("Descrição - / " + Fatura[i].getDescription() + " / ");
            System.out.println("Quantidade comercializada - " + Fatura[i].getQtd_comprada() + " unidade(s) ");
            System.out.println("Preço Unitário (R$) - " + Fatura[i].getPreço() + " \n ");
        }

        for (int i = 0; i < 4; i++) {
            fatura_total += Fatura[i].getInvoiceAmount(Fatura[i]);
            fatura_item = Fatura[i].getInvoiceAmount(Fatura[i]);
            System.out.println("A fatura referente ao item * " + Fatura[i].getNum_item() + " * equivale a = " + fatura_item);
        }

        System.out.println("\nValor total aferido das fatura de cada item = " + fatura_total);
    }
}
