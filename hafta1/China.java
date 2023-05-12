import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("doğum yılınızı giriniz");
        Scanner sc = new Scanner(System.in);
            int i=sc.nextInt();
        if ( i% 12 == 1) {
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        }
        if (i % 12 == 2) {
            System.out.println("Çin Zodyağı Burcunuz : Köpek");
        }
        if (i % 12 == 3) {
            System.out.println("Çin Zodyağı Burcunuz : Domuz");

        }
        if (i % 12 == 4) {
            System.out.println("Çin Zodyağı Burcunuz : Fare");

        }
        if (i % 12 == 5) {
            System.out.println("Çin Zodyağı Burcunuz : Öküz");

        }
        if (i % 12 == 6) {
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");

        }
        if (i % 12 == 7) {
            System.out.println("Çin Zodyağı Burcunuz : Tavşan");

        }
        if (i % 12 == 8) {
            System.out.println("Çin Zodyağı Burcunuz : Ejderha");

        }
        if (i % 12 == 9) {
            System.out.println("Çin Zodyağı Burcunuz : Yılan");

        }
        if (i % 12 == 10) {
            System.out.println("Çin Zodyağı Burcunuz : At");

        }
        if (i % 12 == 11) {
            System.out.println("Çin Zodyağı Burcunuz : Koyun");

        }
        if (i % 12 == 0) {
            System.out.println("Çin Zodyağı Burcunuz : Maymun");

        }

    }
}