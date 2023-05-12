import java.util.Scanner;

public class Main {
    public static float calculateEndex(float height, float weight) {
        return weight /(height * height)  ;
    }


    public static void main(String[] args) {
        float height, weight,index;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        height = scanner.nextFloat();
        System.out.println("Lütfen kilonuzu giriniz :");
        weight = scanner.nextFloat();

        index=calculateEndex(height,weight);
        System.out.println("Vücut Kitle İndeksiniz :"+index);

    }
}