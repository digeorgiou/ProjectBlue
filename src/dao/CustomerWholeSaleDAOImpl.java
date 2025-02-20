package dao;

import model.CustomerWholeSale;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomerWholeSaleDAOImpl implements ICustomerWholeSaleDAO{
    private static final Map<String, CustomerWholeSale> wholeSaleCustomers =
            new HashMap<>();

    @Override
    public CustomerWholeSale addCustomerWholeSale(CustomerWholeSale customer) {
        wholeSaleCustomers.put(customer.getCustomerId(), customer);
        return customer;
    }

    @Override
    public CustomerWholeSale getCustomerById(String customerId) {
        return wholeSaleCustomers.get(customerId);
    }

    @Override
    public CustomerWholeSale updateCustomer(String customerId, Consumer<CustomerWholeSale> updateFunction) {
        CustomerWholeSale customerWholeSale =
                wholeSaleCustomers.get(customerId);
        updateFunction.accept(customerWholeSale);
        return customerWholeSale;
    }

    @Override
    public CustomerWholeSale deleteCustomerById(String customerId) {
        CustomerWholeSale customerToReturn = wholeSaleCustomers.get(customerId);
        wholeSaleCustomers.remove(customerId);
        return customerToReturn;
    }

    @Override
    public List<CustomerWholeSale> getAllCustomersWholeSale() {
        return new ArrayList<>(wholeSaleCustomers.values());
    }

    @Override
    public String getCustomerPhoneNumber(String customerId) {
        return wholeSaleCustomers.get(customerId).getPhoneNumber();
    }

    @Override
    public String getCustomerVat(String customerId) {
        return wholeSaleCustomers.get(customerId).getVAT();
    }

    @Override
    public List<CustomerWholeSale> getCustomersByFilter(Predicate<CustomerWholeSale> filter) {
        return wholeSaleCustomers.values().stream()
                .filter(filter)
                .collect(Collectors.toList());
    }

}
