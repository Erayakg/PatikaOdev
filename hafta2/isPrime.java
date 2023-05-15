public class RecursivePrime {

    public static boolean isPrime(int number, int divisor) {
        if (number <= 2) {
            return (number == 2);
        }
        if (number % divisor == 0) {
            return false;
        }
        if (divisor * divisor > number) {
            return true;
        }
        return isPrime(number, divisor + 1);
    }

    public static boolean isPrime(int number) {
        return isPrime(number, 2);
    }

    public static void main(String[] args) {
        int number = 17;
        boolean isPrime = isPrime(number);
        if (isPrime) {
            System.out.println(number + " asal bir sayıdır.");
        } else {
            System.out.println(number + " asal bir sayı değildir.");
        }
    }
}
