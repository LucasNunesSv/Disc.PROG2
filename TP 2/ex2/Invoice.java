package ex2;

public class Invoice {

    private int num_item;
    private String description;
    private int qtd_comprada;
    private float preço;

    private int cont_n, cont_d, cont_q, cont_p;
    private double InvoiceAmount = 0;

    public void setNum_item(int num_item) {
        this.num_item = num_item;
    }

    public int getNum_item() {
        return this.num_item;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setQtd_comprada(int qtd_comprada) {
        if (qtd_comprada >= 0) {
            this.qtd_comprada = qtd_comprada;
        } else {
            System.out.println(" ! Dígito Inválido ! \n * O valor atribuido sera '0' *");
            this.qtd_comprada = 0;
        }
    }

    public int getQtd_comprada() {
        return this.qtd_comprada;
    }

    public void setPreço(float preço) {
        if (preço >= 0) {
            this.preço = preço;
        } else {
            System.out.println(" ! Dígito Inválido ! \n * O valor atribuido sera '0.0' *");
            this.preço = 0;
        }

    }

    public float getPreço() {
        return this.preço;
    }

    public double getInvoiceAmount(Invoice fatura) {
        this.InvoiceAmount = fatura.qtd_comprada * fatura.preço;
        return this.InvoiceAmount;
    }
}
