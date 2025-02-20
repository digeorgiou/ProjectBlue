package dao;

import model.CustomerWholeSale;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public interface ICustomerWholeSaleDAO {

    CustomerWholeSale addCustomerWholeSale(CustomerWholeSale customer);
    CustomerWholeSale getCustomerById(String customerId);
    CustomerWholeSale updateCustomer(String customerId,
                            Consumer<CustomerWholeSale> updateFunction);
    CustomerWholeSale deleteCustomerById(String customerId);
    List<CustomerWholeSale> getAllCustomersWholeSale();
    String getCustomerPhoneNumber(String customerId);
    String getCustomerVat(String customerId);
    List<CustomerWholeSale> getCustomersByFilter(Predicate<CustomerWholeSale> filter);
}
