package dao;

import model.Sale;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SaleDAOImpl implements ISaleDAO{
    private static final Map<String, Sale> sales = new HashMap<>();

    @Override
    public Sale recordSale(Sale sale) {
        sales.put(sale.getSaleId(), sale);
        return sale;
    }

    @Override
    public Sale getSaleById(String saleId) {
        return sales.get(saleId);
    }

    @Override
    public Sale deleteSaleById(String saleId) {
        Sale saleToReturn = sales.get(saleId);
        sales.remove(saleId, sales.get(saleId));
        return saleToReturn;
    }

    /** κανει update ενα Sale με βαση ενα function που του περναμε.
     *  πχ setQuantity(3) αν θελουμε να αλλαξουμε το quantity του Sale.
     */
    @Override
    public Sale updateSaleById(String saleId, Consumer<Sale> updateFunction) {
        Sale sale = sales.get(saleId);
        updateFunction.accept(sale);
        return sale;
    }

    /**
     * επιστρεφει λιστα με ολα τα Sales που ικανοποιουν ενα predicate.
     * πχ ολα τα sales σε συγκεκριμενο πελατη, η ολα τα sales σε συγκεκριμενο
     * χρονικο διαστημα.
     */
    @Override
    public List<Sale> getSalesByFilter(Predicate<Sale> filter) {
        return sales.values().stream()
                .filter(filter)
                .collect(Collectors.toList());
    }

    /**
     * επιστρεφει αθροισμα των FinalSellingPrice για ολες τις
     * πωλησεις που ικανοποιουν ενα predicate.
     */
    @Override
    public double getRevenueByFilter(Predicate<Sale> filter) {
        return sales.values().stream()
                .filter(filter)
                .mapToDouble(Sale::getFinalSellingPrice)
                .sum();
    }
}
