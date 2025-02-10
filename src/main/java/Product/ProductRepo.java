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

    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepo();

        productRepo.addProduct(new Product(1, "AirPods", 125.00));
        productRepo.addProduct(new Product(2, "Headphones", 100.00));
        productRepo.addProduct(new Product(3, "Watch", 250.00));


        System.out.println(productRepo.removeProduct(2));
        Product product = productRepo.getProduct(3);
        System.out.println(product);


        List<Product> allProducts = productRepo.getAllProducts();
        System.out.println(allProducts);




    }

}
