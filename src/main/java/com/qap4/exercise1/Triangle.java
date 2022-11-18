package com.qap4.exercise1;

public abstract class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(ShapeName name, String colour, boolean filled, double sideA, double sideB, double sideC) {
        super(name, colour, filled);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double getPerimeter() {
        double perimeter;
       perimeter = this.sideA + this.sideB + this.sideC;

        return perimeter;
    }

    @Override
    double getArea() {
        return 0;
    }




}
