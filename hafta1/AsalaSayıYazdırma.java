public class Main {
    public static void main(String[] args) {

        System.out.println("1 - 100 arasındaki asal sayılar:");
        
        for(int num = 2; num <= 100; num++){
            boolean isPrime = true;
            
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime){
                System.out.print(num + " ");
            }
        }
    }
}
