import model.CustomerRetail;
import model.CustomerWholeSale;
import model.Sale;

public class Main {

    public static void main(String[] args) {


        CustomerRetail maria = new CustomerRetail();
        CustomerWholeSale vaggelis = new CustomerWholeSale();

        maria.setPhoneNumber("15215151");
        maria.setCustomerId("1");
        maria.setFirstname("Maria");
        maria.setLastname("Georgiou");

        vaggelis.setPhoneNumber("21214124");
        vaggelis.setAddress("Paster 3");
        vaggelis.setName("Vag Bat");
        vaggelis.setDOY("Psyxikoy");
        vaggelis.setCustomerId("2");
        vaggelis.setVAT("15003922421");

        Sale firstsale = new Sale();
        Sale secondsale = new Sale();

        firstsale.setCustomer(maria);
        secondsale.setCustomer(vaggelis);

        System.out.println(firstsale);
        System.out.println(secondsale);


    }
}
