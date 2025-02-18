package model;

import java.util.Objects;

public class AbstractCustomer {
    private String customerId;
    private String phoneNumber;

    public AbstractCustomer(AbstractCustomer customer) {
        this.customerId = customer.getCustomerId();
        this.phoneNumber = customer.getPhoneNumber();
    }

    public AbstractCustomer() {
    }

    public AbstractCustomer(String customerId, String phoneNumber) {
        this.customerId = customerId;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer ID: " + getCustomerId() + ", Phone Number: " + getPhoneNumber();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if (!(obj instanceof AbstractCustomer that)) return false;
        return Objects.equals(getCustomerId(), that.getCustomerId())
                && Objects.equals(getPhoneNumber(), that.getPhoneNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCustomerId(),getPhoneNumber());
    }
}
