package class2;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setName("Thread-1");
        t.setPriority(Thread.MAX_PRIORITY);
        t.setDaemon(true);
        t.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread-2 is running...");
            }
        });
    }
}
