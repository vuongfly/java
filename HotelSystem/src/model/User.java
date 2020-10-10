package model;

import javax.management.relation.Role;

public class User {
    String name;
    String username;
    String password;
    String email;
    String CMND;
    String address;
    String phone;
    String cardNumber;
    Role role;


    public User(String name, String username, String password, String email, String CMND, String address, String phone, String cardNumber, Role role) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.CMND = CMND;
        this.address = address;
        this.phone = phone;
        this.cardNumber = cardNumber;
        this.role = role;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(User user){
        setEmail(user.getEmail());
        setPassword(user.getPassword());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
