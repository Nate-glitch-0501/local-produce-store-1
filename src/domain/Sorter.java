import java.util.List;

public class Sorter {

    // Selection Sort by price
    public static void selectionSortByPrice(List<Product> products) {
        int n = products.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (products.get(j).getPrice() < products.get(minIndex).getPrice()) {
                    minIndex = j;
                }
            }
            // Swap
            Product temp = products.get(minIndex);
            products.set(minIndex, products.get(i));
            products.set(i, temp);
        }
    }

    // Insertion Sort by price
    public static void insertionSortByPrice(List<Product> products) {
        int n = products.size();
        for (int i = 1; i < n; i++) {
            Product key = products.get(i);
            int j = i - 1;
            while (j >= 0 && products.get(j).getPrice() > key.getPrice()) {
                products.set(j + 1, products.get(j));
                j--;
            }
            products.set(j + 1, key);
        }
    }

    // Linear Search by name
    public static int linearSearchByName(List<Product> products, String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1; // Not found
    }

    // Binary Search by price (requires sorted list)
    public static int binarySearchByPrice(List<Product> products, double price) {
        int left = 0, right = products.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products.get(mid).getPrice() == price) {
                return mid;
            } else if (products.get(mid).getPrice() < price) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Not found
    }
}