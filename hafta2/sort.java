import hafta1.Employee;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
   public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
      Scanner scanner =new Scanner(System.in);
        System.out.println("Dizinin boyutu n :");
        int n =scanner.nextInt();
        int arr[] =new int[n];
        for (int i=0;i<arr.length;i++){
            System.out.println("eleman giriniz");
            arr[i]=scanner.nextInt();
        }
        bubbleSort(arr);
       printArray(arr);

    }
}
