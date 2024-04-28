package concert_management; 

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        ConcertManagement concertManagement = new ConcertManagement();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("What would you like to do?");
            System.out.println("C. Add New Concert");
            System.out.println("R. View All Concerts");
            System.out.println("U. Update Concert");
            System.out.println("D. Delete Concert");
            System.out.println("E. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();
             
            if (choice.equals("C")) {
                System.out.print("Enter singer: ");
                String singer = scanner.nextLine();
                System.out.print("Enter date (YYYY-MM-DD): ");
                String date = scanner.nextLine();
                System.out.print("Enter place: ");
                String place = scanner.nextLine();
                System.out.print("Enter ticket price: ");
                double ticketPrice = scanner.nextDouble();
                scanner.nextLine(); 
                System.out.print("Enter contact number: ");
                String contactNumber = scanner.nextLine();
                concertManagement.create(singer, date, place, ticketPrice, contactNumber);
            } else if (choice.equals("R")) {
                concertManagement.read();
            } else if (choice.equals("U")) {
                System.out.print("Enter the singer of the concert: ");
                String searchSinger = scanner.nextLine();
                Concert foundConcert = concertManagement.findConcertBySinger(searchSinger);
                if (foundConcert != null) {
                    System.out.print("Enter new date (YYYY-MM-DD): ");
                    String newDate = scanner.nextLine();
                    System.out.print("Enter new place: ");
                    String newPlace = scanner.nextLine();
                    System.out.print("Enter new ticket price: ");
                    double newTicketPrice = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline after nextDouble()
                    System.out.print("Enter new contact number: ");
                    String newContactNumber = scanner.nextLine();
                    concertManagement.update(foundConcert, newDate, newPlace, newTicketPrice, newContactNumber);
                } 
            }else if (choice.equals("D")) {
                System.out.print("Enter the singer of the concert you want to delete: ");
                String deleteSinger = scanner.nextLine();
                Concert deleteConcert = concertManagement.findConcertBySinger(deleteSinger);
                if (deleteConcert != null) {
                    concertManagement.delete(deleteConcert);
                } else {
                    System.out.println("Concert not found for singer: " + deleteSinger);
                }
            } else if (choice.equals("E")) {
                exit = true;
                System.out.println("Exiting program. Goodbye!");
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        scanner.close();
    }

}