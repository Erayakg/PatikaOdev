import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("kaç sayı gireceksiniz:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int max, min;
        int nums[] = new int[i];
        for (int j = 0; j < i; j++) {
            System.out.println((j + 1) +" "+"Sayıyı giriniz:");
            nums[j] = sc.nextInt();
        }
        max = nums[0];
        min = nums[0];

        for (int s = 0; s < i; s++) {
            if (nums[s] > max) {
                max = nums[s];
            }
            if (nums[s] < min) {
                min = nums[s];
            }
        }
        System.out.println("en büyük sayı :" + max);
        System.out.println("en küçük sayı :" + min);
    }
}