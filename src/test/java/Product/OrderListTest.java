package Product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderListTest {

    @Test
    void testGetOrderWithExistingId() {
        OrderList orderList = new OrderList();
        Order order1 = new Order(1, "Bezi", 250.0);
        Order order2 = new Order(2, "Bezii", 300.0);
        orderList.addOrder(order1);
        orderList.addOrder(order2);

        Order retrievedOrder = orderList.getOrder(1);

        assertNotNull(retrievedOrder);
        assertEquals(1, retrievedOrder.id());
        assertEquals("Bezi", retrievedOrder.customerName());
        assertEquals(250.0, retrievedOrder.totalAmount(), 0.01);
    }

    @Test
    void testGetOrderWithNonExistentId() {

        OrderList orderList = new OrderList();
        Order order1 = new Order(1, "Bezi", 250.0);
        Order order2 = new Order(2, "Bezii", 300.0);
        orderList.addOrder(order1);
        orderList.addOrder(order2);

        Order retrievedOrder = orderList.getOrder(3);

        assertNull(retrievedOrder);
    }

    @Test
    void testGetOrderWhenListIsEmpty() {

        OrderList orderList = new OrderList();

        Order retrievedOrder = orderList.getOrder(1);

        assertNull(retrievedOrder);
    }

    @Test
    void testRemoveOrderWithExistingId() {
        OrderList orderList = new OrderList();
        Order order1 = new Order(1, "Bezi", 250.0);
        Order order2 = new Order(2, "Bezii", 300.0);
        orderList.addOrder(order1);
        orderList.addOrder(order2);

        boolean isRemoved = orderList.removeOrder(1);

        assertTrue(isRemoved);
        assertNull(orderList.getOrder(1));
        assertEquals(1, orderList.getAllOrders().size());
    }

    @Test
    void testRemoveOrderWithNonExistentId() {
        OrderList orderList = new OrderList();
        Order order1 = new Order(1, "Bezi", 250.0);
        Order order2 = new Order(2, "Bezii", 300.0);
        orderList.addOrder(order1);
        orderList.addOrder(order2);

        boolean isRemoved = orderList.removeOrder(3);

        assertFalse(isRemoved);
        assertEquals(2, orderList.getAllOrders().size());
    }

    @Test
    void testRemoveOrderWhenListIsEmpty() {
        OrderList orderList = new OrderList();

        boolean isRemoved = orderList.removeOrder(1);

        assertFalse(isRemoved);
        assertEquals(0, orderList.getAllOrders().size());
    }
}