package hotels;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Hotel hotel1=new Hotel();
        Room[] rooms1=new Room[hotel1.getHotelSize()];
        for (int i = 0; i < rooms1.length ; i++) {
            switch ((int)(Math.random()*3)) {
                case 0:
                    rooms1[i]=new ConferenceRoom((int)(Math.random()*601+100),new MaintenanceWorker(("worker"+(int)(Math.random()*200+1)),(int)(Math.random()*200+1), Math.random() > 0.5),
                              (int)(Math.random()*601+100),Math.random() > 0.5,Math.random() > 0.5);
                    break;
                case 1:
                    rooms1[i]=new BedRoom((int)(Math.random()*601+100),new MaintenanceWorker(("worker"+(int)(Math.random()*200+1)),(int)(Math.random()*200+1), Math.random() > 0.5),
                            (int)(Math.random()*5+1),Math.random() > 0.5);
                    break;
                case 2:
                    rooms1[i]=new Suite((int)(Math.random()*601+100),new MaintenanceWorker(("worker"+(int)(Math.random()*200+1)),(int)(Math.random()*200+1), Math.random() > 0.5),
                            (int)(Math.random()*5+1),(int)(Math.random()*5+1));
            }
        }
        hotel1.setHotelName("Blue Bay");
        hotel1.setHotelOwner("owner1");
        hotel1.setRooms(rooms1);
        for (Room room:rooms1) {
            room.cleanTheRoom(5);
        }
        System.out.println(hotel1);
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter room number:");
        hotel1.roomSearch(scanner.nextInt());
    }
}
