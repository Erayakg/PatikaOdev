import java.util.Scanner;

public class TekSayiToplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;

        while (true) {
            System.out.print("Bir sayı girin (Negatif sayı girerek çıkabilirsiniz): ");
            int sayi = scanner.nextInt();

            if (sayi < 0) {
                break; // Negatif sayı girildiğinde döngüden çıkılır
            }

            if (sayi % 2 == 1) { // Tek sayı kontrolü
                toplam += sayi;
            }
        }

        System.out.println("Girilen tek sayıların toplamı: " + toplam);

        scanner.close();
    }
}
