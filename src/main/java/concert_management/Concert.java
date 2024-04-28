package concert_management;

public class Concert {
    private String singer;
    private String date;
    private String place;
    private double ticketPrice;
    private String contactNumber;

    public Concert(String singer, String date, String place, double ticketPrice, String contactNumber) {
        this.singer = singer;
        this.date = date;
        this.place = place;
        this.ticketPrice = ticketPrice;
        this.contactNumber = contactNumber;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}