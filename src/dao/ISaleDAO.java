package dao;

import model.Sale;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface ISaleDAO {

    void recordSale(Sale sale);
    Sale getSaleById(String saleId);
    void deleteSaleById(String saleId);
    List<Sale> getSalesByTimePeriod(LocalDate startDate, LocalDate endDate);
    double getRevenueByTimePeriod(LocalDate startDate, LocalDate endDate);
    double getProfitByTimePeriod(LocalDate startDate, LocalDate endDate);


}
