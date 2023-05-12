import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Bir sayı giriniz:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total=0;
        for (int i=1;i<num;i++){
            if (num%i==0){
                total+=i;
            }
        }
        if (total==num){
            System.out.println(num+" "+"Mükemmel sayıdır");
        }else
        {
            System.out.println(num+" "+"Mükemmel sayı değildir");
        }
    }
}