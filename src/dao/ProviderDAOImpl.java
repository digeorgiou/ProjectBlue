package dao;

import model.Provider;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProviderDAOImpl implements IProviderDAO{
    private final static Map<String, Provider> providers = new HashMap<>();

    @Override
    public void addProvider(Provider provider) {
        providers.put(provider.getProviderId(), provider);
    }

    @Override
    public Provider getProviderById(String providerId) {
        return providers.get(providerId);
    }


    @Override
    public Provider deleteProviderById(String providerId) {
        Provider providerToReturn = providers.get(providerId);
        providers.remove(providerId);
        return providerToReturn;
    }

    @Override
    public String getProviderPhoneNumber(String providerId) {
        return providers.get(providerId).getPhoneNumber();
    }

    @Override
    public String getProviderVat(String providerId) {
        return providers.get(providerId).getVAT();
    }


    /**
     * επιστρεφει λιστα προμηθευτων με βαση καποιο φιλτρο.
     * πχ ολοι οι προμηθευτες για ασημι
     */
    @Override
    public List<Provider> getProvidersByFilter(Predicate<Provider> filter) {
        return providers.values().stream()
                .filter(filter)
                .collect(Collectors.toList());
    }

}
