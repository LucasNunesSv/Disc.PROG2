package Ex01;

public class Objeto {

    private static Objeto instance;
    private int id;

    private Objeto() {

    }

    public static Objeto getInstance() {
        if (instance == null) {
            instance = new Objeto();
        }
        return instance;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nObjeto ID: " + this.id + "\n";
    }
}
