package day9;

import java.util.Arrays;

public class Mutable_immuatable {
    public static void main(String [] args){

        // Mutable

        int a[]= {10,20,30,40,50,70,60};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a); // mutable it changed the "a" array
        System.out.println(Arrays.toString(a));
        System.out.println("---------------------------------------------------------------------------------------- ");
        // Immutable
        String S= "Welcome";
        S.concat(" to Java"); // didnt change the S string
        System.out.println(S);

    }
}
