import java.util.Date;

public class TravelInsurance extends Insurance{
    public TravelInsurance(String name, double price, Date startDate, Date endDate) {
        super(name, price, startDate, endDate);
    }

    @Override
    public double calculate() {
        // Seyahat sigortası ücretini hesaplama işlemi
        // Burada ilgili işlemler yapılacaktır.
        return 0.0;
    }
}
