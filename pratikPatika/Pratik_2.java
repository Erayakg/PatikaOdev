import java.util.Scanner;

public class KDVTutariHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Para tutarını girin: ");
        double tutar = scanner.nextDouble();

        double kdvOrani;
        if (tutar <= 1000) {
            kdvOrani = 0.18;
        } else {
            kdvOrani = 0.08;
        }

        double kdvTutari = tutar * kdvOrani;
        double kdvliFiyat = tutar + kdvTutari;

        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        System.out.println("KDV Tutarı: " + kdvTutari);
    }
}
