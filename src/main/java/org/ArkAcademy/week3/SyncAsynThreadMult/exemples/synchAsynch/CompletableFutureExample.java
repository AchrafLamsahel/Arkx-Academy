package org.ArkAcademy.week3.SyncAsynThreadMult.exemples.synchAsynch;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        // Asynchronous task
        CompletableFuture.runAsync(() -> {
            try {
                // Simulating a time-consuming operation
                Thread.sleep(2000);
                // Completing the CompletableFuture with a result
                completableFuture.complete("Task completed successfully");
            } catch (InterruptedException e) {
                // Completing exceptionally in case of an error
                completableFuture.completeExceptionally(e);
            }
        });
        // Continue with other tasks while the CompletableFuture is running asynchronously
        // Block and get the result when needed
        try {
            String result = completableFuture.get();
            System.out.println(result);
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
