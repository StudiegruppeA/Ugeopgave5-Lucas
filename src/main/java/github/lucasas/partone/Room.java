package github.lucasas.partone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Room {
    private final String name;
    private final List<Lamp> lamps = new ArrayList<>();
    private final List<Window> windows = new ArrayList<>();

    public Room(String name) {
        this.name = name;
    }

    public void addLamp(Lamp lamp) {
        lamps.add(lamp);
    }

    public void addWindow(Window window) {
        windows.add(window);
    }

    public int getLampCount() {
        return lamps.size();
    }

    public int getWindowCount() {
        return windows.size();
    }

    public int getTotalWatt() {
        return lamps.stream().mapToInt(Lamp::getWatt).sum();
    }

    public int getTotalWindowArea() {
        return windows.stream().mapToInt(Window::getAreaCm2).sum();
    }

    public void printRoom() {
        System.out.println(name + " (" + getLampCount() + " lamper, " + getWindowCount() + " vinduer)");
        System.out.println("Lamper: " + lampsToString() + " (total: " + getTotalWatt() + "W)");
        System.out.println("Vinduer: " + windowsToString());
    }

    private String lampsToString() {
        return lamps.stream()
                .map(lamp -> lamp.getWatt() + "W")
                .collect(Collectors.joining(", "));
    }

    private String windowsToString() {
        return windows.stream()
                .map(Window::getSizeString)
                .collect(Collectors.joining(", "));
    }
}
