package day9;

public class String_reverse_string {
    public static void main(String[] args){
        // Method : length(), charAT()
        String S="Welcome";
        String rev="";
        for (int i=S.length()-1; i>=0;i--){
            //System.out.println(S.charAt(i));
            rev=rev+S.charAt(i);
        }
        System.out.println("Reverse string is "+rev);
        System.out.println("---------------------------------------------------------------------------------------- ");

        // Method 2:
        String S2="Welcome";
        String rev2= "";
        char a[]= S2.toCharArray();
        for (int i=a.length-1; i>=0; i--){
            System.out.println(a[i]);
            rev2=rev2+a[i];
        }
        System.out.println("Reverse string is "+rev2);
        System.out.println("---------------------------------------------------------------------------------------- ");

        // Method 3
        StringBuffer S3= new StringBuffer( "Welcome ");
        System.out.println(S3);
        System.out.println("Reverse string using reverse "+S3.reverse());

        // method 4
        StringBuilder S4 = new StringBuilder("Welcome");

    }
}
