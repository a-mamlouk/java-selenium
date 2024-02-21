package day8;

public class String_Methods {
    public static void main(String args[]){
        String s="Hello everyone";
        System.out.println(s.length());
        System.out.println("welcome".length());
        String s2="this is Anas";
        System.out.println(s+" "+s2);
        System.out.println(s.concat(" ".concat(s2)));
        System.out.println("---------------------------------------------------------------------------------------- ");
        String s3 ="  Good Morning  ";
        System.out.println("Before trimming: "+s3+" "+s3.length());
        System.out.println("After trimming: "+s3.trim()+" "+s3.length());
        System.out.println("---------------------------------------------------------------------------------------- ");
        System.out.println(s.charAt(6));
        System.out.println("---------------------------------------------------------------------------------------- ");
        System.out.println(s.contains("yone"));
        System.out.println(s.contains("YoNe"));
        System.out.println("---------------------------------------------------------------------------------------- ");
        String s1="welcome";
        s2="welcome";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Welcome"));
        System.out.println(s1.equalsIgnoreCase("Welcome"));
        System.out.println("---------------------------------------------------------------------------------------- ");
        s=" hello this Anas learning Java and java";
        System.out.println(s.replace('e','x'));
        System.out.println(s.replace("java","Cypress"));
    }
}
