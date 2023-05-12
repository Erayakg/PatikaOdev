import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        float Armut, Elma, Domates, Muz, Patlican;
        Armut = 2.14F;
        Elma =3.67F;
        Domates=1.11F;
        Muz=0.95F;
        Patlican=5.00F;
        float total=0;

        Scanner sc =new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? :");

        total+=Armut*sc.nextFloat();

        System.out.println("Elma Kaç Kilo ? :");
        total+=Elma*sc.nextFloat();
        System.out.println("Domates Kaç Kilo ? :");
        total+=Domates*sc.nextFloat();
        System.out.println("Muz Kaç Kilo ? :");
        total+=Muz*sc.nextFloat();
        System.out.println("Patlıcan Kaç Kilo ? :");
        total+=Patlican*sc.nextFloat();
        System.out.println("Toplam:"+total);



    }
}