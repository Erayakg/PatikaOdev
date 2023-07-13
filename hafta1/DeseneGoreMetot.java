public class RecursiveExample {
    public static void main(String[] args) {
        int n = 20;
        recursiveMethod(n);
    }
    
    public static void recursiveMethod(int n) {
        System.out.println(n);
        
        if (n <= 0) {
            return;
        }
        
        recursiveMethod(n - 5);
        
        System.out.println(n);
    }
}
