import java.util.Scanner;

public class SayiSiralamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("2. sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        System.out.print("3. sayıyı girin: ");
        int sayi3 = scanner.nextInt();

        // En küçük sayıyı bulma
        int enKucuk = sayi1;
        if (sayi2 < enKucuk) {
            enKucuk = sayi2;
        }
        if (sayi3 < enKucuk) {
            enKucuk = sayi3;
        }

        // En büyük sayıyı bulma
        int enBuyuk = sayi1;
        if (sayi2 > enBuyuk) {
            enBuyuk = sayi2;
        }
        if (sayi3 > enBuyuk) {
            enBuyuk = sayi3;
        }

        // Orta sayıyı bulma
        int ortaSayi = sayi1;
        if (sayi2 != enKucuk && sayi2 != enBuyuk) {
            ortaSayi = sayi2;
        } else if (sayi3 != enKucuk && sayi3 != enBuyuk) {
            ortaSayi = sayi3;
        }

        System.out.println("Küçükten büyüğe sıralama: " + enKucuk + " " + ortaSayi + " " + enBuyuk);

        scanner.close();
    }
}
