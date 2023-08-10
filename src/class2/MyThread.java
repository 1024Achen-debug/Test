package class2;

public class MyThread extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("Hello from MyThread");
        }
    }
}
