package com.company;
import java.util.ArrayList;
public class Room {
 private ArrayList<Reservation> roomReservations = new ArrayList();
 public void deallocateRoom(Reservation reservation) {
 roomReservations.remove(reservation);
 }
 public void allocateRoom(Reservation reservation) {
 roomReservations.add(reservation);
 }
}