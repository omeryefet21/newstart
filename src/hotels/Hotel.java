package hotels;

import java.util.Arrays;

public class Hotel {
    private final int hotelSize=6;
    private String hotelName,hotelOwner;
    private Room[] rooms;

    public Hotel() {
    }

    public Hotel(String hotelName, String hotelOwner, Room[] rooms) {
        this.hotelName = hotelName;
        this.hotelOwner = hotelOwner;
        this.rooms = rooms;
    }

    public int getHotelSize() {
        return hotelSize;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelOwner() {
        return hotelOwner;
    }

    public void setHotelOwner(String hotelOwner) {
        this.hotelOwner = hotelOwner;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "\nHotel{" +
                "hotelSize=" + hotelSize +
                ", hotelName='" + hotelName + '\'' +
                ", hotelOwner='" + hotelOwner + '\'' +
                ", rooms=\n" + Arrays.toString(rooms) +
                '}';
    }
    public void roomSearch(int roomNumber) {
        for (Room room:rooms) {
            if (room.getRoomNumber()==roomNumber) {
                System.out.println(room.toString());
                return;
            }
        }
        System.out.println("Room number "+roomNumber+" does not exist in "+getHotelName()+" hotel");
    }
}
