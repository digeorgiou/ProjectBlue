package dao;

import model.Product;

import java.util.List;
import java.util.function.Predicate;

public interface IProductDAO {

    void createProduct(Product product);
    Product getProductById(String productId);
    Product deleteProductById(String productId);
    String getProductMaterialById(String productId);
    List<Product> getAllProducts();
    List<Product> searchProductsByFilter(Predicate<Product> filter);
    double getTotalValueOfProductsByFilter(Predicate<Product> filter);
}
