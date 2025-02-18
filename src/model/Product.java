package model;

import java.util.Objects;

public class Product {
    private String productId;
    private String name;
    private Material material;
    private double weight;
    private ProductCategory category;
    private double price;
    private int stockQuantity;
    private double minutesToMake;

    public Product() {
    }

    public Product(String productId, String name, double weight,
                   Material material, ProductCategory category,
                   double price, int stockQuantity, double minutesToMake) {
        this.productId = productId;
        this.name = name;
        this.weight = weight;
        this.category = category;
        this.material = material;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.minutesToMake = minutesToMake;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public double getMinutesToMake() {
        return minutesToMake;
    }

    public void setMinutesToMake(double minutesToMake) {
        this.minutesToMake = minutesToMake;
    }

    public Material getMaterial() {
        return new Material(this.getMaterial());
    }

    public void setMaterial(Material material) {
        this.material = new Material(material);
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product ID: " + getProductId() + ", Name: " + getName() +
                ", Weight: " + getWeight() + ", Price: " + getPrice() +
                ", Stock: " + getStockQuantity() +
                "\n Material: " + getMaterial() + ", Category: " + getCategory() +
                "Time to make: " + getMinutesToMake() + "minutes";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if (!(obj instanceof Product that)) return false;
        return Objects.equals(getProductId(), that.getProductId())
                && Objects.equals(getName(), that.getName())
                && Objects.equals(getPrice(), that.getPrice())
                && Objects.equals(getWeight(), that.getWeight())
                && Objects.equals(getStockQuantity(), that.getStockQuantity())
                && Objects.equals(getMinutesToMake(), that.getMinutesToMake())
                && Objects.equals(getCategory(),that.getCategory())
                && Objects.equals(getMaterial(),that.getMaterial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),getProductId(),getPrice(),getWeight(),
                getStockQuantity(),getMinutesToMake(),getCategory(),getMaterial());
    }
}
