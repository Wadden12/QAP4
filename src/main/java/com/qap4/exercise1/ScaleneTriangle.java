package com.qap4.exercise1;

public class ScaleneTriangle extends Triangle{
    public ScaleneTriangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    public ScaleneTriangle(ShapeName name, String colour, boolean filled, double sideA, double sideB, double sideC) {
        super(name, colour, filled, sideA, sideB, sideC);
    }
}
