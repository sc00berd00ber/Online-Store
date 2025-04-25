import java.util.List;
import java.util.Scanner;
public class DisplayProductScreen{
    private List<Product> productList;
    private DisplayCart cart;

    //Constractor
    public DisplayProductScreen(List<Product> productList,DisplayCart cart){
        this.productList = productList;
        this.cart = cart;
    }

    public void show(){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\n== Display Products ==");
        for (Product product : productList){
            System.out.println(product);
        }
        System.out.println("\nOptions:");
        System.out.println("1.Search Products");
        System.out.println("2.Add Products to the Cart");
        System.out.println("3.Go back to Home");

        System.out.print("Choose an option:");
        String input =scanner.nextLine();

        if(input.equals("1")) {
            searchProducts(scanner);
        } else if (input.equals("2")) {
            addProductToCart(scanner);
        } else if (input.equals("3")) {
            break;
        } else {
            System.out.println("Invalid option, try again");


        }
    }

    }
//search by name,price
    private void searchProducts(Scanner scanner){
        System.out.println("\nSearch by:");
        System.out.println("1. Product Name");
        System.out.println("2. Price");
        System.out.println("3. Department");
        System.out.println("Choose an Option:");
        String choice = scanner.nextLine();

        System.out.println("Enter search keyword: ");
        String keyword = scanner.nextLine().toLowerCase();

            for (Product product : productList) {
                if (choice.equals("1") && product.getProductName().toLowerCase().contains(keyword)) {
                    System.out.println(product);
                } else if (choice.equals("2") && String.valueOf(product.getPrice()).contains(keyword)) {
                    System.out.println(product);
                } else if (choice.equals("3") && product.getDepartment().toLowerCase().contains(keyword)) {
                    System.out.println(product);
                }
            }
        }

private void addProductToCart(Scanner scanner) {
    System.out.print("\nEnter the SKU of the product to add to cart: ");
    String sku = scanner.nextLine();

    for (Product product : productList) {
        if (product.getSku().equalsIgnoreCase(sku)) {
            cart.addProduct(product);
            System.out.println(product.getProductName() + " added to your cart.");
            return;
        }
    }
    System.out.println("Product with SKU " + sku + " not found.");
}
}




