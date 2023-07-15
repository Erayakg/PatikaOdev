import java.util.Scanner;

public class SifreYonetimi {
    public static void main(String[] args) {
        String dogruKullaniciAdi = "admin"; // Örnek doğru kullanıcı adı
        String dogruSifre = "12345"; // Örnek doğru şifre
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kullanıcı adınızı girin: ");
        String kullaniciAdi = scanner.nextLine();
        
        System.out.print("Şifrenizi girin: ");
        String girilenSifre = scanner.nextLine();
        
        if (kullaniciAdi.equals(dogruKullaniciAdi) && girilenSifre.equals(dogruSifre)) {
            System.out.println("Giriş başarılı!");
        } else {
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (E/H): ");
            String sifreSifirla = scanner.nextLine();
            
            if (sifreSifirla.equalsIgnoreCase("E")) {
                System.out.print("Lütfen yeni şifrenizi girin: ");
                String yeniSifre = scanner.nextLine();
                
                if (!yeniSifre.equals(girilenSifre) && !yeniSifre.equals(dogruSifre)) {
                    dogruSifre = yeniSifre;
                    System.out.println("Şifre oluşturuldu!");
                } else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                }
            } else {
                System.out.println("Giriş başarısız!");
            }
        }
        
        scanner.close();
    }
}
