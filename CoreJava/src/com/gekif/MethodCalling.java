package com.gekif;

public class MethodCalling {

    // Static component --> cannot give a call to non-static component directly

    // static --> static (allowed)
    // non static --> non static, static (allowed)
    // non static component cannot be called without making an object
    // static --> OO

    /**
     * Compile
     * Exceuted --> JVM
     *
     *
     */


    public static void main(String[] args) {

        MethodCalling m = new MethodCalling();
        m.go1();

        System.out.println("after calling go1 method");

//        go3();

        /**
         *
         * Inside go1 method
         * Inside go method
         * Inside go2 method
         * after calling go2 method
         * after calling go method
         * after calling go1 method
         *
         */

    }


    public static void go3() {

        System.out.println("inside go3 method");
    }


    public static void go() {

        System.out.println("Inside go method");
        go2();
        System.out.println("after calling go2 method");
    }


    public static void go1() {

        System.out.println("Inside go1 method");
        go();
        System.out.println("after calling go method");
    }


    public static void go2() {

        System.out.println("Inside go2 method");
    }
}
