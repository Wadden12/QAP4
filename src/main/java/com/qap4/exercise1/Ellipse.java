package com.qap4.exercise1;

public class Ellipse implements CircularShapes{

    String colour;
    boolean isFilled;
    double majorAxis;
    double minorAxis;
    final double PI = Math.PI;

    public Ellipse(String colour, boolean isFilled, double majorAxis, double minorAxis) {
        if(majorAxis == minorAxis){
            throw new IllegalArgumentException(String.format(
                    "The Major and Minor axis can not be equal for a Ellipse that would make it a Circle! Got: major axis: %d, minor axis: %d", majorAxis, minorAxis));
        }
        this.colour = colour;
        this.isFilled = isFilled;
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    public void setMajorAxis(double majorAxis) {
        this.majorAxis = majorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        this.minorAxis = minorAxis;
    }

    @Override
    public double getMinorAxis() {
        return  this.minorAxis;
    }

    @Override
    public double getMajorAxis() {
        return this.majorAxis;
    }

    @Override
    public ShapeName getName() {
        return ShapeName.ELLIPSE;
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

    @Override
    public double getArea() {
        return (PI * getMajorAxis() * getMinorAxis());
    }

    @Override
    public double getPerimeter() {
        double a = getMajorAxis();
        double b = getMinorAxis();
        double e1 = 2 * (Math.pow(a,2 ) + Math.pow(b, 2));
        double e2 = Math.pow((a-b),2)/2;
        return (PI * Math.sqrt(e1 - e2));
    }

    @Override
    public void scaleUp(double increaseAmount) {

        double newMajorAxis = Helper.percentageIncrease(getMajorAxis(), increaseAmount);
        double newMinorAxis = Helper.percentageIncrease(getMinorAxis(), increaseAmount);

        setMajorAxis(newMajorAxis);
        setMinorAxis(newMinorAxis);

    }

    @Override
    public void scaleDown(double decreaseAmount) {
        double newMajorAxis = Helper.percentageDecrease(getMajorAxis(),decreaseAmount);
        double newMinorAxis = Helper.percentageDecrease(getMinorAxis(), decreaseAmount);
        setMajorAxis(newMajorAxis);
        setMinorAxis(newMinorAxis);

    }
}
