package day5;

public class ForLoop {
    public static void main(String Args[]) {
        for (int i=1; i<=10;i++) {
        System.out.println(i);
        }
        System.out.println("---------------------------------------------------------------------------------------- ");
        System.out.println("Printing even and odd numbers");
        for (int i=1; i<=10;i++) {
            if (i%2==0) {
                System.out.println(i + " is an even number");
            }
            else {
                System.out.println(i + " is an odd number");
            }
        }
    }
}
