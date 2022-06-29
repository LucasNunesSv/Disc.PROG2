package EX03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Empregado  {

    private int id;
    private String nome;
    private double salario;
    private String date;

    public Empregado(int id, String nome, double salario, String date){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return "\n_____________________________\nId: " + this.id + " --> " + this.nome +
                "\nSalário: R$" + this.salario + "\nData de admissão: " + this.date +
                "\n_____________________________\n";
    }

//    @Override
//    public int compareTo(Empregado e){
//        if(this.salario < e.getSalario()){
//            return -1;
//        }
//        if(this.salario > e.getSalario()){
//            return 1;
//        }
//        return  0;
//    }


}
