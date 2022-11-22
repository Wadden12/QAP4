package com.qap4.exercise1;

public class Circle  implements CircularShapes{

    private String colour;
    private boolean isFilled;
    private double radius;

    final double PI = Math.PI;


    // Circle Constructor

    public Circle(String colour, boolean isFilled, double radius) {
        this.colour = colour;
        this.isFilled = isFilled;
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // this is the same as getRadius just named differently to be used for other classes
    @Override
    public double getMinorAxis() {
        return this.radius;
    }

    @Override
    public double getMajorAxis() {
        return this.radius;
    }

    @Override
    public ShapeName getName() {
        return ShapeName.CIRCLE;
    }

    @Override
    public String getColour() {
        return this.colour;
    }

    @Override
    public boolean isFilled() {
        return this.isFilled;
    }

    @Override
    public void setColour(String colour) {
        this.colour = colour;

    }

    @Override
    public void setFilled(boolean filled) {
        this.isFilled = filled;

    }

    // as a note get Major axis is the same a get radius
    @Override
    public double getArea() {
        return (PI*Math.pow(getMajorAxis(), 2));
    }

    @Override
    public double getPerimeter() {
        return (2* PI * getMajorAxis());
    }

    // checks to make the input amountis valid then increases the size
    @Override
    public void scaleUp(double increaseAmount) {
        double newValue = Helper.percentageIncrease(getMajorAxis(), increaseAmount);
        setRadius(newValue);
    }

    // checks to see if the increase amount is valid then decreases the size
    @Override
    public void scaleDown(double decreaseAmount) {
        double newValue = Helper.percentageDecrease(getMajorAxis(), decreaseAmount);
        setRadius(newValue);
    }


}
