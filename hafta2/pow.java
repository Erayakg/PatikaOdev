import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static int Pow(int number,int exp) {
        //eğer üs 0 a eşitse 1 döndürülür
        if (exp==0){
            return 1;
        }
        //recursive olarak fonksiyon çağıırlır ve çarpılma işlemi yapılır
        return number*Pow(number,exp-1);
    }

    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        System.out.println("Taban değeri giriniz ");
        int a=sc.nextInt();
        System.out.println("Üs değerini giriniz ");
        int b =sc.nextInt();
        int result= Pow(a,b);
        System.out.println("Sonuç :"+result);

    }
}
