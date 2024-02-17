package day3;

public class Operators {
    public static void main(String args[])
    {
        /*
        1) Arithmetic operators + - * /
        2) Relational/comparison operators > >= * <= != ==
        3) Logical operators && II !
        4) Increment & Decrement operators ++ --
        5) Assignment = += -= *=/= %=
        6) conditional/ternary operator ?:
        */
    // Arithmetic ops
        System.out.println("1-Testing Arithmetic Ops");
        int a=21,b=10;
        int result=a+b;
        System.out.println("the result is :"+result);
        System.out.println("the result is :"+(a+b));

        System.out.println("the result is :"+(a-b));
        System.out.println("the result is :"+(a*b));
        System.out.println("the result is :"+(a/b));
        System.out.println("the result is :"+(a%b));

    // Relational ops
        System.out.println("2-Testing Relational Ops");
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a!=b);
        System.out.println(a==b);

    // Logical ops
        System.out.println("3-Testing Logical Ops");
        boolean x=true;
        boolean y=false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        System.out.println(!y);

    // Incr/Decr ops
        System.out.println("4-Testing incr/decr Ops");
        int f=10;
        System.out.println(f);

        f++; //f=f+1;
        System.out.println(f);
        int res=f++;
        System.out.println(res); // warning print 11 !! not 12 !!
        f = 11;
        res=++f; // works as expected ! increase before assignment
        System.out.println(res);


    }
}
