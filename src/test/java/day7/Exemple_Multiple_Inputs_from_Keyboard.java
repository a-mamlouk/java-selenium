package day7;

import java.util.Scanner;

public class Exemple_Multiple_Inputs_from_Keyboard {
    public static void main(String args[]){

        Scanner Sc= new Scanner(System.in);

        System.out.print("Enter a number please: ");
        int num1 = Sc.nextInt();
        System.out.print("Enter a Decimal number please: ");
        double num2 = Sc.nextDouble();
        System.out.println("The given decimal number is "+(num1+num2));
        System.out.println("---------------------------------------------------------------------------------------- ");

        System.out.println("Enter your name: ");
        String Name=Sc.next();
        System.out.println("Enter your age: ");
        int Age=Sc.nextInt();
        System.out.println("Enter an unknown thing: ");
        Object value=Sc.next();

        System.out.println(value);

    }
}
