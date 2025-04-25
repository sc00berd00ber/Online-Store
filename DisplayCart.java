import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisplayCart {
    private List<Product> productsList;
    Scanner sacn = new Scanner(System.in);
    ArrayList<String> addProduct = new ArrayList<>();

    public DisplayCart(List<Product> productsList) {
        this.productsList = productsList;
    }

    public static void main(String[] args) {
        Scanner sacn = new Scanner(System.in);
        ArrayList<String> addProduct = new ArrayList<>();

        while (true) {
            System.out.println("\t\t-------CART-------");
            System.out.println(addProduct);

            System.out.println("1)\tCheck Out");
            System.out.println("2)\tRemove");
            System.out.println("3)\tBack");
            System.out.println("4)\tExit");

            System.out.print("Choose A Number (1-4): ");
            String input = sacn.nextLine();

            if (input.equals("1")) {
                System.out.println("Checkout not yet implemented.");
            } else if (input.equals("2")) {
                System.out.println("Remove item - not yet implemented.");
            } else if (input.equals("3")) {
                System.out.println("Back to Home - not yet implemented.");
            } else if (input.equals("4")) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid Input. Try Again:");
            }
        }
    }
}
