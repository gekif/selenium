package com.gekif;

public class Test

{ // start of Body

    // instant --> w.r.t   vs   instance - copy / clone
    public static void main(String[] args) {

        // JDK --> Java Compiler + JRE (JVM + Lib files)
        // 25/0 -> Div 0 Error

        Test t = new Test();
        System.out.println(t);

        t = null;

        Test t1 = t;

        Home h = new Home();

        // new Test();



        /*for (int i = 0;; i++)
        {
            new Test();
            System.out.println(i);
        }*/


    }


} // end of Body
