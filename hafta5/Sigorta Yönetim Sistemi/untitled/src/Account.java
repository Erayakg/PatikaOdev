import java.util.ArrayList;
import java.util.Objects;

abstract class Account  implements Comparable<Account>{
    private AuthenticationStatus authenticationStatus;
    private User user;
    private ArrayList<Insurance> insurances;
    @Override
    public int compareTo(Account other) {
        return user.getEmail().compareTo(other.user.getEmail());
    }
    public Account(User user) {
        this.authenticationStatus = AuthenticationStatus.FAIL;
        this.user = user;
        this.insurances = new ArrayList<>();
    }

    public void login(String email, String password) throws InvalidAuthenticationException {
        if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
            authenticationStatus = AuthenticationStatus.SUCCESS;
        } else {
            throw new InvalidAuthenticationException("Invalid email or password!");
        }
    }

    public boolean isLoggedIn() {
        return authenticationStatus == AuthenticationStatus.SUCCESS;
    }

    public void addInsurance(Insurance insurance) {
        insurances.add(insurance);
    }

    public abstract void addInsurancePolicy();

    public void showUserInfo() {
        user.showUserInfo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(user.getEmail());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Account other = (Account) obj;
        return Objects.equals(user.getEmail(), other.user.getEmail());
    }
}
