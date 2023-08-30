package pizza.product;

import java.util.Map;

public class ProductService {

    private final ProductRepository productRepository;

    //
    // constructors and setup
    //

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //
    // business logic
    //

    public Product getProduct(String productId) {
        return null; // fixme
    }

    public Double getTotalPrice(Map<String, Integer> productQuantities) {
        double result = 0.0;
        // TODO implement calculation
        return result;
    }

    public Product createProduct(Product product) {
        // todo
        return null;
    }
}
