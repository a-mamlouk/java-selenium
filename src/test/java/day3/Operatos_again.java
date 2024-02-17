package day3;

public class Operatos_again {
    public static void main(String args[]) {
    //  Assignment ops
        System.out.println("5-Testing Assignment Ops");
        int a=10;
        System.out.println(a);
        a+=5; // a=a+5;
        System.out.println(a);
        a-=2; // a=a-2;
        System.out.println(a);

        a=10;
        a*=2; //a=a*2
        System.out.println(a);

        a/=2; // a=a/2;
        System.out.println(a);

    //  Condition ops
        System.out.println("6-Testing Condition Ops");
        int x=200,y=100;
        int e= (x<y)? x: y; //if x>y => print x else print y
        System.out.println(e);

        int person_age=30;
        String res=(person_age>=18)? "Eligible": "Not Eligible";
        System.out.println(res);
    }
}
