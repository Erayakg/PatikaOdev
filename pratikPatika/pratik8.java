import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        String[] dersler = {"Matematik", "Fizik", "Türkçe", "Kimya", "Müzik"};
        int gecmeNotu = 55;
        
        Scanner scanner = new Scanner(System.in);
        
        int toplamNot = 0;
        int toplamDersSayisi = 0;
        
        for (String ders : dersler) {
            System.out.print(ders + " notunu girin: ");
            int not = scanner.nextInt();
            
            if (not >= 0 && not <= 100) {
                toplamNot += not;
                toplamDersSayisi++;
            }
        }
        
        if (toplamDersSayisi > 0) {
            double ortalama = (double) toplamNot / toplamDersSayisi;
            System.out.println("Ortalama: " + ortalama);
            
            if (ortalama >= gecmeNotu) {
                System.out.println("Tebrikler, geçtiniz!");
            } else {
                System.out.println("Maalesef, kaldınız!");
            }
        } else {
            System.out.println("Girilen ders notları geçerli değil.");
        }
        
        scanner.close();
    }
}
