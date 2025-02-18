package model;

import java.util.Objects;

public class CustomerRetail extends AbstractCustomer{
    String firstname;
    String lastname;

    public CustomerRetail() {
    }

    public CustomerRetail(String customerId, String phoneNumber, String firstname, String lastname) {
        super(customerId, phoneNumber);
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public CustomerRetail(CustomerRetail customer) {
        this.setCustomerId(customer.getCustomerId());
        this.setPhoneNumber(customer.getPhoneNumber());
        this.firstname = customer.getFirstname();
        this.lastname = customer.getLastname();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Customer Name: " + getFirstname() + " " + getLastname();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if (!(obj instanceof CustomerRetail that)) return false;
        return Objects.equals(getCustomerId(), that.getCustomerId())
                && Objects.equals(getPhoneNumber(), that.getPhoneNumber())
                && Objects.equals(getFirstname(), that.getFirstname())
                && Objects.equals(getLastname(),that.getLastname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCustomerId(),getPhoneNumber(),
                getFirstname(),getLastname());
    }
}
