package dao;

import model.Provider;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public interface IProviderDAO {

    Provider addProvider(Provider provider);
    Provider getProviderById(String providerId);
    Provider updateProvider(String providerId,
                            Consumer<Provider> updateFunction);
    Provider deleteProviderById(String providerId);
    List<Provider> getAllProviders();
    String getProviderPhoneNumber(String providerId);
    String getProviderVat(String providerId);
    List<Provider> getProvidersByFilter(Predicate<Provider> filter);
}
