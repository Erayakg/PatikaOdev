import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Basamak sayısını girin:");
        int rows = scanner.nextInt();
        
        for(int i = rows; i >= 1; i--) {
            for(int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
