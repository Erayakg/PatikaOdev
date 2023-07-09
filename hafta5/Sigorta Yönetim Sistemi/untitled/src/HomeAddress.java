public class HomeAddress implements Address{
    private String address;

    public HomeAddress(String address) {
        this.address = address;
    }

    public String getAddressInfo() {
        return "Home Address: " + address;
    }
}
