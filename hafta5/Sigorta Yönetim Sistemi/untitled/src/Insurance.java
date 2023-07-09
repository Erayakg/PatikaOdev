import java.util.Date;

public class Insurance {
    private String name;
    private double price;
    private Date startDate;
    private Date endDate;

    public Insurance(String name, double price, Date startDate, Date endDate) {
        this.name = name;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double calculate() {
        return 0;
    }

    // Getter ve setter metotları
}

// Sağlık sigortası sınıfı
class HealthInsurance extends Insurance {
    public HealthInsurance(String name, double price, Date startDate, Date endDate) {
        super(name, price, startDate, endDate);
    }

    @Override
    public double calculate() {
        // Sağlık sigortası ücretini hesaplama işlemi
        // Burada ilgili işlemler yapılacaktır.
        return 0.0;
    }
}
