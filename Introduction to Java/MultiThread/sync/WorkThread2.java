package MultiThread.sync;

public class WorkThread2 extends Thread {
    Calculator t;

    WorkThread2(Calculator t) {
        this.t = t;
        this.setName("Worker Thread 2");
    }

    public void run() {
        t.multiplicationTable(40);
    }
}
