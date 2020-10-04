package com.chp1;

import java.lang.Math;

public class MathClass {

    public static void main(String[] args) {

        // Write a function to calculate Trigonomery

        MathClass mathClass = new MathClass();

        double trig = mathClass.calcTrig(5, 6);
        System.out.println(trig);

        mathClass.getMin(5, 6);

        }


    public double calcTrig(int a, int b){
        double hypotenuse = Math.round(Math.sqrt(Math.pow(a, 2)
                + Math.pow(b, 2)));
        return hypotenuse;
    }

    public void getMin(int a, int b){
        System.out.printf("Minimum number is %d", Math.min(a, b));
    }
}
