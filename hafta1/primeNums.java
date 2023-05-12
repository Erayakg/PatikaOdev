public class AsalSayilar {
    public static void main(String[] args) {
        int baslangic = 0;
        int bitis = 100;

        System.out.println("0 ile 100 arasındaki asal sayılar:");
        
        for (int i = baslangic; i <= bitis; i++) {
            if (asalMi(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean asalMi(int sayi) {
        if (sayi < 2) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
