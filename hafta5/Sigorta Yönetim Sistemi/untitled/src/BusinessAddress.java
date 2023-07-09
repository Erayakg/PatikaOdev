public class BusinessAddress implements Address{
    private String address;

    public BusinessAddress(String address) {
        this.address = address;
    }

    public String getAddressInfo() {
        return "Business Address: " + address;
    }
}
