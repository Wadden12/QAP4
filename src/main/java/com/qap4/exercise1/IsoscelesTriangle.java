package com.qap4.exercise1;

public class IsoscelesTriangle implements Triangle {

    private  double baseLength;
    private double equalSidesLength;
    private String colour;
    private   boolean filled;

    // constructor for Isosceles Triangle
    public IsoscelesTriangle( String colour, boolean isFilled, double baseLength, double equalSidesLength) {
        if(baseLength == equalSidesLength){
            throw new IllegalArgumentException(String.format("Base length and equal side length can't be equal for Isosceles Triangles! Got: base_length: %d, equal_sides: %d", baseLength, equalSidesLength));
        }
        this.baseLength = baseLength;
        this.equalSidesLength = equalSidesLength;
        this.colour = colour;
        this.filled = isFilled;
    }


    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }

    public void setEqualSidesLength(double equalSidesLength) {
        this.equalSidesLength = equalSidesLength;
    }

    @Override
    public ShapeName getName() {
        return ShapeName.ISOSCELES_TRIANGLE;
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
        return this.equalSidesLength;
    }

    @Override
    public double getSideTwoLength() {
        return this.equalSidesLength;
    }

    @Override
    public double getSideThreeLength() {
        return this.baseLength;
    }

    // returns the area of an Isosceles triangles using 3 sides
    @Override
    public double getArea() {
        double base = getSideThreeLength();
        double equalSide = getSideOneLength();
        double section = (Math.pow(equalSide,2) - Math.pow(base,2)/4);
        return 0.5 * (Math.sqrt(section) * base);
    }

    // Perimeter of Isosceles triangle
    @Override
    public double getPerimeter() {
        return (getSideOneLength() + getSideTwoLength() + getSideThreeLength());
    }



}
