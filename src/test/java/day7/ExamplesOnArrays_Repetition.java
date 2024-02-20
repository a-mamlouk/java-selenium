package day7;

public class ExamplesOnArrays_Repetition {
    public static void main(String Args[]){
        System.out.println("---------------------------------------------------------------------------------------- ");
        System.out.println("Find number of repetition");
        System.out.println("---------------------------------------------------------------------------------------- ");
        int a[]= {10,20,30,40,50,10,10,10};
        int num = 10;
        int count=0;
        for (int value:a){
            System.out.println(value);
            if (value == num){
                count++;
            }
        }
        System.out.println("the number of repetition of the "+num+" is "+count );
    }
}
