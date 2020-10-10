package controller;

import java.util.Date;
import Enum.ReservationStatus;

public class Reservation {
    String number;
    Date date;
    int numOfDay;
    int numOfPeople;
    String cardNumber;
    boolean isPayment;
    double payment;
    double discount;
    ReservationStatus status;

    public Reservation(String number, Date date, int numOfDay, int numOfPeople, String cardNumber, boolean isPayment, double payment, double discount, ReservationStatus status) {
        this.number = number;
        this.date = date;
        this.numOfDay = numOfDay;
        this.numOfPeople = numOfPeople;
        this.cardNumber = cardNumber;
        this.isPayment = isPayment;
        this.payment = payment;
        this.discount = discount;
        this.status = status;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumOfDay() {
        return numOfDay;
    }

    public void setNumOfDay(int numOfDay) {
        this.numOfDay = numOfDay;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean isPayment() {
        return isPayment;
    }

    public void setPayment(boolean payment) {
        isPayment = payment;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public void confirm(){
        this.setStatus(ReservationStatus.CONFIRM);
    }

    public void cancel(){
        this.setStatus(ReservationStatus.CANCEL);
    }

    public void done(){
        this.setStatus(ReservationStatus.DONE);
    }

    public Reservation update(Reservation reservation){
        return null;
    }

}
