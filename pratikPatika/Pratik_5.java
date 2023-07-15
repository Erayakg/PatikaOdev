import java.util.Scanner;

public class DaireAlanCevreHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yarıçapı girin: ");
        double yariCap = scanner.nextDouble();

        double pi = 3.14;

        double alan = pi * yariCap * yariCap;
        double cevre = 2 * pi * yariCap;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
    }
}
