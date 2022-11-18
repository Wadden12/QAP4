package com.qap4.exercise1;

public interface TriangleInterface {

    ShapeName getTriangle(double sideA, double sideB, double sideC);

    boolean isValidTriangle(double sideA, double sideB, double sideC);

    Triangle createTriangles(String colour, boolean filled, double sideA, double sideB, double sideC);
}
