public class AddressManager {
    // Adres ekleme işlemi
    public static void addAddress(User user, Address address) {
        user.addAddress(address);
    }

    // Adres çıkarma işlemi
    public static void removeAddress(User user, Address address) {
        user.removeAddress(address);
    }
}
