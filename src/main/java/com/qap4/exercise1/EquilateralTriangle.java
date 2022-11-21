package com.qap4.exercise1;

public class EquilateralTriangle implements Triangle {


    private  double side_length;
    private String colour;
    private   boolean isFilled;


    // constructor Equilateral Triangle

    public EquilateralTriangle( String colour, boolean isFilled, double side_length) {
        this.side_length = side_length;
        this.colour = colour;
        this.isFilled = isFilled;
    }

    // only need to set One side for a Equilateral Triangle
    public void setSide_length(double side_length) {
        this.side_length = side_length;
    }

    @Override
    public ShapeName getName() {
        return ShapeName.EQUILATERAL_TRIANGLE;
    }

    @Override
    public String getColour() {
        return this.colour;
    }

    @Override
    public boolean isFilled() {
        return isFilled;
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
    public double getSideOneLength() {
        return this.side_length;
    }

    @Override
    public double getSideTwoLength() {
        return this.side_length;
    }

    @Override
    public double getSideThreeLength() {
        return this.side_length;
    }


    // Area of A Equilateral Triangle
    @Override
    public double getArea() {
        double side = getSideOneLength();
        return ((Math.sqrt(3) / 4) *  Math.pow(side, 2));
    }

    // Perimeter Equilateral Triangle
    @Override
    public double getPerimeter() {
        return (getSideOneLength() * 3);
    }

    // since all the sides are the same return is used

}
