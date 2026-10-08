package github.lucasas.parttwo;

import java.util.Random;

public class Wolf extends Animal{

    public Wolf(String name, int energy) {
        super(name, energy);
    }

    @Override
    public int attack() {
        Random random = new Random();
        return random.nextInt(40) + 1;
    }
}
