package dao;

import model.Purchase;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public interface IPurchaseDAO {

    Purchase recordPurchase(Purchase purchase);
    Purchase getPurchaseById(String purchaseId);
    Purchase updatePurchaseById(String purchaseId,
                            Consumer<Purchase> updateFunction);
    Purchase deletePurchaseById(String purchaseId);
    List<Purchase> getPurchasesByFilter(Predicate<Purchase> filter);
    double getRevenueByFilter(Predicate<Purchase> filter);
}
