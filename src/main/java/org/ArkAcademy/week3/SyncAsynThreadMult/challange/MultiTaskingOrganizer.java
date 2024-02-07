package org.ArkAcademy.week3.SyncAsynThreadMult.challange;

import java.util.concurrent.CompletableFuture;

public class MultiTaskingOrganizer {
    // Synchronous Approach
    public void executeTasksSynchronously(Task[] tasks) {
        for (Task task : tasks) {
            System.out.println("Executing task synchronously: " + task.getTaskName());
            performTask(task);
            System.out.println("Task completed: " + task.getTaskName());
        }
    }

    private void performTask(Task task) {
        try {
            Thread.sleep(task.getDuration());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Asynchronous Approach
    public void executeTasksAsynchronously(Task[] tasks) {
        CompletableFuture<?>[] futures = new CompletableFuture<?>[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            Task task = tasks[i];
            futures[i] = CompletableFuture.runAsync(() -> {
                System.out.println("Executing task asynchronously: " + task.getTaskName());
                performTask(task);
                System.out.println("Task completed: " + task.getTaskName());
            });
        }
        CompletableFuture.allOf(futures).join(); // Wait for all tasks to complete
    }

    // Concurrency Challenge: Shorter tasks complete first
    public void executeConcurrently(Task[] tasks) {
        for (Task task : tasks) {
            CompletableFuture.runAsync(() -> {
                System.out.println("Executing task concurrently: " + task.getTaskName());
                performTask(task);
                System.out.println("Task completed: " + task.getTaskName());
            });
        }
    }
}
