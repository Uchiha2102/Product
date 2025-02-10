package Product;

import java.util.ArrayList;
import java.util.List;


    public class OrderList {
         private final List<Order> orders = new ArrayList<>();


        public void addOrder(Order order) {
            orders.add(order);
        }

        public boolean removeOrder(int id) {
            for (Order order : orders) {
                if (order.id() == id) {
                    orders.remove(order);
                    return true;
                }
            }
            return false;
        }

        public Order getOrder(int id) {
            for (Order order : orders) {
                if (order.id() == id) {
                    return order;
                }
            }
            return null;
        }

        public List <Order> getAllOrders() {
            return new ArrayList<>(orders);
        }

        public static void main(String[] args) {

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

