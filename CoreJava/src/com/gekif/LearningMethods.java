package com.gekif;

public class LearningMethods {

    int i; // Declaration, initialize
    int j;

    public void show() {
        int a;
        int b;
        String c;
    }

    // Return type --> dataType of the value returned by method

    // Keyword --> return

    // Display
    public int display(int k, String a, char c, float f, boolean b) { // Declare --> define
    // Starts

        /**
         *
         * All Definitions Goes Here
         *
         */

        int j = 100;
        System.out.println("Inside Display Method");

//        String x = "Hello";
//        return x; // Last Statement

        return 1;
    } // Ends


    public static void main(String[] args) {

/*        LearningMethods learn = new LearningMethods();
        learn.show();

        LearningMethods learn1 = new LearningMethods();
        learn1.show();*/

        Home h = new Home(); // h --> Object --> i = 10
        h.i++; // Object1 --> i = 11;

        Home h1 = new Home();  // h1 --> Object2 --> i = 10
        h1.i++; // Object2 --> i = 11;

        Home h2 = new Home(); // h2 --> Object 3 --> i = 10
        System.out.println(h2.i); // Object 3 --> i = 10;





    }
}
