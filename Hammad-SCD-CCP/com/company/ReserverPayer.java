 package com.company;
import java.util.HashMap;
public class ReserverPayer {
 private HashMap<Integer, Reservation> myReservations = new HashMap();
 public void removeReservation(int reservationNumber) {
 if (reservationNumber > 0 && 
myReservations.containsKey(reservationNumber)) {
 myReservations.remove(reservationNumber);
 }
 }
 public void addReservation(int reservationNumber, Reservation 
reservation) {
 myReservations.put(reservationNumber, reservation);
 }
 
    
}
