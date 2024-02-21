package day8;

import java.util.Arrays;

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
        System.out.println("---------------------------------------------------------------------------------------- ");
        s="Selenium";
        System.out.println(s.substring(1,5));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        String a[]=s.split("n");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println("---------------------------------------------------------------------------------------- ");
        // ex1
        String amount = "$15,20,55";
        String amount2 = amount.replace("$","");
        System.out.println(amount2);
        String amount3 = amount2.replace(","," ");
        System.out.println(amount3);
        System.out.println("---------------------------------------------------------------------------------------- ");
        // ex2
        s="abc,123@xyz";
        String arr []= s.split(",");
        System.out.println(Arrays.toString(arr));
        String arr2[]=  arr[1].split("@");
        System.out.println(Arrays.toString(arr2));
        //String arr3[]= arr[0]+arr2[0]+arr2[1];
        System.out.println(Arrays.toString(new String[]{arr[0] +" "+ arr2[0] +" "+ arr2[1]}));
        System.out.println("---------------------------------------------------------------------------------------- ");
        // ex3
        s="abc 123 zwz";
        String ar[]=s.split(" ");
        System.out.println(Arrays.toString(ar));

    }
}
