package day7;

import java.util.Arrays;
import java.util.Scanner;

public class Exemple_Read_and_write_data_in_array {
    public static void main(String args[]){

        int a[]= new int[5];
        Scanner Sc= new Scanner(System.in);

        for (int i=0; i < a.length; i++){
            System.out.println("Enter a value for "+i+": ");
            a[i]=Sc.nextInt();
        }
        for ( int value:a){
            System.out.print(value+" | ");
        }
        System.out.println();
        System.out.println(Arrays.toString(a));
    }
}
