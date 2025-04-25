import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DisplayCart {
    private static Map<Product, Integer> cartItems = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    // Add product to cart
    public static void addProduct(Product product) {
        cartItems.put(product, cartItems.getOrDefault(product, 0) + 1);
    }
    // Show cart screen
    public void showCart() {
        while (true) {
            System.out.println("\n======= Your Cart =======");

            if (cartItems.isEmpty()) {
                System.out.println("Cart is empty.");
            } else {
                int index = 1;
                double total = 0.0;

                for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
                    Product product = entry.getKey();
                    int quantity = entry.getValue();
                    double subtotal = product.getPrice() * quantity;
                    total += subtotal;

                    System.out.println(index + ") " + product.getProductName() +
                            " | Qty: " + quantity +
                            " | Price: $" + product.getPrice() +
                            " | Subtotal: $" + String.format("%.2f", subtotal));
                    index++;
                }

                System.out.println("Total: $" + String.format("%.2f", total));
            }

            // Cart menu
            System.out.println("\nOptions:");
            System.out.println("1. Check Out");
            System.out.println("2. Remove Item");
            System.out.println("3. Back to Home");
            System.out.print("Choose an option: ");
            String input = scanner.nextLine();

            if (input.equals("1")) {
                System.out.println("Checkout feature coming soon...");
            } else if (input.equals("2")) {
                removeProduct();
            } else if (input.equals("3")) {
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
    }

    // Remove product from cart by SKU
    private void removeProduct() {
        System.out.print("Enter SKU of product to remove: ");
        String sku = scanner.nextLine();

        boolean found = false;
        for (Product product : cartItems.keySet()) {
            if (product.getSku().equalsIgnoreCase(sku)) {
                cartItems.remove(product);
                System.out.println(product.getProductName() + " removed from your cart.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product with SKU " + sku + " not found in cart.");
        }
    }
}