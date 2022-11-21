package com.qap4.exercise1;

import java.util.ArrayList;
import java.util.List;

public class ShapeMain {

    public static void main(String[] args){
        List<Shape> shapes = new ArrayList<>();
        shapes.add(ShapeFactory.createTriangle("Blue", false, 5, 5,5));
        shapes.add(ShapeFactory.createTriangle("Red", true, 7 ,7,10));
        shapes.add(ShapeFactory.createTriangle("Green", false, 5,4,3));

        System.out.println("Display Shapes in List");

        for(Shape s : shapes){
            ShapeName name = s.getName();
            String colour = s.getColour();
            boolean filled = s.isFilled();
            double area = s.getArea();
            double perimeter = s.getPerimeter();
            System.out.println(String.format("Shape Name: %s Colour: %s  Shape is filled: %b \n Area: is %.2f \n Perimeter: is %.2f ",
                    name.name(), colour, filled, area, perimeter ));
        }
     }

}
