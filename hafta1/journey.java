import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int distance, age, journeyType;
        int total = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz :");

        distance = sc.nextInt();
        if (distance < 0) {
            System.out.println("hatalı veri girişi");
            return;
        }
        System.out.println("Yaşınızı giriniz : ");
        age = sc.nextInt();
        if (age < 0) {
            System.out.println("hatalı veri girişi");
            return;
        }
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        journeyType = sc.nextInt();
        if (journeyType != 1 && journeyType != 2) {
            System.out.println("hatalı veri girdiniz !!");
            return;
        }
        total = distance * 1 / 10;

        if (age < 12) {
            total -= total * 50 / 100;

        }
        if (age > 12 && age < 24) {

            total -= total * 10 / 100;


        }
        if (age > 65) {
            total -= total * 30 / 100;

        }
        if (journeyType==2){
            total -= total * 20 / 100;
            total=total*2;

        }

        System.out.println("toplam tutar:"+total);

    }
}