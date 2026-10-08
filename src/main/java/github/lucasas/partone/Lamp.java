package github.lucasas.partone;

public class Lamp {
    private final int watt;
    private boolean isOn;

    public Lamp(int watt) {
        this.watt = watt;
        isOn = false;
    }
    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public int getWatt() {
        return watt;
    }


    @Override
    public String toString() {
        return "Lamp{" +
                "watt=" + watt +
                ", isOn=" + isOn +
                '}';
    }
}
