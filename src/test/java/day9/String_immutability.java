package day9;

public class String_immutability {
    public static void main(String[] args){
        // first method
        String S="Welcome";
        String rev="";
        for (int i=S.length()-1; i>=0;i--){
            //System.out.println(S.charAt(i));
            rev=rev+S.charAt(i);
        }
        System.out.println("Reverse string is "+rev);

    }
}
