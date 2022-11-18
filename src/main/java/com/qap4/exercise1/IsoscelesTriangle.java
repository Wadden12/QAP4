package com.qap4.exercise1;

public class IsoscelesTriangle extends Triangle{

    public IsoscelesTriangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    public IsoscelesTriangle(ShapeName name, String colour, boolean filled, double sideA, double sideB, double sideC) {
        super(name, colour, filled, sideA, sideB, sideC);
    }
}
