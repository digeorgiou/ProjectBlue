package dao;

import model.CustomerRetail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomerRetailDAOImpl implements ICustomerRetailDAO{
    private static final Map<String, CustomerRetail> retailCustomers =
            new HashMap<>();

    @Override
    public CustomerRetail addCustomerRetail(CustomerRetail customer) {
        retailCustomers.put(customer.getCustomerId(),customer);
        return customer;
    }

    @Override
    public CustomerRetail getCustomerById(String customerId) {
        return retailCustomers.get(customerId);
    }

    @Override
    public CustomerRetail updateCustomer(String customerId, Consumer<CustomerRetail> updateFunction) {
        CustomerRetail customerRetail = retailCustomers.get(customerId);
        updateFunction.accept(customerRetail);
        return customerRetail;
    }

    @Override
    public CustomerRetail deleteCustomerById(String customerId) {
        CustomerRetail customerToReturn = retailCustomers.get(customerId);
        retailCustomers.remove(customerId);
        return customerToReturn;
    }

    @Override
    public List<CustomerRetail> getAllCustomersWholeSale() {
        return new ArrayList<>(retailCustomers.values());
    }

    @Override
    public String getCustomerPhoneNumber(String customerId) {
        return retailCustomers.get(customerId).getPhoneNumber();
    }

    @Override
    public List<CustomerRetail> getCustomersByFilter(Predicate<CustomerRetail> filter) {
        return retailCustomers.values().stream()
                .filter(filter)
                .collect(Collectors.toList());
    }
}
