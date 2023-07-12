public class Main {
    public static void main(String[] args) {

        Address homeAddress = new HomeAddress();
        Address businessAddress = new BusinessAddress();

        // Create a user
        User user = new User();
        user.setFirstName("Eray");
        user.setLastName("Akgül");
        user.setEmail("erayakg@gmail.com");
        user.setPassword("123456");

        user.setAge(30);
        user.getAddresses().add(homeAddress);
        user.getAddresses().add(businessAddress);

        // Create an account
        Account account = new Individual();
        account.setUser(user);

        // Create an account manager and add the account
        AccountManager accountManager = new AccountManager();
        accountManager.addAccount(account);

        // Try to login
        try {
            Account loggedAccount = accountManager.login("erayakg@gmail.com", "123456");
            loggedAccount.showUserInfo();
        } catch (InvalidAuthenticationException e) {
            e.printStackTrace();
        }


    }
}