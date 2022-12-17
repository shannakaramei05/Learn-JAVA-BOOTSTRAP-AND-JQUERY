package MultiThread.sync;

public class SynchronizationBlockExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        WorkThread1 t1 = new WorkThread1(calculator);
        WorkThread2 t2 = new WorkThread2(calculator);

        t1.start();
        t2.start();
    }
}
