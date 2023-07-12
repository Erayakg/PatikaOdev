public class BusinessAddress implements Address {
    private String addressDetail;

    // constructor, getter ve setter...

    @Override
    public String getAddressDetail() {
        return addressDetail;
    }

    @Override
    public String getAddressType() {
        return "Business Address";
    }
}