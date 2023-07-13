import java.util.Scanner;

public class RecursivePower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Taban değerini girin: ");
        int base = scanner.nextInt();
        
        System.out.print("Üs değerini girin: ");
        int exponent = scanner.nextInt();
        
        int result = calculatePower(base, exponent);
        
        System.out.println("Sonuç: " + result);
        
        scanner.close();
    }
    
    public static int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        
        return base * calculatePower(base, exponent - 1);
    }
}
