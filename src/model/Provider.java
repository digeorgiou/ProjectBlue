package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Provider {
    String providerId;
    String providerName;
    ArrayList<Material> providerProducts;
    String VAT;
    String DOY;
    String address;
    String phoneNumber;

    public Provider() {
    }

    public Provider(String providerId, String providerName,
                    ArrayList<Material> providerProducts, String VAT, String DOY,
                    String address, String phoneNumber) {
        this.providerId = providerId;
        this.providerName = providerName;
        this.providerProducts = providerProducts;
        this.VAT = VAT;
        this.DOY = DOY;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Provider (Provider provider){
        this.providerId = provider.getProviderId();
        this.providerName = provider.getProviderName();
        this.providerProducts = provider.getProviderProducts();
        this.VAT = provider.getVAT();
        this.DOY = provider.getDOY();
        this.address = provider.getAddress();
        this.phoneNumber = provider.getPhoneNumber();
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public ArrayList<Material> getProviderProducts() {
        return new ArrayList<>(providerProducts);
    }

    public void setProviderProducts(ArrayList<Material> provProducts) {
        this.providerProducts = new ArrayList<>(provProducts);
    }

    public String getVAT() {
        return VAT;
    }

    public void setVAT(String VAT) {
        this.VAT = VAT;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDOY() {
        return DOY;
    }

    public void setDOY(String DOY) {
        this.DOY = DOY;
    }

    @Override
    public String toString() {
        return "Provider ID: " + getProviderId() + ", Provider Name: " + getProviderName()
                +", Phone Number: " + getPhoneNumber() + "\n"
                + ", VAT: " + getVAT() + ", DOY: " + getDOY() + ", Address: " + getAddress()
                +"\n" + getProviderProducts();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if (!(obj instanceof Provider that)) return false;
        return Objects.equals(getAddress(), that.getAddress())
                && Objects.equals(getProviderId(), that.getProviderId())
                && Objects.equals(getVAT(), that.getVAT())
                && Objects.equals(getProviderName(), that.getProviderName())
                && Objects.equals(getPhoneNumber(), that.getPhoneNumber())
                && Objects.equals(getProviderProducts(),
                that.getProviderProducts())
                && Objects.equals(getDOY(), that.getDOY());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAddress(),getDOY(),getProviderId(),
                getProviderName(),getProviderProducts(),getVAT(),
                getPhoneNumber());
    }
}
