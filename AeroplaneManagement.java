
public class AeroplaneManagement {

    static int totalSeats = 10;
    static int ticketPrice = 2500;
    static int bookedSeats = 0;

    static void displayFlights() {
        System.out.println("Flight: Pune to Delhi");
        System.out.println("Ticket Price: Rs." + ticketPrice);
        System.out.println("Available Seats: " + (totalSeats - bookedSeats));
    }

    static void bookTicket(int passengers) {
        if (passengers <= 0) {
            System.out.println("Invalid passenger count");
        } else if (passengers > totalSeats - bookedSeats) {
            System.out.println("Not enough seats available");
        } else {
            int total = ticketPrice * passengers;
            int discount = 0;

            if (passengers >= 3) {
                discount = total * 10 / 100;
            }

            int finalAmount = total - discount;
            bookedSeats += passengers;

            System.out.println("Booking Successful!");
            System.out.println("Passengers: " + passengers);
            System.out.println("Total Amount: Rs." + total);
            System.out.println("Discount: Rs." + discount);
            System.out.println("Final Amount: Rs." + finalAmount);
        }
    }

    static void cancelTicket(int passengers) {
        if (passengers <= 0) {
            System.out.println("Invalid passenger count");
        } else if (passengers > bookedSeats) {
            System.out.println("Cancellation not possible");
        } else {
            bookedSeats -= passengers;
            System.out.println("Ticket cancelled successfully");
            System.out.println("Refund Amount: Rs." + (ticketPrice * passengers));
        }
    }

    public static void main(String[] args) {
        displayFlights();

        System.out.println("\n--- Booking Tickets ---");
        bookTicket(3);

        System.out.println("\n--- Flight Status ---");
        displayFlights();

        System.out.println("\n--- Cancelling Ticket ---");
        cancelTicket(1);

        System.out.println("\n--- Final Flight Status ---");
        displayFlights();
    }
}
