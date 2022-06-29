package Ex10;

public class InvalidOperationException_Alterado extends RuntimeException{

    private String msg;

    public InvalidOperationException_Alterado(String msg){
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
