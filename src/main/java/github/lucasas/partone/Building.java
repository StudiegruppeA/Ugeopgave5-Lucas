package github.lucasas.partone;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private final String name;
    private final List<Room> rooms = new ArrayList<>();

    public Building(String name) {
        this.name = name;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public int getTotalLampCount() {
        return rooms.stream().mapToInt(Room::getLampCount).sum();
    }

    public int getTotalWatt() {
        return rooms.stream().mapToInt(Room::getTotalWatt).sum();
    }

    public void printBuilding() {
        System.out.println("=== " + name + " ===");
        rooms.forEach(Room::printRoom);
        System.out.println("Total: " + getTotalLampCount() + " lamper, " + getTotalWatt() + "W");
    }
}
