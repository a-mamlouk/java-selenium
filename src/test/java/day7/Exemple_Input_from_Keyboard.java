package day7;

import java.util.Scanner;

public class Exemple_Input_from_Keyboard {
    public static void main(String args[]){
        int num= 20; // hardcoded input
        Scanner Sc= new Scanner(System.in);
        System.out.print("Enter a number please: ");
        int num2 = Sc.nextInt();
        System.out.println("The given number is "+num2);

        System.out.print("Enter a Decimal number please: ");
        double num3 = Sc.nextDouble();
        System.out.println("The given decimal number is "+num3);
    }
}
