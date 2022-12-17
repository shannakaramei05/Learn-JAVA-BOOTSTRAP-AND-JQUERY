package MultiThread;

public class JavaMultiThreadingExample extends Thread {
    public void run() {
        System.out.println("My NewThread is Running");
    }

    public static void main(String[] args) {
        JavaMultiThreadingExample newThread = new JavaMultiThreadingExample();
        newThread.start();
    }
}
