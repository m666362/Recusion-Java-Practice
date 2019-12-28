package org.richit.recursion_lib;

public class MyClass {
    static String dot = "----------------";

    private static void headingProgram(String heading) {
        System.out.println();
        System.out.println(dot+heading+dot);
        System.out.println();
    }

    public static void main(String[] args) {
        headingProgram("Start Programme");

        System.out.println("The factorial is : " + calculateFactorial( 0 ));

        headingProgram( "End Programme" );
    }


    private static int calculateFactorial(int value) {
        if(value==1 || value ==0)
            return 1;
        return calculateFactorial( value-1 )*value;
    }
}
