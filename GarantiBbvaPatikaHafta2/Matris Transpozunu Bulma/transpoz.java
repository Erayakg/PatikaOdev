import hafta1.Employee;

import javax.sound.midi.Soundbank;
import java.awt.image.ImageProducer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static int[][] transpoze(int arr[][]) {
        //satır ve sutün uzunlukları alınır

        int rows = arr.length;
        int colums = arr[0].length;

        //transpozunda tam tersi olacağı için sutün uzunluğu satır uzunluğu boyutunda tanımlanmışıtr
        //aynı şekil satır uzunluğuda sutğn uznuluğunda tanımlanışıtr

        int newarr[][]=new int[colums][rows];
        //verilen dizi gezilir
        for (int i=0;i<rows;i++){
            for (int j=0;j<colums;j++){
                //satırdaki elemanlar yeni dizinin sutün elemanlarına yerleştirilir
               newarr[j][i]=arr[i][j];
            }
        }
        //ekrana yeni diziyi yazdırma
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
