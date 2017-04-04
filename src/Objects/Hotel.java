package Objects;

import java.util.List;

/**
 * Created by user on 01.04.2017.
 */
public class Hotel {

    private int hotelId;
    private String hotelName;
    private String city;
    private List<Room> rooms;
    private int stars;

    public Hotel(int hotelId, String hotelName, String city, List<Room> rooms, int stars) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.city = city;
        this.rooms = rooms;
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                ", city='" + city + '\'' +
                ", rooms=" + rooms +
                ", stars=" + stars +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hotel hotel = (Hotel) o;

        if (hotelId != hotel.hotelId) return false;
        if (stars != hotel.stars) return false;
        if (hotelName != null ? !hotelName.equals(hotel.hotelName) : hotel.hotelName != null) return false;
        if (city != null ? !city.equals(hotel.city) : hotel.city != null) return false;
        return rooms != null ? rooms.equals(hotel.rooms) : hotel.rooms == null;
    }

    @Override
    public int hashCode() {
        int result = hotelId;
        result = 31 * result + (hotelName != null ? hotelName.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (rooms != null ? rooms.hashCode() : 0);
        result = 31 * result + stars;
        return result;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
