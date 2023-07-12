import java.util.Date;

public class HealthInsurance extends Insurance {

    @Override
    public double calculate() {
        return getPrice() * 1.2;
    }
}