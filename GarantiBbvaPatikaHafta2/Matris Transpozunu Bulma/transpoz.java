import hafta1.Employee;

import javax.sound.midi.Soundbank;
import java.awt.image.ImageProducer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static int[][] transpoze(int arr[][]) {
   

        int rows = arr.length;
        int colums = arr[0].length;

        int newarr[][]=new int[colums][rows];

        for (int i=0;i<rows;i++){
            for (int j=0;j<colums;j++){
               
               newarr[j][i]=arr[i][j];
            }
        }
      
        for (int i=0;i<colums;i++){
            for (int j=0;j<rows;j++){
                System.out.print(newarr[i][j]);
            }
            System.out.println();
        }



        return null;
    }

    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6}};
        transpoze(arr);

    }
}
