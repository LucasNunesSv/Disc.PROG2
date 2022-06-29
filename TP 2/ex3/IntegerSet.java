package ex3;

public class IntegerSet {

    private boolean conjunto[] = new boolean[100];
    private String str[] = new String[100];
    private boolean AuB[] = new boolean[100];

    public void insert(int num) {
        if (num >= 0) {
            if (this.conjunto[num] == false) {
                this.conjunto[num] = true;
            } else {
                System.out.println(" !!! Este número já pertence ao conjunto !!! \n");
            }
        } else {
            System.out.println(" !!!! Número Inválido !!!! \n");
        }
    }

    public void delete(int num) {
        if (num >= 0) {
            if (this.conjunto[num] == true) {
                this.conjunto[num] = false;
            } else {
                System.out.println(" !!! Este número não pertence ao conjunto !!! \n");
            }
        } else {
            System.out.println(" !!!! Número Inválido !!!! \n");
        }
    }

    public void uniao(IntegerSet A, IntegerSet B) {
        for (int i = 0; i < 100; i++) {
            if (A.conjunto[i] == true || B.conjunto[i] == true) {
                this.conjunto[i] = true;
            } else {
                this.conjunto[i] = false;
            }
        }
    }

    public void intersecção(IntegerSet A, IntegerSet B) {
        for (int i = 0; i < 100; i++) {
            if (A.conjunto[i] == true && B.conjunto[i] == true) {
                this.conjunto[i] = true;
            } else {
                this.conjunto[i] = false;
            }
        }
    }

    public void diferença(IntegerSet A, IntegerSet B) {
        for (int i = 0; i < 100; i++) {
            if (A.conjunto[i] == true && B.conjunto[i] == false) {
                this.conjunto[i] = true;
            } else {
                this.conjunto[i] = false;
            }
        }
    }

    public void print_conj() {
        System.out.print(" { ");
        for (int i = 0; i < 100; i++) {
            if (this.conjunto[i] == true) {
                System.out.print(i + " - ");
            }
        }
        System.out.print("}");
    }

    public String[] return_string() {
        for (int i = 0; i < 100; i++) {
            if (this.conjunto[i] == true) {
                this.str[i] = Integer.toString(i);
            } else {
                this.str[i] = null;
            }
        }
        return str;
    }
}
