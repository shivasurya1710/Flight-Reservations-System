package com.company;

public class Ticket {
    private int pnrNumber;
    private String departure;
    private String destination;
    private String timeOfDeparture;
    private String dateOfDeparture;
    private String timeOfArrival;
    private String dateOfArrival;
    private String totalDuration;
    private int price;
    private boolean isConfirmed;
    private boolean isCancelled;

    private Passenger passenger;
    private Flight flight;
    public Ticket(int pnrNumber){
        this.pnrNumber=pnrNumber;
    }
    public Ticket(int pnrNumber, String departure, String destination, String timeOfDeparture,
                  String dateOfDeparture, String timeOfArrival, String dateOfArrival,
                  String totalDuration, int price, boolean isConfirmed, boolean isCancelled,
                  String name, String phoneNumber,
                  String emailId, String street, String city, String state,
                  int flightNumber, String airline, int capacity, int seatsBooked){
        this.pnrNumber=pnrNumber;
        this.departure=departure;
        this.destination=destination;
        this.timeOfDeparture=timeOfDeparture;
        this.dateOfDeparture=dateOfDeparture;
        this.timeOfArrival=timeOfArrival;
        this.dateOfArrival=dateOfArrival;
        this.totalDuration=totalDuration;
        this.price=price;
        this.isConfirmed=isConfirmed;
        this.isCancelled=isCancelled;
        this.passenger=new Passenger(name, phoneNumber, emailId, street, city, state);
        this.flight=new Flight(flightNumber, airline, capacity, seatsBooked);
    }

    public void setPnrNumber(int pnrNumber){
        this.pnrNumber=pnrNumber;
    }
    public void setDeparture(String departure){
        this.departure=departure;
    }
    public void setDestination(String destination){
        this.destination=destination;
    }
    public void setTimeOfDeparture(String timeOfDeparture){
        this.timeOfDeparture=timeOfDeparture;
    }
    public void setDateOfDeparture(String dateOfDeparture){
        this.dateOfDeparture=dateOfDeparture;
    }
    public void setTimeOfArrival(String timeOfArrival){
        this.timeOfArrival=timeOfArrival;
    }
    public void setDateOfArrival(String dateOfArrival){
        this.dateOfArrival=dateOfArrival;
    }
    public void setTotalDuration(String totalDuration){
        this.totalDuration=totalDuration;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setConfirmed(boolean isConfirmed){
        this.isConfirmed=isConfirmed;
    }
    public void setCancelled(boolean isCancelled){
        this.isCancelled=isCancelled;
    }
    public int getPnrNumber(){
        return pnrNumber;
    }
    public String getDeparture(){
        return departure;
    }
    public String getDestination(){
        return destination;
    }
    public String getTimeOfDeparture(){
        return timeOfDeparture;
    }
    public String getDateOfDeparture(){
        return dateOfDeparture;
    }
    public String getTimeOfArrival(){
        return timeOfArrival;
    }
    public String getDateOfArrival(){ return dateOfArrival; }
    public String getTotalDuration(){ return totalDuration; }
    public int getPrice(){ return price; }
    public boolean getConfirmed(){ return isConfirmed; }
    public boolean getCancelled(){ return isCancelled; }
    public String getPassengerDetails(){ return passenger.getContact() + passenger.getAddress(); }
    public String getFlightDetails(){ return flight.getFlight(); }
    public String getTicket(){
        return "PnrNumber: " +this.getPnrNumber() +" Departure: " +this.getDeparture() +" Destination: "
                + this.getDestination() +" Time of Departure: " +this.getTimeOfDeparture() +" Date of Departure: "
                + this.getDateOfDeparture() +" Time of Arrival: " +this.getTimeOfArrival() +" Date of Arrival: "
                + this.getDateOfArrival() +" TotalDuration: " +this.getTotalDuration() +" Price: " +this.getPrice()
                +" Confirmation Status: " +this.getConfirmed() + " Cancellation Status: " +this.getCancelled(); }
}
