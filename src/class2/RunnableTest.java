package class2;

public class RunnableTest {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        Thread t2 = new Thread(r);
        t.start();
        t2.start();

    }
}
