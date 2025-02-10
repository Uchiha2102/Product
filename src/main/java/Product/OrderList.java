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




    }

