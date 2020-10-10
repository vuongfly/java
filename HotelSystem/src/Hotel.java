/**
 * Class hotel
 */

import DB.RepositoryPattern.UserRepository;
import model.*;
import model.User;

import java.util.ArrayList;

public class Hotel {
    String address;
    String name;
    ArrayList<Room> rooms;
    UserRepository userRepository;

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Hotel(String address, String name) {
        this.address = address;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoom() {
        rooms.add(new Room("1", "Room 1", 15, 6, 150, false));
        rooms.add(new Room("2", "Room 2", 25, 6, 250, false));
        rooms.add(new Room("3", "Room 3", 55, 6, 550, false));
    }

    public User register(model.User user) {
        // check email

        // create new user
        userRepository.insert(user);
        return user;
    }

    public boolean login(String email, String password) {
        // check email
        // check password

        return true;
    }

    public void checkAccount() {

    }

}
