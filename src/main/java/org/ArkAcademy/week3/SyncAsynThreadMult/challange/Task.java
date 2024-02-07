package org.ArkAcademy.week3.SyncAsynThreadMult.challange;

public class Task {
    private static int nextId = 1;
    private int taskId;
    private String taskName;
    private int duration; // Simulated time in milliseconds

    public Task(String taskName, int duration) {
        this.taskId = nextId++;
        this.taskName = taskName;
        this.duration = duration;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getDuration() {
        return duration;
    }
}
