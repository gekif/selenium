package com.gekif;

public class DataTypes {

    public static void main(String[] args) {

        int i = 1234567890; // int --> integer
        float f = 1.233434234234234324324f;
        long l = 1234567890134343l;
        double d = 1.232323348284;
        boolean b = true;
        char c = 'a';
        String s = "Java"; // Class in Java

        DataTypes dt;
        Test t;

        int batmanBegins; // Camel Case Variable
        int theDarkKnight;
        int theDarkKningRises;

        String abc = new String();
        abc = "Hello";

        String abc1 = "Hello";


        String s1 = "Way";
        String s2 = "2";
        String s3 = "Automation";

        String s4 = s1 + s2 + s3;

        // String + String --> Concatenated String
        System.out.println(s4);
        System.out.println(s1 + s2 + s3);
        System.out.println("Way" + "2" + "Automation");


        // int + int --> int
        int num1 = 10;
        int num2 = 5;

        System.out.println(num1 + num2);
        System.out.println(num1 + num2 + " after");
        System.out.println("before " + num1 + num2 + " after");
        System.out.println("before " + (num1 + num2) + " after");


        /**
         * 12 + 45 // Operands
         *
         * Unary Operator --> Single Operand
         * Binary Operator --> Two Operand
         * Ternary Operator --> Three Operand
         */

        System.out.println(34 == 78);
        System.out.println(34 <= 78);
        System.out.println(true && false);
        System.out.println((123 == 123) && (10 == 10));
        System.out.println((123 == 123) || (10 == 10));

    }
}
