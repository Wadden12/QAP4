package com.qap4.exercise1;

public class Helper {

    // helper function to validate Triangle
    public static  boolean isValidTriangle(double sideA, double sideB, double sideC) {
        boolean checked = true;
        if(sideA < 0 || sideB < 0 || sideC < 0){
            checked = false;
        }
        if(!checked) return false;

        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA)
            return false;
        else
            return true;

    }

}
