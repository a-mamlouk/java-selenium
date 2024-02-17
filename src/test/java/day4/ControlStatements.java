package day4;

public class ControlStatements {
    public static void main(String args[]){
    System.out.println("Test");
    /*
    Control statements
    conditional
    looping
    jumping
    */
    //  Conditional stat
        System.out.println("Conditional stat");
        System.out.println("---------------------------------------------------------------------------------------- ");
        System.out.println("if Condition ");
        int person_age=32;
        if (person_age >= 18){
            System.out.println("Person eligible for vote");
        }
        else {
            System.out.println("Person not eligible for Vote");
        }
        int num=10;
        if (num%2==0){
            System.out.println("the number is an even Number");
        }
        else {
            System.out.println("This number is an odd Number");
        }
    }
}
