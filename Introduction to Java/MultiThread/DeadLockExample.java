package MultiThread;

public class DeadLockExample {
    public static void main(String[] args) {
        final String firstResource = "First Resource";
        final String secondResource = "Second Resource";
        // Following code demonstrates thread 1 attempt to lock firstResource then
        // secondResource
        Thread thread1 = new Thread("First Thread") {
            public void run() {
                synchronized (firstResource) {
                    System.out.println(this.getName() + " : First Resource is Locked");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                    synchronized (secondResource) {
                        System.out.println("Second Resource is Locked");
                    }
                }
            }
        };
        // Following code demonstrates thread 2 attempt to lock secondResource then
        // firstResource
        Thread thread2 = new Thread("Second Thread") {
            public void run() {
                synchronized (secondResource) {
                    System.out.println(this.getName() + " : Second Resource is Locked");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                    synchronized (firstResource) {
                        System.out.println("First Resource is Locked");
                    }
                }
            }
        };
        thread1.start();
        thread2.start();
    }
}
