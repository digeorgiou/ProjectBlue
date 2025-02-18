package dao;

import model.Sale;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public interface ISaleDAO {

    void recordSale(Sale sale);
    Sale getSaleById(String saleId);
    void updateSaleById(String saleId, Consumer<Sale> updateFunction);
    Sale deleteSaleById(String saleId);
    List<Sale> getSalesByFilter(Predicate<Sale> filter);
    double getRevenueByFilter(Predicate<Sale> filter);
}
