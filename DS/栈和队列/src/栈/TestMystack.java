package 栈;

public class TestMystack {
    public static void main(String[] args) {
        MyStack ms = new MyStack(4);
        ms.push(3);
        ms.push(5);
        ms.push(7);
        ms.push(9);
        System.out.println(ms.isEmpty());
        System.out.println(ms.isFull());
    }
}
