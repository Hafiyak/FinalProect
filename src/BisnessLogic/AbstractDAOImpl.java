package BisnessLogic;

import DAO.AbstractDAO;
import Objects.Hotel;
import Objects.Room;
import Objects.User;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 01.04.2017.
 */
public class AbstractDAOImpl implements AbstractDAO {


    private List<User> userList = new ArrayList<>();

    private List<Room> roomsDataBase = new ArrayList<>();
    private List<Room> roomsHotel1 = new ArrayList<>();
    private List<Room> roomsHotel2 = new ArrayList<>();
    private List<Room> roomsHotel3 = new ArrayList<>();
    private List<Room> roomsHotel4 = new ArrayList<>();
    private List<Room> roomsHotel5 = new ArrayList<>();

    private List<Hotel> hotels = new ArrayList<>();


    //Adding predefined users to the list
    @Override
    public void addUsersToDataBase() {
        User user = new User(1001,"Vasia","Popov");
        User user1 = new User(1002,"Dima","Popov");
        User user2 = new User(1003,"Oleksa","Popov");
        User user3 = new User(1004,"Zenia","Popov");
        User user4 = new User(1005,"Zuzanna","Popov");
        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
    }




    //Creating the random rooms with predefined and limited parameters
    private int roomId = 0;
    private Random random = new Random();

    @Override
    public Room generateRoom(int hotelID) {
        double price = random.nextInt(2500);
        return new Room(++roomId, random.nextInt((4 - 1) + 1) + 1,
                price, hotelID,
                random.nextBoolean(),
                random.nextInt(7),
                generateDefaultUser());
    }



    @Override
    public void addGeneratedRooms() {
        for(int i = 0; i < 15; i++){
            roomsHotel1.add(generateRoom(1));
            roomsHotel2.add(generateRoom(2));
            roomsHotel3.add(generateRoom(3));
            roomsHotel4.add(generateRoom(4));
            roomsHotel5.add(generateRoom(5));
        }

    }

    //Creating hotel objects with lists inside
    Hotel hotel1 = new Hotel(1, "President Hotel", "Uzghorod", roomsHotel1, 5);
    Hotel hotel2 = new Hotel(2, "Mama", "Odesa", roomsHotel2, 4);
    Hotel hotel3 = new Hotel(3, "LevLev", "Lviv", roomsHotel3, 3);
    Hotel hotel4 = new Hotel(4, "Shachta", "Doneck", roomsHotel4, 4);
    Hotel hotel5 = new Hotel(5, "VienoHrad", "Krim", roomsHotel5, 4);

    @Override
    public void addHotels() {
        hotels.add(hotel1);
        hotels.add(hotel2);
        hotels.add(hotel3);
        hotels.add(hotel4);
        hotels.add(hotel5);


    }


    //Copying hotel lists to mutable list
    @Override
    public List<Hotel> getHotels() {
        ArrayList<Hotel> pipiska = new ArrayList<>(hotels);
        return pipiska;
    }


    //Adding newly created User to existing User list
    @Override
    public void addNewUser(User user) {
        userList.add(user);
    }

    @Override
    public List<Room> allRoomsDB() {
        addGeneratedRooms();
        roomsDataBase.addAll(roomsHotel1);
        roomsDataBase.addAll(roomsHotel2);
        roomsDataBase.addAll(roomsHotel3);
        roomsDataBase.addAll(roomsHotel4);
        roomsDataBase.addAll(roomsHotel5);
        return roomsDataBase;
    }

    @Override
    public List<Room> getRoomDB() {
        return roomsDataBase;
    }

    // After reservation is cancelled to prevent NULL
    @Override
    public User generateDefaultUser() {
        User  user = new User(0,"freeReservationName","freeReservatiomLastName");
        return user;
    }

    @Override
    public List<User> getUserDataBase() {
       return userList;
    }
}
