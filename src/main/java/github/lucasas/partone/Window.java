package github.lucasas.partone;

public class Window {
    private final int widthCm;
    private final int heightCm;

    public Window(int widthCm, int heightCm) {
        this.widthCm = widthCm;
        this.heightCm = heightCm;
    }

    public int getAreaCm2() {
        return widthCm * heightCm;
    }

    public String getSizeString() {
        return widthCm + "x" + heightCm + "cm";
    }

    @Override
    public String toString() {
        return "Window{" +
                "widthCm=" + widthCm +
                ", heightCm=" + heightCm +
                '}';
    }
}
