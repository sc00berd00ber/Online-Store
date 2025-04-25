import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public class ProductLoader {
        public static void main(String[] args) {
            String csvFile = "products.csv";
            String line;
            String csvSplitBy = "\\|";

            ArrayList<Product> products = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
                br.readLine(); // Skip header

                while ((line = br.readLine()) != null) {
                    String[] data = line.split(csvSplitBy);
                    String sku = data[0];
                    String productName = data[1];
                    double price = Double.parseDouble(data[2]);
                    String department = data[3];

                    Product product = new Product(sku, productName, price, department);
                    products.add(product);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Print loaded products
            for (Product p : products) {
                System.out.println(p);
            }
        }
    }

}
