import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int girilenSayi = scanner.nextInt();

        int toplam = 0;
        int adet = 0;

        for (int i = 0; i <= girilenSayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }
        }

        if (adet > 0) {
            double ortalama = (double) toplam / adet;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı bulunamadı.");
        }

        scanner.close();
    }
}
