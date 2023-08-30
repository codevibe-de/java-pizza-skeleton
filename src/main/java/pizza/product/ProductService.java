package pizza.product;

import org.jetbrains.annotations.NotNull;

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

    /**
     * getProduct returns the {@link Product} instance for the given productId or throws a
     * {@link ProductNotFoundException} if it doesn't exist.
     * @throws ProductNotFoundException if there is no product for the provided id
     * @return a {@link Product} instance
     */
    @NotNull
    public Product getProduct(String productId) {
        return null; // fixme
    }

    /**
     * @param productQuantities a mapping of productIds to their respective order quantity
     * @return the order's total price
     */
    public double getTotalPrice(Map<String, Integer> productQuantities) {
        double result = 0.0;
        // TODO implement calculation
        return result;
    }

    /**
     * @param product the product to be added to persistence, which must contain an id already.
     */
    public void createProduct(Product product) {
        // todo
    }
}
