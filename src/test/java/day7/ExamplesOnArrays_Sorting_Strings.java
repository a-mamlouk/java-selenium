package day7;

import java.util.Arrays;

public class ExamplesOnArrays_Sorting_Strings {
    public static void main(String Args[]){
        System.out.println("---------------------------------------------------------------------------------------- ");
        System.out.println("Sorting Strings in an array");
        System.out.println("---------------------------------------------------------------------------------------- ");
        String a[]= {"Anas","Zakaria","Xavier","Yvonne","Sophia"};
        System.out.println("Before Sorting");
        for ( String value:a){
            System.out.print(value+" | ");
        }
        System.out.println();
//        System.out.println(Arrays.toString(a));
        System.out.println("Before Sorting");
        Arrays.sort(a);
        for ( String value:a){
            System.out.print(value+" | ");
        }
    }
}
