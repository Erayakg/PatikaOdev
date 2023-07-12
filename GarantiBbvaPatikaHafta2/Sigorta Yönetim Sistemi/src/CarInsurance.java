
public class CarInsurance extends Insurance {
    @Override
    public double calculate() {
        return getPrice() * 1.5;
    }
}