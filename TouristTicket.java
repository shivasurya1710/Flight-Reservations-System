package com.company;

public class TouristTicket extends Ticket {
    public Ticket ticket;
    public TouristTicket(int pnrNumber){
        super(pnrNumber);
    }
    public TouristTicket(int pnrNumber, String departure, String destination, String timeOfDeparture, String dateOfDeparture, String timeOfArrival, String dateOfArrival, String totalDuration, int price, boolean isConfirmed, boolean isCancelled, String name, String phoneNumber, String emailId, String street, String city, String state, int flightNumber, String airline, int capacity, int seatsBooked) {
        super(pnrNumber, departure, destination, timeOfDeparture, dateOfDeparture, timeOfArrival, dateOfArrival, totalDuration, price, isConfirmed, isCancelled, name, phoneNumber, emailId, street, city, state, flightNumber, airline, capacity, seatsBooked);
    }

    public String getTouristTicket(){
        return super.getTicket();
    }
    public String getTTPassenger(){
        return super.getPassengerDetails();
    }
    public String getTTFlight(){
        return super.getFlightDetails();
    }
}
