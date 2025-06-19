 package com.company;
public class Reservation {
 private int reservationNumber;
 private ReserverPayer reserverPayer;
 private Room room;
 public Reservation(int reservationNumber, ReserverPayer reserverPayer, 
Room room) {
 this.reservationNumber = reservationNumber;
 this.reserverPayer = reserverPayer;
 this.room = room;
 }
 public ReserverPayer getReserverPayer() {
 return reserverPayer;
 }
 public Room getRoom() {
 return room;
 }
 public int getReservationNumber() {
 return reservationNumber;
 }
}
 
    
