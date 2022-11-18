package com.qap4.exercise1;

public class CreateTriangle implements TriangleInterface{

    private Triangle triangle;

    // this return a tag of the type of triangle it is based on its sides.
    @Override
    public ShapeName getTriangle(double sideA, double sideB, double sideC) {

        if(sideA == sideB && sideA == sideC && sideB == sideC) {
            return ShapeName.EQUILATERAL_TRIANGLE;

        }else if (sideA != sideB && sideA !=sideC && sideB != sideC){
            return ShapeName.SCALENE_TRIANGLE;

        } else return ShapeName.ISOSCELES_TRIANGLE;
    }
    // valid triangle check
    @Override
    public boolean isValidTriangle(double sideA, double sideB, double sideC) {
        if(sideA < 0 || sideB < 0 || sideC < 0) return false;

        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideA <= sideA)
            return true;
        else
            return false;

    }

    @Override
    public Triangle createTriangles(String colour, boolean filled, double sideA, double sideB, double sideC) {
        boolean check = isValidTriangle(sideA,sideB,sideC);
        if(!check){
            throw new IllegalArgumentException("Error invalid Triangle sides input");
        }

        ShapeName name = getTriangle(sideA,sideB,sideC);
        if (name.equals(ShapeName.EQUILATERAL_TRIANGLE)) {
            triangle = new EquilateralTriangle(name,colour,filled,sideA,sideB,sideC);
        } else if (name.equals(ShapeName.ISOSCELES_TRIANGLE)) {
            triangle = new IsoscelesTriangle(name, colour,filled, sideA,sideB,sideC);

        } else if (name.equals(ShapeName.SCALENE_TRIANGLE)) {
            triangle = new ScaleneTriangle(name, colour, filled, sideA,sideB,sideC);

        } else{
            throw new IllegalArgumentException("Invalid Triangle Class");
        }

        return triangle;
    }
}
