package Ex10;

public class InvalidOperationException extends Exception{

    private String msg;

    public InvalidOperationException(String msg){
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
