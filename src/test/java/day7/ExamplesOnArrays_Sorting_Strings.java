package day7;

import java.util.Arrays;

public class ExamplesOnArrays_Sorting_Strings {
    public static void main(String Args[]){
        System.out.println("---------------------------------------------------------------------------------------- ");
        System.out.println("Sorting numbers in an array");
        System.out.println("---------------------------------------------------------------------------------------- ");
        int a[]= {100,600,200,400,900,500};
        System.out.println("Before Sorting");
        for ( int value:a){
            System.out.print(value+" | ");
        }
        System.out.println();
//        System.out.println(Arrays.toString(a));
        System.out.println("Before Sorting");
        Arrays.sort(a);
        for ( int value:a){
            System.out.print(value+" | ");
        }
    }
}
