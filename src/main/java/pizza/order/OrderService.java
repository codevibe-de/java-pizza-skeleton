package pizza.order;

import pizza.customer.CustomerService;
import pizza.product.ProductService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class OrderService {

    //
    // fields
    //

    private final ArrayList<Order> orders;

    //
    // injected beans
    //

    private final CustomerService customerService;

    private final ProductService productService;

    //
    // constructors and setup
    //

    public OrderService(CustomerService customerService, ProductService productService) {
        this.customerService = customerService;
        this.productService = productService;
        this.orders = new ArrayList<>();
    }

    //
    // business logic
    //

    public Order placeOrder(String phoneNumber, Map<String, Integer> productQuantities) {
        // get customer by phoneNumber
        // todo

        // calculate total price via productService
        // todo

        // create order
        // todo

        // persist and return it
        // todo
        return null;
    }

    public Iterable<Order> getOrders() {
        return Collections.unmodifiableList(this.orders);
    }
}
