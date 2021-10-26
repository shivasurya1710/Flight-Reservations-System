package com.company;

public class Flight {
    private int flightNumber;
    private String airline;
    private int capacity;
    private int seatsBooked;

    public Flight(int flightNumber, String airline, int capacity, int seatsBooked){
        this.flightNumber=flightNumber;
        this.airline=airline;
        this.capacity=capacity;
        this.seatsBooked=seatsBooked;
    }

    public void setFlightNumber(int flightNumber){
        this.flightNumber=flightNumber;
    }
    public void setAirline(String airline){
        this.airline=airline;
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    public void setSeatsBooked(int seatsBooked){
        this.seatsBooked=seatsBooked;
    }
    public int getFlightNumber(){
        return flightNumber;
    }
    public String getAirline(){
        return airline;
    }
    public int getCapacity(){
        return capacity;
    }
    public int getSeatsBooked(){
        return seatsBooked;
    }
    public String getFlight(){ return "Flight Number: " +this.getFlightNumber() +" Airline: " +this.getAirline()
            +" Capacity: " +this.getCapacity() +" Number of Seats Booked: " +this.getSeatsBooked();}
}
