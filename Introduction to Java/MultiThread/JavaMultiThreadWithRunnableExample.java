package MultiThread;

public class JavaMultiThreadWithRunnableExample implements Runnable {
    public void run() {
        System.out.println("My newThread is Running");
    }

    /* only can for 1 function ?? */
    public void stop() {
        System.out.println("My Thead is Stooping for a while");
    }

    public void walk() {
        System.out.println("Start walking now. !");
    }

    public static void main(String[] args) {
        JavaMultiThreadWithRunnableExample myRunnableObj = new JavaMultiThreadWithRunnableExample();
        Thread newThread = new Thread(myRunnableObj);
        newThread.start();
    }

}
