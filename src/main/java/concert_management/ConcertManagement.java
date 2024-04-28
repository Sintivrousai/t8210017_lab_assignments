package concert_management;

import java.util.ArrayList;
import java.util.List;

public class ConcertManagement {
    List<Concert> concertList;

    public ConcertManagement() {
        this.concertList = new ArrayList<>();
    }
    public void  create(String singer, String date, String place, double ticketPrice, String contactNumber){
        Concert con= new Concert(singer, date, place, ticketPrice, contactNumber);
        concertList.add(con);
        System.out.println("Concert added successfully");
    }

    public void read() {
        if (concertList.isEmpty()) {
            System.out.println("No concerts added yet.");
        } else {
            System.out.println("All Concerts");
            for (Concert concert : concertList) {
                System.out.println("Singer: " + concert.getSinger()+ " Date: " + concert.getDate()+ " Place: " + concert.getPlace()+ " Ticket Price: " + concert.getTicketPrice()+ " Contact Number: " + concert.getContactNumber());
            }
        }
    }

    public Concert findConcertBySinger(String singer){
        Concert current=null;
        for (Concert concert : concertList) {
            if (concert.getSinger().equals(singer)) {
            current= concert;
            }
        }
        if (current==null) {
            System.out.println("The concert you are looking for does not exist");  
        } else {
            System.out.println("The current concert details are: Singer: " + current.getSinger()+ " Date: " + current.getDate()+ " Place: " + current.getPlace()+ " Ticket Price: " + current.getTicketPrice()+ " Contact Number: " + current.getContactNumber());
        }
        
        return current;
    }

    public void  update(Concert con, String newdate, String newplace, double newticketPrice, String newcontactNumber ){
        con.setDate(newdate);
        con.setPlace(newplace);
        con.setTicketPrice(newticketPrice);
        con.setContactNumber(newcontactNumber);
        System.out.println("The new concert details are Singer: " + con.getSinger()+ " Date: " + con.getDate()+ " Place: " + con.getPlace()+ " Ticket Price: " + con.getTicketPrice()+ " Contact Number: " + con.getContactNumber());
    }

    public void  delete(Concert con ){
        concertList.remove(con);
        System.out.println("The concert has been deleted successfully");
    }


}