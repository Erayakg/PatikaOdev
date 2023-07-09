public class Main {
    public static void main(String[] args) {
        // Kullanıcı nesnesi oluşturma
        User user = new User("Eray", "Akgül", "ery@.com", "1111", "mühendis", 30);

        // Adresler oluşturma
        Address homeAddress = new HomeAddress("malatya");
        Address businessAddress = new BusinessAddress("ankara");

        // Adresleri ekleme
        AddressManager.addAddress(user, homeAddress);
        AddressManager.addAddress(user, businessAddress);

        // Account nesneleri oluşturma
        Account individualAccount = new Individual(user);
        Account enterpriseAccount = new Enterprise(user);

        // AccountManager oluşturma
        AccountManager accountManager = new AccountManager();
        accountManager.addAccount(individualAccount);
        accountManager.addAccount(enterpriseAccount);

        // Klavyeden email ve şifre bilgisini alma
        String email = "ery@.com";
        String password = "1111";

        // Login işlemi
        Account loggedInAccount = accountManager.login(email, password);

        if (loggedInAccount != null) {
            loggedInAccount.showUserInfo();
        } else {
            System.out.println("Invalid email or password!geçersiz email yada paswqor");
        }
    }}
