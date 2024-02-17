package day4;

    /*
    a>b and a>c    -- a is largest
    b>a and b>c    -- b is largest
    c>a and c>b    -- c is largest
    */

public class Largest0f3Numbers {
    public static void main(String[] args) {

        int a = 10, b = 20, c = 30;
        if (a > b && a > c) {
            System.out.println("a is the largest number");
        } else if (b > a && b > c) {
            System.out.println(" b is the largest number");
        } else {
            System.out.println("c is the largest number");
        }
    }
}
