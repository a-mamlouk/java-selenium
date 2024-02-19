package day5;

public class While {
    public static void main(String Args[]){
        /*
        * while
        * do while loop
        * for loop
        * enhanced for loop / for each loop
        */

        /*
        ** which loop is prefered to use
        If you know the number of iterations in advance, the for loop is often the most suitable.
        * If you want to execute the loop at least once, the do-while loop is appropriate.
        * If you are uncertain about the number of iterations and the loop termination is based on
        a condition, the while loop is a good choice.
         */

        System.out.println("While statement");
        System.out.println("---------------------------------------------------------------------------------------- ");
        int i=1;
        while (i<=10){
            System.out.println(i);
            i++;
        }
        System.out.println("---------------------------------------------------------------------------------------- ");
        int u=1;
        while (u<=10){
            if (u%2==0)
            {
                System.out.println(u+" is an even number ");
            }
            else
            {
                System.out.println(u +" is and odd number");
            }
            u++;
        }
        System.out.println("---------------------------------------------------------------------------------------- ");
        int y=10;
        while (y>0){
            System.out.println(y);
            y--;
        }
    }
}
