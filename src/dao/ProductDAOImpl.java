package dao;

import model.Product;
import model.Sale;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductDAOImpl implements IProductDAO{
    private static final Map<String, Product> products = new HashMap<>();

    @Override
    public void createProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    @Override
    public Product getProductById(String productId) {
        return products.get(productId);
    }

    @Override
    public Product deleteProductById(String productId) {
        Product productToReturn = products.get(productId);
        products.remove(productId);
        return productToReturn;
    }

    @Override
    public String getProductMaterialById(String productId) {
        return products.get(productId).getMaterial().getName();
    }

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(products.values());
    }

    /**
     * επιστρεφει λιστα με ολα τα προιοντα που ικανοποιουν ενα predicate
     * πχ ολα τα προιοντα απο ασημι.
     */
    @Override
    public List<Product> searchProductsByFilter(Predicate<Product> filter) {
        return products.values().stream()
                .filter(filter)
                .collect(Collectors.toList());
    }

    /**
     * επιστρεφει συνολικο κοστος ολων των προιοντων που ικανοποιουν ενα φιλτρο.
     * πχ οσα ειναι inStock.
     */
    @Override
    public double getTotalValueOfProductsByFilter(Predicate<Product> filter) {
        return products.values().stream()
                .filter(filter)
                .mapToDouble(Product::getPrice)
                .sum();
    }

}
