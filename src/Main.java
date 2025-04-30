import java.util.ArrayList;
import java.util.List;

public class Main {

    
    public static void main(String[] args) {
        // Create an inventory and shopping cart
        Inventory inventory = new Inventory();
        ShoppingCart cart = new ShoppingCart();

        // Add products to the inventory
        try {
            inventory.addProduct(new Product("1", "Apple", 0.5, 10));
            inventory.addProduct(new Product("2", "Banana", 0.3, 20));
            inventory.addProduct(new Product("3", "Cherry", 0.2, 15));

            // Display products in the inventory
            System.out.println("Products in Inventory:");
            displayProducts(inventory.getProducts());

            // Add products to the shopping cart
            cart.addProduct(inventory.getProductById(1));
            cart.addProduct(inventory.getProductById(2));

            // Display products in the shopping cart
            System.out.println("\nProducts in Shopping Cart:");
            displayProducts(cart.getProducts());

            // Calculate total price
            System.out.println("\nTotal Price: $" + cart.calculateTotal());

            // Measure performance for sorting algorithms
            measurePerformance();

        } catch (NegativePriceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Helper method to display products
    private static void displayProducts(List<Product> products) {
        for (Product product : products) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }

    // Measure performance for sorting algorithms
    private static void measurePerformance() {
        List<Product> largeList = new ArrayList<>();
        try {
            for (int i = 1000; i > 0; i--) {
                largeList.add(new Product(String.valueOf(i), "Product" + i, i * 0.1, i));
            }

            // Measure Selection Sort
            long startTime = System.nanoTime();
            Sorter.selectionSortByPrice(largeList);
            long endTime = System.nanoTime();
            System.out.println("\nSelection Sort Time (1000 items): " + (endTime - startTime) / 1_000_000 + " ms");

            // Reset list for Insertion Sort
            largeList.clear();
            for (int i = 1000; i > 0; i--) {
                largeList.add(new Product(String.valueOf(i), "Product" + i, i * 0.1, i));
            }

            // Measure Insertion Sort
            startTime = System.nanoTime();
            Sorter.insertionSortByPrice(largeList);
            endTime = System.nanoTime();
            System.out.println("Insertion Sort Time (1000 items): " + (endTime - startTime) / 1_000_000 + " ms");

        } catch (NegativePriceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}