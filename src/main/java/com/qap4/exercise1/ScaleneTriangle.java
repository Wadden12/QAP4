package com.qap4.exercise1;

public class ScaleneTriangle implements Triangle{
    private String colour;
    private boolean filled;
    private  double sideOne;
    private double sideTwo;
    private double sideThree;


    public ScaleneTriangle(String colour, boolean filled, double sideOne, double sideTwo, double sideThree) {
        if(sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree){
            throw new IllegalArgumentException(String.format("No two sides can be equal in a Scalene Triangle. Got: %d, %d, %d", sideOne, sideTwo, sideThree));
        }
        this.colour = colour;
        this.filled = filled;
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }


    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public void setSideThree(double sideThree) {
        this.sideThree = sideThree;
    }

    @Override
    public ShapeName getName() {
        return ShapeName.SCALENE_TRIANGLE;
    }

    @Override
    public String getColour() {
        return this.colour;
    }

    @Override
    public boolean isFilled() {
        return this.filled;
    }

    @Override
    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void setFilled(boolean filled) {
    this.filled = filled;
    }


    @Override
    public double getSideOneLength() {
        return this.sideOne;
    }

    @Override
    public double getSideTwoLength() {
        return this.sideTwo;
    }

    @Override
    public double getSideThreeLength() {
        return this.sideThree;
    }

    // Area of a Scalene Triangle
    @Override
    public double getArea() {
        double a = getSideOneLength();
        double b = getSideTwoLength();
        double c = c = getSideThreeLength();
        double s = (a + b + c) /2;
        return (Math.sqrt(s * ((s-a) * (s-b)* (s-c))));

    }

    @Override
    public double getPerimeter() {
        return (getSideOneLength() + getSideTwoLength() +getSideThreeLength());
    }

}
