import java.util.Date;

public class ResidenceInsurance extends Insurance {

    @Override
    public double calculate() {
        return getPrice() * 1.3;
    }
}