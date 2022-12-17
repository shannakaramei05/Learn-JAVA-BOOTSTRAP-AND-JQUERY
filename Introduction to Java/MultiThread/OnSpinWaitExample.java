package MultiThread;

public class OnSpinWaitExample {
    volatile boolean notificationAlert = true;

    public static void main(String[] args) {
        OnSpinWaitExample onSpinWaitExample = new OnSpinWaitExample();
        onSpinWaitExample.waitForEventAndHandleIt();
    }

    public void waitForEventAndHandleIt() {
        while (notificationAlert) {
            java.lang.Thread.onSpinWait();
            System.out.println("in the Loop");
        }
        processEvent();
    }

    public void processEvent() {
        System.out.println("in The process Event");
    }
}
