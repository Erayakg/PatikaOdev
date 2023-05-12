import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("kaç elemanlı olsun:");
        num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }


    }
}
