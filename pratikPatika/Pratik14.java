import java.util.Scanner;

public class KuvvetleriYazdirma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        System.out.println("2'nin kuvvetleri:");

        int kuvvet = 1;
        while (kuvvet <= sayi) {
            System.out.println(kuvvet);
            kuvvet *= 2;
        }

        scanner.close();
    }
}
