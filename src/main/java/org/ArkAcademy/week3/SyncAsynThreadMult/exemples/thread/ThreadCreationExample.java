package org.ArkAcademy.week3.SyncAsynThreadMult.exemples.thread;

public class ThreadCreationExample {
    public static void main(String[] args) {
        // Analogy: Organizing a talent show

        // Step 1: Setting up the stage (Creating a Thread for Stage Setup)
        Thread stageSetupThread = new Thread(() -> {
            System.out.println("Setting up the stage... This may take a while.");
            try {
                Thread.sleep(3000); // Simulating stage setup time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Stage setup complete!");
        });

        // Continue with other tasks while setting up the stage

        // Step 2: Checking the lighting (Creating a Thread for Lighting Check)
        Thread lightingCheckThread = new Thread(() -> {
            System.out.println("Checking the lighting... This may take some time.");
            try {
                Thread.sleep(2000); // Simulating lighting check time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Lighting check complete!");
        });

        // Continue with other tasks while checking the lighting

        // Step 3: Start both threads to perform tasks concurrently
        stageSetupThread.start();
        lightingCheckThread.start();

        // Continue with other tasks while threads are performing their tasks

        // Step 4: Block until both threads finish their tasks
        try {
            stageSetupThread.join();
            lightingCheckThread.join();
            System.out.println("Both stage setup and lighting check are complete. Talent show is ready!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}