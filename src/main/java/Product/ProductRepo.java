package Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    private final List<Product> products = new ArrayList<>();

    // add Method
    public void addProduct(Product product) {
        products.add(product);
    }
            // Remove Method
    public boolean removeProduct(int id) {
        for (Product product : products) {
            if (product.id() == id) {
                products.remove(product);
                return true;
            }
        }
        return false;
    }
                    // get Method
    public Product getProduct(int id) {
        for (Product product : products) {
            if (product.id() == id) {
                return product;
            }
        }
        return null;
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(products);

    }

}
