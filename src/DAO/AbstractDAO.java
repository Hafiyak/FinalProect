package DAO;

import Objects.Hotel;
import Objects.Room;
import Objects.User;

import java.util.List;

/**
 * Created by user on 31.03.2017.
 */

public interface AbstractDAO {

    void addUsersToDataBase();//Adding users to the list

    Room generateRoom(int hotelID); //Generating random rooms

    void addGeneratedRooms(); //filling the list with random rooms

    void addHotels(); //Adding hotels to the list

    List<Hotel> getHotels();

    void addNewUser(User user);

    List<Room> allRoomsDB();

    List<Room> getRoomDB();//Get rooms from Database

    User generateDefaultUser();

    List<User> getUserDataBase();

}
