package Ex01;

public class Ponto {

    private int x;
    private int y;

    public Ponto(int p_x, int p_y){
        this.x = p_x;
        this.y = p_y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean equals(Ponto p2){
        if(this.x == p2.getX() && this.y == p2.getY()){
            return true;
        }else{
            return false;
        }
    }

    public String to_string(){
        String str;
        str = ("(x,y) = (" + this.x + "," + this.y + ")");
        return str;
    }

    public void imprime(){
        System.out.println("(x,y) = (" + this.x + "," + this.y + ")");
    }

}
