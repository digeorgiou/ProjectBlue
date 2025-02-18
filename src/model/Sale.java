package model;

import java.io.ObjectStreamException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class Sale {
    private String saleId;
    private String productId;
    private int quantity;
    private double startingPrice; // Original price of the product
    private double finalSellingPrice; // Price after discounts/negotiations
    private LocalDateTime dateTime;
    private boolean isWholesale; // true for wholesale, false for retail
    private PaymentMethod paymentMethod;
    private String customerId;

    // Constructors
    public Sale() {
        this.saleId = UUID.randomUUID().toString();
        this.dateTime = LocalDateTime.now();
    }

    public Sale(String productId, int quantity, double startingPrice,
                double finalSellingPrice, boolean isWholesale,
                PaymentMethod paymentMethod, String customerId) {
        this();
        this.productId = productId;
        this.quantity = quantity;
        this.startingPrice = startingPrice;
        this.finalSellingPrice = finalSellingPrice;
        this.isWholesale = isWholesale;
        this.paymentMethod = paymentMethod;
        this.customerId = customerId;
    }

    // Getters and setters
    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getStartingPrice() {
        return startingPrice;
    }

    public void setStartingPrice(double startingPrice) {
        this.startingPrice = startingPrice;
    }

    public double getFinalSellingPrice() {
        return finalSellingPrice;
    }

    public void setFinalSellingPrice(double finalSellingPrice) {
        this.finalSellingPrice = finalSellingPrice;
    }

    public boolean isWholesale() {
        return isWholesale;
    }

    public void setWholesale(boolean wholesale) {
        isWholesale = wholesale;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    // equals(), hashCode(), and toString()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Sale that)) return false;
        return Objects.equals(getSaleId(), that.getSaleId())
                && Objects.equals(getProductId(), that.getProductId())
                && Objects.equals(getQuantity(),that.getQuantity())
                && Objects.equals(getStartingPrice(),that.getStartingPrice())
                && Objects.equals(getFinalSellingPrice(),that.getFinalSellingPrice())
                && Objects.equals(getDateTime(), that.getDateTime())
                && Objects.equals(isWholesale(), that.isWholesale())
                && Objects.equals(getPaymentMethod(), that.getPaymentMethod())
                && Objects.equals(getCustomerId(), that.getCustomerId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(saleId, productId, quantity, startingPrice,
                finalSellingPrice, dateTime, isWholesale, paymentMethod,
                customerId);
    }

    @Override
    public String toString() {
        return "Sale{" +
                "saleId='" + saleId + '\'' +
                ", productId='" + productId + '\'' +
                ", quantity=" + quantity +
                ", startingPrice=" + startingPrice +
                ", finalSellingPrice=" + finalSellingPrice +
                ", saleDate=" + dateTime +
                ", isWholesale=" + isWholesale +
                ", Payment Method=" + paymentMethod +
                ", Customer ID=" + customerId+'}';
    }
}
