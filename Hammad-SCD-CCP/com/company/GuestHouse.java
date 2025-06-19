package com.company;
import java.util.HashMap;
public class GuestHouse {
 private HashMap<Integer, Reservation> allReservations;
 public GuestHouse() {
 allReservations = new HashMap();
 }
 /**
 * Cancels the specified reservation by:
 * - Removing it from guest house's reservations
 * - Removing it from the reserverPayer's reservations
 * - Deallocating the room
 *
 * @param reservationNumber The number of the reservation to cancel
 * @return Feedback about the cancelled reservation
 */
 public String cancelReservation(int reservationNumber) {
 // Defensive: Validate reservation number
 if (reservationNumber <= 0) {
 return "Invalid reservation number. Please enter a valid positive number.";
 }
 // Defensive: Check if reservation exists
 if (!allReservations.containsKey(reservationNumber)) {
 return "No reservation found with the given number.";
 }
 Reservation reservation = allReservations.get(reservationNumber);
 // Remove from GuestHouse record
 allReservations.remove(reservationNumber);
 // Remove from ReserverPayer's record
 ReserverPayer reserver = reservation.getReserverPayer();
 if (reserver != null) {
 reserver.removeReservation(reservationNumber);
 }
 
// Deallocate room
 Room room = reservation.getRoom();
 if (room != null) {
 room.deallocateRoom(reservation);
 }
 return "Reservation #" + reservationNumber + " has been successfully cancelled.";
 }
 // Optional: Method to add reservation for testing/demo
 public void addReservation(int number, Reservation reservation) {
 allReservations.put(number, reservation);
 }
}
 


 