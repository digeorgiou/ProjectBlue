package model;

import java.util.Objects;

public class Material {
    private String materialId;
    private String name;
    private double quantityInStock;
    private double unitPricePerGram;

    public Material() {
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantity(double quantity) {
        this.quantityInStock = quantity;
    }

    public double getUnitPricePerGram() {
        return unitPricePerGram;
    }

    public void setUnitPricePerGram(double unitPricePerGram) {
        this.unitPricePerGram = unitPricePerGram;
    }

    @Override
    public String toString() {
        return "Material id: " + getMaterialId() +", Material Name: " + getName()
                + "\n Quantity in Stock: " + getQuantityInStock() + ", Price " +
                "per gram: " + getUnitPricePerGram() + " euros" ;
    }

    @Override
    public boolean equals(Object obj) {
            if(this == obj) return true;

            if (!(obj instanceof Material that)) return false;
            return Objects.equals(getMaterialId(), that.getMaterialId())
                    && Objects.equals(getName(), that.getName())
                    && Objects.equals(getQuantityInStock(), that.getQuantityInStock())
                    && Objects.equals(getUnitPricePerGram(), that.getUnitPricePerGram());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaterialId(),getName(),
                getQuantityInStock(),getUnitPricePerGram());
    }
}
