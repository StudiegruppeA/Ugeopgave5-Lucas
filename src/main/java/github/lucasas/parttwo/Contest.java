package github.lucasas.parttwo;

public class Contest {
    private final Animal animalOne;
    private final Animal animalTwo;
    private Animal winner = null;

    public Contest(Animal animalOne, Animal animalTwo) {
        this.animalOne = animalOne;
        this.animalTwo = animalTwo;
    }

    public void play() {
        int round = 1;
        while (animalOne.isActive() && animalTwo.isActive()) {
            System.out.println("--- Runde " + round + " ---");
            fight(animalOne, animalTwo);
            if (animalTwo.isActive()) {
                fight(animalTwo, animalOne);
            }
            round++;
        }

        winner = findWinner();
        printWinner();
    }

    public Animal getWinner() {
        return winner;
    }

    private Animal findWinner() {
        if (animalOne.isActive()) {
            return animalOne;
        } else {
            return animalTwo;
        }
    }

    private void printWinner() {
        System.out.println("---- Vinder ----");
        System.out.println(winner.getName() + " har vundet kampen med " + winner.getEnergy() + " energi tilbage!");
    }

    private void fight(Animal attacker, Animal victim) {
        int damage = attacker.attack();
        victim.removeEnergy(damage);
        System.out.println(attacker.getName() + " angriber " + victim.getName() + " for " + damage
                + " (" + victim.getName() + " har " + victim.getEnergy() + " energi tilbage)");
    }
}
