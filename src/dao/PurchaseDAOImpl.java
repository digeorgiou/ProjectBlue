package dao;

import model.Purchase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PurchaseDAOImpl implements IPurchaseDAO{
    private static final Map<String, Purchase> purchases = new HashMap<>();

    @Override
    public Purchase recordPurchase(Purchase purchase) {
        purchases.put(purchase.getPurchaseId(), purchase);
        return purchase;
    }

    @Override
    public Purchase getPurchaseById(String purchaseId) {
        return purchases.get(purchaseId);
    }

    @Override
    public Purchase updatePurchaseById(String purchaseId,
                                Consumer<Purchase> updateFunction) {
        Purchase purchase = purchases.get(purchaseId);
        updateFunction.accept(purchase);
        return purchase;
    }

    @Override
    public Purchase deletePurchaseById(String purchaseId) {
        Purchase purchaseToReturn = purchases.get(purchaseId);
        purchases.remove(purchaseId);
        return purchaseToReturn;
    }

    /**
     * επιστρεφει λιστα με ολες τις αγορες που ικανοποιουν ενα predicate,
     * πχ αγορες σε ενα συγκεκριμενο διαστημα, η απο εναν provider
     */
    @Override
    public List<Purchase> getPurchasesByFilter(Predicate<Purchase> filter) {
        return purchases.values().stream()
                .filter(filter)
                .collect(Collectors.toList());
    }

    /**
     *επιστρεφει το συνολικο κοστος για τις αγορες που ικανοποιουν
     * μια συγκεκριμενη συνθηκη
     */
    @Override
    public double getRevenueByFilter(Predicate<Purchase> filter) {
        return purchases.values().stream()
                .filter(filter)
                .mapToDouble(Purchase::getTotalCost)
                .sum();
    }
}
