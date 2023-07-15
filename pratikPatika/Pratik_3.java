import java.util.Scanner;

public class HipotenusHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dik kenarın uzunluğunu girin: ");
        double kenar1 = scanner.nextDouble();

        System.out.print("Diğer dik kenarın uzunluğunu girin: ");
        double kenar2 = scanner.nextDouble();

        double hipotenus = Math.sqrt(Math.pow(kenar1, 2) + Math.pow(kenar2, 2));

        System.out.println("Hipotenüs: " + hipotenus);
    }
}
