package pizza.product;

public class Product {

    //
    // --- fields ---
    //

    private final String productId;

    private final String name;

    private final Double price;

    //
    // --- constructors ---
    //

    public Product(String productId, String name, Double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

}
