package day2;

public class VariablesDemo {
    public static void main(String args[])
    {
        int a; //declaration (not used)
        a=100; // assignment

        int b=100; // declaration and assignment

        System.out.println(a); // print the value of the variable
        a = 200;
        System.out.println(a); // print the value of the variable "a" after new assignment

        int c=200,d=300; // used if variable are of the same data
        System.out.println("the value of a is: "+a);
        System.out.println("the value of b, c ,and d is: "+b +c +d); //the value of b, c ,and d is 100200300
        System.out.println("the value of b, c ,and d is: "+b+" "+c+" "+d); //the value of b, c ,and d is: 100 200 300
        System.out.println("the sum of c and d is :"+(c+d));

        long l=123456789L;
        System.out.println(l);

        float item_price=15.5F;
        System.out.println(item_price);

        double dbl= 123456.789654;
        System.out.println(dbl);

        char grad='A';
        System.out.println(grad);

        String Name="John";
        System.out.println(Name);

        //char ch='ABC'; // invalid char can store only 1 letter
        //String ch='ABC'; // invalid String is with " " not ' '
        //String ch='A'; // invalid because ' '
        String ch="A"; // valid

        boolean bl = true; // allows only true or false
        System.out.println(bl);
        //boolean bl="" this is not a string but a boolean this throws an error
    }
}
