package day6;

import day5.ForLoop;

public class Array {
    public static void main(String Args[]){
        /*
        Array => Variable that can store multiple values of same data type ( homogenios data)
        */

        System.out.println("Single dimensional array");
        System.out.println("---------------------------------------------------------------------------------------- ");
        // declare array approach 1

        int a[]=new int[5]; // syntax
        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;

        // declare array approach 2
        int t[]={100,200,300,400,500};

        //find length of an array
        System.out.println("the length of the array is "+t.length);
        //read specific value of an array
        System.out.println("the value of the 4th index is "+t[4]);

        //read all values from array (for loop)
        for (int i=0; i<= t.length-1; i++)
        {
            System.out.println("the value of the index "+i+" is "+t[i]);
        }

        //read all values from array ( for each)
        for (int x:t){
            System.out.println("the value is "+x);
        }
        System.out.println("---------------------------------------------------------------------------------------- ");
        System.out.println("Two dimensional array");
        System.out.println("---------------------------------------------------------------------------------------- ");
        // 1st approach
        int x[][]= new int[3][2];
        x[0][0]=100;
        x[0][1]=200;
        x[1][0]=300;
        x[1][1]=400;
        x[2][0]=500;
        x[2][1]=600;
        // if you have an idea how many you want to store , and fixed array

        //2nd approach
        int y[][]= {{100,200},
                    {300,400},
                    {500,600}
                    };
        // find size of an array
        System.out.println("the length of the rows is "+y.length);
        System.out.println("the length of the columns is "+y[0].length);

        //get array values
        for (int r=0; r<y.length;r++){
            for (int c=0; c<y[0].length;c++){
                System.out.print(y[r][c]+" | ");
            }
            System.out.println();
        }
        //get array values enhanced
        /*
        for (int arr[]:t) {
            for (int w:arr) {
                System.out.println(w);
            }
        }
        ==> this didnt work for me don't know why
        */
    }
}
