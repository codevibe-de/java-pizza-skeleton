package pizza.order;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pizza.customer.Customer;
import pizza.customer.CustomerService;
import pizza.product.Product;
import pizza.product.ProductService;

import java.util.Map;

class OrderServiceTest {

    ProductService productService;

    CustomerService customerService;

    OrderService orderService;

    @BeforeEach
    void setUp() {
        productService = new ProductService(null);
        customerService = new CustomerService();
        orderService = new OrderService(customerService, productService);
    }

    @Test
    void placeOrder() {
        // given
        productService.createProduct(new Product("P1", "Pizza Salami", 3.99d));
        customerService.createCustomer(new Customer(100L, "Bernd D. Brot", "0178 123-44567"));

        // when
        var order = orderService.placeOrder(
                "0178 123-44567",
                Map.of("P1", 2));

        // then
        Assertions.assertThat(order).isNotNull();
        Assertions.assertThat(order.getTotalPrice()).isCloseTo(7.98d, Offset.offset(0.1d));
    }
}