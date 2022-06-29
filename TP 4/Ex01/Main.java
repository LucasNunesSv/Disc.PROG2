package Ex01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("");
        Ponto[] pontos_T = new Ponto[50];

        int cont = 0, p_x, p_y, contador = 0, tam = 0;
        double area;
        String Cond;
        boolean pertence = false;

        do{
            System.out.print("Digite o ponto X = ");
            p_x = scan.nextInt();
            System.out.print("Digite o ponto Y = ");
            p_y = scan.nextInt();
            Ponto point = new Ponto(p_x, p_y);
            for (int i=0; pontos_T[i] != null; i++){
                if(pontos_T[i].getX() == p_x && pontos_T[i].getY() == p_y){
                    pertence = true;
                }
            }
            if (pertence == true){
                System.out.println("!! Este ponto já pertence ao polígono !!");
            }else {
                pontos_T[contador] = point;
                tam++;
            }
            contador++;
            pertence = false;
            System.out.println("Deseja inserir mais pontos? (s ou n)");
            Cond = scan.next();
        }while (Cond.equals("S") || Cond.equals("s"));

        Poligono poligono = new Poligono(pontos_T);

        area = poligono.return_area();

        System.out.println("Area do Polígono: " + area);
        System.out.println("Número de pontos do Polígono: " + tam + " pontos");
        System.out.println("Todos os pontos do polígono: \n");
        poligono.imprime();
    }
}
