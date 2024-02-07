package org.ArkAcademy.week3.SyncAsynThreadMult.challange;

public class Main {
    public static void main(String[] args) {
        MultiTaskingOrganizer organizer = new MultiTaskingOrganizer();
        Task[] tasks = {
                new Task("Task 1", 2000),
                new Task("Task 2", 3000),
                new Task("Task 3", 1000)
        };

        System.out.println("Executing tasks synchronously:");
        organizer.executeTasksSynchronously(tasks);

        System.out.println("\nExecuting tasks asynchronously:");
        organizer.executeTasksAsynchronously(tasks);

        System.out.println("\nExecuting tasks concurrently (shorter tasks first):");
        organizer.executeConcurrently(tasks);
    }
}
