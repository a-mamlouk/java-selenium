package day9;

public class StringBuilder_StringBuffer {
    public static void main(String[] args){
        // String immutable
        String S="Welcome";
        S.concat(" to Jave");
        System.out.println(S);

        // StringBuffer - Mutable
        StringBuffer SBF= new StringBuffer("Welcome");
        SBF.append(" to Java");
        System.out.println(SBF);

        //StringBuilder - Mutable
        StringBuffer SBL= new StringBuffer("Welcome");
        SBL.append(" to Java");
        System.out.println(SBL);


    }
}
