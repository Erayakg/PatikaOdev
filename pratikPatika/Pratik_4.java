import java.util.Scanner;

public class TaksimetreProgrami {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gidilen mesafeyi (KM) girin: ");
        double mesafe = scanner.nextDouble();

        double acilisUcreti = 10.0;
        double birimFiyat = 2.20;
        double toplamTutar;

        if (mesafe <= 0) {
            toplamTutar = acilisUcreti;
        } else {
            toplamTutar = acilisUcreti + (mesafe * birimFiyat);
        }

        if (toplamTutar < 20) {
            toplamTutar = 20;
        }

        System.out.println("Taksimetre Tutarı: " + toplamTutar + " TL");
    }
}
