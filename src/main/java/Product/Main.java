package Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
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

        OrderList orderListRepo = new OrderList();


        orderListRepo.addOrder(new Order(1, "Lukas", 500.0));
        orderListRepo.addOrder(new Order(2, "Felix", 300.0));
        orderListRepo.addOrder(new Order(3, "Thomas", 150.0));


        System.out.println(orderListRepo.removeOrder(2));


        Order order = orderListRepo.getOrder(3);
        System.out.println(order);


        List<Order> allOrders = orderListRepo.getAllOrders();
        System.out.println(allOrders);

    }



}