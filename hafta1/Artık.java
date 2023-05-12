import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("doğum yılınızı giriniz");
        Scanner sc = new Scanner(System.in);
            int i=sc.nextInt();
       if (i %100 ==0 ){
           if(i %400 ==0){
               System.out.println(i+" artık bir yıldır");
           }
           else {
               System.out.println("artık yıl değildir");
           }
       }
       else {
            if(i %4 ==0){
               System.out.println(i+" artık bir yıldır");
           }
            else {
                System.out.println("artık bir yıl değildir");
            }
       }

    }
}