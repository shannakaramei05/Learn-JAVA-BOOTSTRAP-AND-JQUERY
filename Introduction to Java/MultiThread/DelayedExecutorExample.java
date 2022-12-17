package MultiThread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class DelayedExecutorExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        completableFuture.completeAsync(() -> {
            try {
                System.out.println("CompletableFUture - Executing the code block");
                return "CompletableFuture completeAsync executed successfully";
            } catch (Throwable e) {
                return "In catch block.";
            }
        },
                CompletableFuture.delayedExecutor(3, TimeUnit.SECONDS))
                .thenAccept(result -> System.out.println("In Accept: " + result));

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Executing For loop Block: " + i + " s");
        }
    }
}
