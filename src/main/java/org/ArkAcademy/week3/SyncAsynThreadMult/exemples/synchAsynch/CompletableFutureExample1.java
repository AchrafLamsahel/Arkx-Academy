package org.ArkAcademy.week3.SyncAsynThreadMult.exemples.synchAsynch;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample1 {
    public static void main(String[] args) {
        // Analogy: Ordering a meal using a food delivery service
        // Step 1: Place an order for the main course (Asynchronous task 1)
        CompletableFuture<String> mainCourseOrder = orderMainCourse();
        // Continue with other tasks while waiting for the main course

        // Step 2: Place an order for dessert (Asynchronous task 2)
        CompletableFuture<String> dessertOrder = orderDessert();

        // Continue with other tasks while waiting for dessert

        // Step 3: Combine the results when both main course and dessert are delivered
        CompletableFuture<String> fullMeal = mainCourseOrder.thenCombine(dessertOrder, (mainCourse, dessert) ->
                "Enjoy your meal! Main Course: " + mainCourse + " | Dessert: " + dessert);

        // Continue with other tasks while waiting for the full meal

        // Step 4: Block and get the combined result when the full meal is ready
        try {
            String mealResult = fullMeal.get();
            System.out.println(mealResult);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    // Simulate ordering the main course asynchronously
    public static CompletableFuture<String> orderMainCourse() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Main course ordered. Cooking in progress...");
            try {
                Thread.sleep(3000); // Simulating cooking time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Delicious Main Course";
        });
    }

    // Simulate ordering dessert asynchronously
    public static CompletableFuture<String> orderDessert() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Dessert ordered. Preparing in progress...");
            try {
                Thread.sleep(2000); // Simulating preparation time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Tasty Dessert";
        });
    }
}