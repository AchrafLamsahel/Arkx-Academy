package org.ArkAcademy.week2.EncapInheritPolym.practicalExample;

public class ZooMain {
    public static void main(String[] args) {
        // Polymorphic array of animals
        Animal[] zoo = new Animal[3];
        zoo[0] = new Lion("Leo", 5);
        zoo[1] = new Penguin("Chilly", 2);
        zoo[2] = new Animal("Generic Animal", 3);

        // Display information using polymorphism
        for (Animal animal : zoo) {
            animal.displayInfo();
            System.out.println("------------------");
        }
    }
}
