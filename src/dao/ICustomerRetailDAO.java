package dao;

import model.CustomerRetail;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public interface ICustomerRetailDAO {

    CustomerRetail addCustomerRetail(CustomerRetail customer);
    CustomerRetail getCustomerById(String customerId);
    CustomerRetail updateCustomer(String customerId,
                                     Consumer<CustomerRetail> updateFunction);
    CustomerRetail deleteCustomerById(String customerId);
    List<CustomerRetail> getAllCustomersWholeSale();
    String getCustomerPhoneNumber(String customerId);
    List<CustomerRetail> getCustomersByFilter(Predicate<CustomerRetail> filter);
}
