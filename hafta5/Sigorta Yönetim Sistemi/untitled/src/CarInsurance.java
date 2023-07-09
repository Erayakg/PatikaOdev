import java.util.Date;

public class CarInsurance extends Insurance{
    public CarInsurance(String name, double price, Date startDate, Date endDate) {
        super(name, price, startDate, endDate);
    }

    @Override
    public double calculate() {
        // Otomobil sigortası ücretini hesaplama işlemi
        // Burada ilgili işlemler yapılacaktır.
        return 0.0;
    }
}
