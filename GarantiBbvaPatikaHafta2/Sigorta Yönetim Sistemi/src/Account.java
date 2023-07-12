import java.util.ArrayList;

public abstract class Account implements Comparable<Account> {
    public enum AuthenticationStatus { SUCCESS, FAIL }

    private AuthenticationStatus authenticationStatus;
    private User user;
    private ArrayList<Insurance> insurances;
    public abstract void addInsurance(Insurance insurance);

    public final void showUserInfo() {
        System.out.println("User Info:\n" + user.toString());
    }

    public void login(String email, String password) throws InvalidAuthenticationException {
        if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
            authenticationStatus = AuthenticationStatus.SUCCESS;
        } else {
            throw new InvalidAuthenticationException("Invalid email or password!");
        }
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(ArrayList<Insurance> insurances) {
        this.insurances = insurances;
    }

    @Override
    public int compareTo(Account account) {
        return this.getUser().getEmail().compareTo(account.getUser().getEmail());
    }

    @Override
    public int hashCode() {
        return this.getUser().getEmail().hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return this.getUser().getEmail().equals(account.getUser().getEmail());
    }
}