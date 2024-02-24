package day9;

public class String_immutability {
    public static void main(String[] args){
        // Method : length(), charAT()
        String S="Welcome";
        String rev="";
        for (int i=S.length()-1; i>=0;i--){
            //System.out.println(S.charAt(i));
            rev=rev+S.charAt(i);
        }
        System.out.println("Reverse string is "+rev);

        // Method 2:
        String S2="Welcome";
        String rev2= "";
        char a[]= S2.toCharArray();
        for (int i=a.length-1; i>=0; i--){
            System.out.println(a[i]);
            rev2=rev2+a[i];
        }
        System.out.println("Reverse string is "+rev2);
    }
}
