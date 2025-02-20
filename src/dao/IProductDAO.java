package dao;

import model.Product;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public interface IProductDAO {

    Product createProduct(Product product);
    Product getProductById(String productId);
    Product updateProduct(String productId, Consumer<Product> updateFunction);
    Product deleteProductById(String productId);
    double getCostByProductId(String productId);
    String getProductMaterialById(String productId);
    List<Product> getAllProducts();
    List<Product> searchProductsByFilter(Predicate<Product> filter);
    double getTotalValueOfProductsByFilter(Predicate<Product> filter);
}
