package github.lucasas.parttwo;

public class Lion extends Animal{

    public Lion(String name, int energy) {
        super(name, energy);
    }

    @Override
    public int attack() {
        return 25;
    }
}
