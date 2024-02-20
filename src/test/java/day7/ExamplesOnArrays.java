package day7;

public class ExamplesOnArrays {
    public static void main(String Args[]){
        System.out.println("---------------------------------------------------------------------------------------- ");
        System.out.println("Search an element in an array");
        System.out.println("---------------------------------------------------------------------------------------- ");
        int a[]= {10,20,30,40,50};
        int search=30;
        boolean status = false;
        for (int i=0; i<=a.length-1;i++){
//            System.out.println(a[i]);
            if (a[i]==search){
                System.out.println("Element found with index "+i);
                status = true;
                break;
            }
        }
        if (status==false){
            System.out.println("Element not found in the array, please verify the input");
        }
    }
}
