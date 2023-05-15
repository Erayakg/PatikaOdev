import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static int desen(int number) {
        System.out.println(number);
        if (number < 0) {

            return   1;
        }
       desen(number - 5);
        System.out.println(number);
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N Sayısı ");
        int a = sc.nextInt();
        System.out.println("Çıktı:");
        desen(a);
    }
}
