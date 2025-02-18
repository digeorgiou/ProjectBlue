package model;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Purchase {
    private String purchaseId;
    private String materialId;
    private double quantity;
    private double totalCost;
    private LocalDate purchaseDate;
    private Provider provider;

    public Purchase() {
        this.purchaseId = UUID.randomUUID().toString();
    }

    public Purchase(String materialId, double quantity, double totalCost,
                    LocalDate purchaseDate, Provider provider) {
        this();
        this.materialId = materialId;
        this.quantity = quantity;
        this.totalCost = totalCost;
        this.purchaseDate = purchaseDate;
        this.provider = provider;
    }

    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Provider getProvider() {
        return new Provider(provider);
    }

    public void setProvider(Provider provider) {
        this.provider = new Provider(provider);
    }

    @Override
    public String toString() {
        return "Purchase ID: " + getPurchaseId() + ", Material ID: " + getMaterialId()
        + "\n Purchase Date: " + getPurchaseDate() + ", Quantity: " + getQuantity() +
                "Total Cost: " + getTotalCost() + ", Provider: " + getProvider().getProviderName();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if (!(obj instanceof Purchase that)) return false;
        return Objects.equals(getMaterialId(), that.getMaterialId())
                && Objects.equals(getPurchaseId(), that.getPurchaseId())
                && Objects.equals(getPurchaseDate(), that.getPurchaseDate())
                && Objects.equals(getQuantity(), that.getQuantity())
                && Objects.equals(getTotalCost(), that.getTotalCost())
                && Objects.equals(getProvider(), that.getProvider());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPurchaseId(),getMaterialId(),getPurchaseDate()
                ,getQuantity(), getTotalCost(), getProvider());
    }
}
