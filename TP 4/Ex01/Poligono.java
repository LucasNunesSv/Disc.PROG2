package Ex01;

public class Poligono {

    private Ponto[] pontos = new Ponto[50];
    private int tam;
    private double area = 0;

    public Poligono(Ponto[] pontos){
        for(int i=0; i< pontos.length; i++){
            if(pontos[i] != null){
                this.pontos = pontos;
            }
        }
    }

    public Ponto[] getPontos() {
        return pontos;
    }

    public void setPontos(Ponto[] pontos) {
        this.pontos = pontos;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public String[] to_string(){
        String [] str = new String[this.getPontos().length];
        for(int i = 0; i<this.getPontos().length; i++){
            str[i] = ("(x,y) = (" + this.getPontos()[i] + "," + this.getPontos()[i] + ")");
        }
        return str;
    }

    public double return_area(){
        this.area = 0;
        for(int i=0; i<this.pontos.length; i++){
            if(this.pontos[i] != null){
                int tam = 0;
                tam++;
            }
        }
        for(int i=0; i<tam; i++){
            if(i < tam-1){
                area += (1/2)*((pontos[i].getX() * pontos[i+1].getY()) - (pontos[i+1].getX() * pontos[i].getY()));
            }else {
                area += (1/2)*((pontos[0].getX() * pontos[i].getY()) - (pontos[i].getX() * pontos[0].getY()));
            }
        }
        return area;
    }

    public void imprime(){
        for( int i=0; i <this.pontos.length; i++){
            if(this.pontos[i] != null){
                System.out.println("(x,y) = (" + this.pontos[i].getX() + "," + this.pontos[i].getY() + ")");
            }
        }
    }
}
