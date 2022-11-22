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
// making sure no negative numbers
    public static boolean isValidCircularShape(double radius){
        return((!(radius < 0)));
    }

    public static boolean isValidCircularShape( double majorAxis, double minorAxis){
        return((!(minorAxis < 0 || majorAxis < 0)));
    }

    public static double largerInputCheck (double majorAxis, double minorAxis){
        if(majorAxis == minorAxis) return majorAxis;
        return(Math.max(majorAxis, minorAxis));
    }

    public static double smallerInputCheck (double majorAxis, double minorAxis){
        if(majorAxis == minorAxis) return minorAxis;
        return(Math.min(majorAxis, minorAxis));
    }




}
