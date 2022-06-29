package Ex01;

public class Main {

    public static void main(String[] args) {

        Objeto obj = Objeto.getInstance();
        Objeto obj1 = Objeto.getInstance();
        Objeto obj2 = Objeto.getInstance();

        obj.setId(158189);

        System.out.print(obj);
        System.out.print(obj1);
        System.out.print(obj2);

        System.out.println("\nAo atribuir valor ao ID de apenas um dos objetos, todos os outros passaram a ter o mesmo valor\n" +
                "isso acontece pois o único objeto criado foi o 'obj' e os outros representam este mesmo \nobjeto único que foi criado." +
                " O padrão de projeto SINGLETON permite este tipo de aplicação");

    }
}
