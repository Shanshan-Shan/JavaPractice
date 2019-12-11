import java.util.ArrayList;

public class ThrowException {
    public static void main(String[] args) {
        try{
            new ArrayList().get(0);
        } catch (RuntimeException e){
            throw new MyException ("我是RuntimeException", e);
        }
    }
}
