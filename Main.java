package com.company;

public class Main {
    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnrNumber());
    }
    public static void main(String[] args) {
        Passenger passenger=new Passenger("Shivasurya", "8745123690", "uvi@gmail.com", "Street", "City", "State");
        Flight flight=new Flight(54123, "King", 100, 50);
        RegularTicket regularticket=new RegularTicket(7895, "Kanyakumari", "Chennai", "09:00",
                "17102021", "22:00", "17102021", "13", 410, true, true, "Shiva", "9874563210", "shiva@gmail.com", "street", "city", "state",
                542, "King", 80, 25);
        TouristTicket touristticket=new TouristTicket(9874563, "Kanyakumari", "Chennai", "09:00",
                "17102021", "22:00", "17102021", "13", 410, true, true,
                "Surya", "9874563210", "surya@gmail.com", "street", "city", "state",
                542, "Queen", 80, 25);
        System.out.println(passenger.getPassenger());
        System.out.println(regularticket.getRegularTicket());
        System.out.println(regularticket.getRTPassenger());
        System.out.println(regularticket.getRTFlight());
        printTicketDetails(regularticket);
        System.out.println(touristticket.getTouristTicket());
        System.out.println(touristticket.getTTPassenger());
        System.out.println(touristticket.getTTFlight());
        printTicketDetails(touristticket);
    }

}
