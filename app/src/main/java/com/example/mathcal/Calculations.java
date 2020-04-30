package com.example.mathcal;

public class Calculations {
    public static int addition(int a , int b){
        return a+b;
    }

    public static int subtraction(int a , int b){
        return a-b;
    }

    public static int multiply(int a , int b){
        return a*b;
    }

    public static float division(int a , int b){
        if(b == 0 )
            throw new IllegalArgumentException("Can't divide any number by Zero");
        return a/b;
    }
}
