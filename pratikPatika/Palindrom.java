public class Main {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "abba"; // Kullanıcıdan alınacak kelimeyi burada tanımlayabilirsiniz

        if (isPalindrome(word)) {
            System.out.println(word + " bir palindromik kelimedir.");
        } else {
            System.out.println(word + " bir palindromik kelime değildir.");
        }
    }
}
