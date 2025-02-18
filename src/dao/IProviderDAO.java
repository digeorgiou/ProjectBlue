package dao;

import model.Provider;

import java.util.List;
import java.util.function.Predicate;

public interface IProviderDAO {

    void addProvider(Provider provider);
    Provider getProviderById(String providerId);
    Provider deleteProviderById(String providerId);
    String getProviderPhoneNumber(String providerId);
    String getProviderVat(String providerId);
    List<Provider> getProvidersByFilter(Predicate<Provider> filter);
}
