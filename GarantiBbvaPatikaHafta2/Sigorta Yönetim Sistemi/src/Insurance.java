import java.util.Date;

public abstract class Insurance {
    private String insuranceName;
    private double price;
    private Date startDate;
    private Date endDate;

    public abstract double calculate();

    public Insurance(String insuranceName, double price, Date startDate, Date endDate) {
        this.insuranceName = insuranceName;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Insurance() {
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
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
}
