package github.lucasas.partone;

public class BuildingMain {
   public static void main(String[] args) {
        Room room = new Room("Klasse1");
        room.addLamp(new Lamp(232));
        room.addLamp(new Lamp(12));
        room.addWindow(new Window(13,55));

        Room room2 = new Room("Møderum");
        room2.addWindow(new Window(12,8));
        room2.addWindow(new Window(13,53));
        room2.addLamp(new Lamp(12));

        Building building = new Building("Kontor");
        building.addRoom(room);
        building.addRoom(room2);
        building.printBuilding();

    }
}
