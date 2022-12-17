package MultiThread.sync;

public class WorkThread1 extends Thread {
    Calculator t;

    WorkThread1(Calculator t) {
        this.t = t;
        this.setName("Work Thread 1");
    }

    public void run() {
        t.multiplicationTable(3);
    }
}
