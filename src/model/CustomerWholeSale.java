package model;

import java.util.Objects;

public class CustomerWholeSale extends AbstractCustomer {
    String VAT;
    String name;
    String address;
    String DOY;

    public CustomerWholeSale() {
    }

    public CustomerWholeSale(String customerId, String phoneNumber, String VAT, String name, String address, String DOY) {
        super(customerId, phoneNumber);
        this.VAT = VAT;
        this.name = name;
        this.address = address;
        this.DOY = DOY;
    }

    public CustomerWholeSale(CustomerWholeSale customer) {
        this.setCustomerId(customer.getCustomerId());
        this.setPhoneNumber(customer.getPhoneNumber());
        this.VAT = customer.getVAT();
        this.name = customer.getName();
        this.address = customer.getAddress();
        this.DOY = customer.getDOY();
    }

    public String getVAT() {
        return VAT;
    }

    public void setVAT(String VAT) {
        this.VAT = VAT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOY() {
        return DOY;
    }

    public void setDOY(String DOY) {
        this.DOY = DOY;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerWholeSale(AbstractCustomer customer) {
        super(customer);
    }

    @Override
    public String toString() {
        return super.toString() + "Customer Name: " + getName() + "\n" +
                "Address: " + getAddress()
                + ", DOY: " + getDOY() + ", VAT: " + getVAT();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if (!(obj instanceof CustomerWholeSale that)) return false;
        return Objects.equals(getCustomerId(), that.getCustomerId())
                && Objects.equals(getPhoneNumber(), that.getPhoneNumber())
                && Objects.equals(getName(), that.getName())
                && Objects.equals(getDOY(),that.getDOY())
                && Objects.equals(getAddress(),that.getAddress())
                && Objects.equals(getVAT(),that.getVAT());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCustomerId(),getPhoneNumber(),
                getAddress(),getDOY(),getVAT(),getName());
    }
}
