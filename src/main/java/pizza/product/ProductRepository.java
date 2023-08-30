package pizza.product;

import java.util.Collection;
import java.util.Optional;

/**
 * ProductRepository offers persistence access methods to services.
 */
public interface ProductRepository {

    Product save(Product product);

    boolean existsById(String productId);

    Collection<Product> findAll();

    Optional<Product> findById(String productId);
}
