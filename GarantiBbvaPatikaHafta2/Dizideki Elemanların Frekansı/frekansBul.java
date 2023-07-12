import java.util.HashMap;
import java.util.Map;

public class FrekansBulucu {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        // Frekansları saklamak için bir HashMap oluşturulur.
        Map<Integer, Integer> frekanslar = new HashMap<>();

        // Dizi üzerinde gezinilir ve frekanslar hesaplanır.
        for (int eleman : dizi) {
            if (frekanslar.containsKey(eleman)) {
                // Eleman daha önce görüldüyse frekansı 1 artırılır.
                int frekans = frekanslar.get(eleman);
                frekanslar.put(eleman, frekans + 1);
            } else {
                // Eleman ilk defa görülüyorsa frekansı 1 olarak ayarlanır.
                frekanslar.put(eleman, 1);
            }
        }

        // Frekanslar ekrana yazdırılır.
        for (Map.Entry<Integer, Integer> entry : frekanslar.entrySet()) {
            int eleman = entry.getKey();
            int frekans = entry.getValue();
            System.out.println(eleman + " sayısı " + frekans + " kere tekrar edildi.");
        }
    }
}
