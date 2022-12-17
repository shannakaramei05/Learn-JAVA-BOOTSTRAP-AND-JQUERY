package MultiThread.sync;

public class Calculator {
    void multiplicationTable(int n) {
        // following block will ensure the method is accessible in synchronized manner
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
