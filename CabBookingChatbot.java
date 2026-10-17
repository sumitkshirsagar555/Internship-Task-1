
import java.util.Random;
import java.util.Scanner;

public class CabBookingChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        while (true) {

            System.out.println("\n========== CAB BOOKING CHATBOT ==========");
            System.out.println("1. Book Ride");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            String input = sc.nextLine().trim();

            if (input.equals("2")) {
                System.out.println("Thank you for using Cab Booking Chatbot!");
                System.out.println("Goodbye!");
                break;
            }

            if (!input.equals("1")) {
                System.out.println("Invalid choice! Please select 1 or 2.");
                continue;
            }

          
            System.out.println("\n---------- Choose Cab Type ----------");
            System.out.println("1. Auto     - Rs. 12/km");
            System.out.println("2. Sedan    - Rs. 18/km");
            System.out.println("3. SUV      - Rs. 25/km");
            System.out.print("Select cab type: ");

            input = sc.nextLine().trim();

            String cabType;
            int rate;

            switch (input) {
                case "1":
                    cabType = "Auto";
                    rate = 12;
                    break;

                case "2":
                    cabType = "Sedan";
                    rate = 18;
                    break;

                case "3":
                    cabType = "SUV";
                    rate = 25;
                    break;

                default:
                    System.out.println("Invalid cab choice! Returning to main menu.");
                    continue;
            }

            System.out.println("\n---------- Choose Route ----------");
            System.out.println("1. Pune Station -> Shivajinagar (5 km)");
            System.out.println("2. Swargate -> Kothrud (8 km)");
            System.out.println("3. Hinjawadi -> Wakad (10 km)");
            System.out.print("Select route: ");

            input = sc.nextLine().trim();

            String source;
            String destination;
            int distance;

            switch (input) {
                case "1":
                    source = "Pune Station";
                    destination = "Shivajinagar";
                    distance = 5;
                    break;

                case "2":
                    source = "Swargate";
                    destination = "Kothrud";
                    distance = 8;
                    break;

                case "3":
                    source = "Hinjawadi";
                    destination = "Wakad";
                    distance = 10;
                    break;

                default:
                    System.out.println("Invalid route choice! Returning to main menu.");
                    continue;
            }

            int fare = rate * distance;

            System.out.println("\n========== BOOKING DETAILS ==========");
            System.out.println("Cab Type     : " + cabType);
            System.out.println("Source       : " + source);
            System.out.println("Destination  : " + destination);
            System.out.println("Distance     : " + distance + " km");
            System.out.println("Rate         : Rs. " + rate + "/km");
            System.out.println("Total Fare   : Rs. " + fare);

            // Step 4: Confirm or Cancel Before OTP
            System.out.println("\n---------- Confirm Booking ----------");
            System.out.println("1. Confirm & Share OTP");
            System.out.println("2. Cancel Ride");
            System.out.print("Enter your choice: ");

            input = sc.nextLine().trim();

            if (input.equals("2")) {
                System.out.println("Ride cancelled successfully.");
                System.out.println("No OTP has been shared.");
                continue;
            }

            if (!input.equals("1")) {
                System.out.println("Invalid choice! Booking cancelled.");
                System.out.println("No OTP has been shared.");
                continue;
            }

            // Step 5: Generate and Share 4-Digit OTP
            int otp = random.nextInt(9000) + 1000;

            System.out.println("\n========== BOOKING CONFIRMED ==========");
            System.out.println("Your OTP is: " + otp);
            System.out.println("Please keep your OTP safe.");
            System.out.println("IMPORTANT: Once OTP is shared,");
            System.out.println("the ride cannot be cancelled.");
            System.out.println("Your cab booking is confirmed!");

        }

        sc.close();
    }
}
