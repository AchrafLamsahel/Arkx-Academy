package org.ArkAcademy.week3.FileIOSerrialization.challange;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Story story = new Story();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Collaborative Storyteller!");
        while (true) {
            System.out.println("Enter your sentence (or type 'exit' to finish):");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("Enter your name:");
            String author = scanner.nextLine();
            story.addSentence(input, author);
            story.saveProgress("story_progress.txt");
        }
        story.loadProgress("story_progress.txt");
        for (Sentence sentence : story.sentences) {
            System.out.println(sentence.author + ": " + sentence.text);
        }
    }
}
