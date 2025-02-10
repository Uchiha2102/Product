package Product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    @Test
    void testRemoveExistingProduct() {

        ProductRepo productRec = new ProductRepo();
        Product product1 = new Product(1, "Product 1", 100.0);
        Product product2 = new Product(2, "Product 2", 200.0);
        productRec.addProduct(product1);
        productRec.addProduct(product2);

        boolean result = productRec.removeProduct(1);

        assertTrue(result);
        assertEquals(1, productRec.getAllProducts().size());
        assertNull(productRec.getProduct(1));
    }

    @Test
    void testRemoveNonExistingProduct() {

        ProductRepo productRec = new ProductRepo();
        Product product1 = new Product(1, "Product 1", 100.0);
        productRec.addProduct(product1);

        boolean result = productRec.removeProduct(2);

        assertFalse(result);
        assertEquals(1, productRec.getAllProducts().size());
        assertNotNull(productRec.getProduct(1));
    }

    @Test
    void testRemoveFromEmptyList() {

        ProductRepo productRec = new ProductRepo();

        boolean result = productRec.removeProduct(1);

        assertFalse(result);
        assertTrue(productRec.getAllProducts().isEmpty());
    }

    @Test
    void testRemoveProductWithDuplicateIds() {

        ProductRepo productRec = new ProductRepo();
        Product product1 = new Product(1, "Product 1", 100.0);
        Product product2 = new Product(1, "Product 2", 200.0);
        productRec.addProduct(product1);
        productRec.addProduct(product2);

        boolean result = productRec.removeProduct(1);

        assertTrue(result);
        assertEquals(1, productRec.getAllProducts().size());
    }
}