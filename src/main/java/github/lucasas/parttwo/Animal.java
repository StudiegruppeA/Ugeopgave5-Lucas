package github.lucasas.parttwo;

public abstract class Animal {
    private final String name;
    private int energy;

    public Animal(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public boolean isActive() {
        return energy > 0;
    }

    public void removeEnergy(int energy) {
        this.energy -= energy;
        if (this.energy < 0) {
            this.energy = 0;
        }
    }

    public abstract int attack();

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }
}
