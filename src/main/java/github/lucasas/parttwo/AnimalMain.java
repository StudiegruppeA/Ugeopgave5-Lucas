package github.lucasas.parttwo;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Simba", 100));
        animals.add(new Wolf("Ulrik", 80));
        animals.add(new Rabbit("Kaj", 160));
        animals.add(new Wolf("Uffe", 80));

        for (int i = 0; i + 1 < animals.size(); i += 2) {
            Animal animalOne = animals.get(i);
            Animal animalTwo = animals.get(i + 1);

            System.out.println("=== Kamp: " + animalOne.getName() + " mod " + animalTwo.getName() + " ===");
            Contest contest = new Contest(animalOne, animalTwo);
            contest.play();
            System.out.println();
        }
    }
}
