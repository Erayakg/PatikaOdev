
public class TravelInsurance extends Insurance {
    @Override
    public double calculate() {
        return getPrice() * 1.4;
    }
}