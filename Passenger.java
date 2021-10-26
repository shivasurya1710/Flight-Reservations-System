package com.company;

public class Passenger {
    public class Contact {
        private String name;
        private String phoneNumber;
        private String emailId;

        public Contact(String name, String phoneNumber, String emailId){
            this.name=name;
            this.phoneNumber=phoneNumber;
            this.emailId=emailId;
        }
        public void setName(String name){
            this.name=name;
        }
        public void setPhoneNumber(String phoneNumber){
            this.phoneNumber=phoneNumber;
        }
        public void setEmailId(String emailId){
            this.emailId=emailId;
        }
        public String getName() {
            return name;
        }
        public String getPhoneNumber() {
            return phoneNumber;
        }
        public String getEmailId(){
            return emailId;
        }
    }

    public class Address {
        private String street;
        private String city;
        private String state;

        public Address(String street, String city, String state){
            this.street=street;
            this.city=city;
            this.state=state;
        }
        public void setStreet(String street){
            this.street=street;
        }
        public void setCity(String city){
            this.city=city;
        }
        public void setState(String state){
            this.state=state;
        }
        public String getStreet() {
            return street;
        }
        public String getCity() {
            return city;
        }
        public String getState(){
            return state;
        }
    }

    private static int idCounter;
    private Address address;
    private Contact contact;
    public Passenger(String name, String phoneNumber,
                     String emailId, String street, String city,
                     String state) {
        this.address = new Address(street, city, state);
        this.contact = new Contact(name, phoneNumber, emailId);
    }
    public void setIdCounter(){
        ++this.idCounter;
    }
    public String getContact(){
        return "Name: " +contact.getName() +", PhoneNumber: " +contact.getPhoneNumber() +", EmailId: " +contact.getEmailId();
    }
    public String getAddress(){
        return "Street: " +address.getStreet() +", City: " +address.getCity() +", State: " + address.getState();
    }
    public String getIdCounter(){
        return "IdCounter: "+this.idCounter +" ";
    }
    public String getPassenger(){
        return this.getIdCounter() +this.getContact() +this.getAddress();
    }
}
