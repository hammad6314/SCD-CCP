package com.company;
import com.company.GuestHouse;
import com.company.Reservation;
import com.company.Room;
import com.company.ReserverPayer;

public class Main {
   public static void main(String[] args) {
 // Create GuestHouse instance
 GuestHouse guestHouse = new GuestHouse();
 // Create supporting objects
 ReserverPayer reserver = new ReserverPayer();
 Room room = new Room();
 // Create a Reservation with ID 1001
 Reservation reservation = new Reservation(1001, reserver, room);
 // Add the reservation to all relevant places
 guestHouse.addReservation(1001, reservation); // Add to GuestHouse
 reserver.addReservation(1001, reservation); // Add to ReserverPayer
 room.allocateRoom(reservation); // Add to Room
 // Cancel the reservation
 String result = guestHouse.cancelReservation(1001);
 // Print the result
 System.out.println(result);
 }
}
