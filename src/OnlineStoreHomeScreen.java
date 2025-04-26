
   import java.util.Scanner;

    public class OnlineStoreHomeScreen {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while (running) {
                // Display the home screen
                System.out.println("\n===== ONLINE STORE =====");
                System.out.println("1. Display Products");
                System.out.println("2. Display Cart");
                System.out.println("3. Exit");
                System.out.print("\nEnter your choice (1-3): ");

                // Get user choice
                String choice = scanner.nextLine();

                // Process the choice
                switch (choice) {
                    case "1":
                        System.out.println("Display Products selected");
                        // This would call your product display functionality
                        break;
                    case "2":
                        System.out.println("Display Cart selected");
                        // This would call your cart display functionality
                        break;
                    case "3":
                        System.out.println("Thank you for shopping with us!");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }

            scanner.close();
        }
    }

