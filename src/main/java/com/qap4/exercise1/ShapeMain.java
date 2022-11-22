package com.qap4.exercise1;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class ShapeMain {

    public static void main(String[] args){
        List<Shape> shapes = new ArrayList<>();
        shapes.add(ShapeFactory.createTriangle("Blue", false, 5, 5,5));
        shapes.add(ShapeFactory.createTriangle("Red", true, 7 ,7,10));
        shapes.add(ShapeFactory.createTriangle("Green", false, 5,4,3));
        // this will test the validation on ellipse to automatic change the numbers around for the axis
        shapes.add(ShapeFactory.circularFactory("Teal", false, 20 , 25));
        shapes.add(ShapeFactory.circularFactory("Teal", true, 25 , 20));
        shapes.add(ShapeFactory.circularFactory("Red", true, 15));

        System.out.println("Display Shapes in List");

        for(Shape s : shapes){
            ShapeName name = s.getName();
            String colour = s.getColour();
            boolean filled = s.isFilled();
            double area = s.getArea();
            double perimeter = s.getPerimeter();
            double scaleUpAmount = 25.5;
            double scaleDownAmount = 10.25;
            System.out.println();
            System.out.println(String.format("Shape Name: %s Colour: %s  Shape is filled: %b \n Area: is %.2f \n Perimeter: is %.2f ",
                    name.name(), colour, filled, area, perimeter ));
            System.out.println();
            System.out.println("Scaled Up Results");
            System.out.println();
            System.out.println("Scale up " + scaleUpAmount + "%");
            s.scaleUp(scaleUpAmount);
            area = s.getArea();
            perimeter = s.getPerimeter();
            System.out.println(String.format("Shape Name: %s Colour: %s  Shape is filled: %b \n Area: is %.2f \n Perimeter: is %.2f ",
                    name.name(), colour, filled, area, perimeter ));
            System.out.println();
            System.out.println("Scaled Down Results");
            System.out.println();
            System.out.println("Scale Down " + scaleDownAmount + "%");
            s.scaleDown(scaleDownAmount);
            area = s.getArea();
            perimeter = s.getPerimeter();
            System.out.println(String.format("Shape Name: %s Colour: %s  Shape is filled: %b \n Area: is %.2f \n Perimeter: is %.2f ",
                    name.name(), colour, filled, area, perimeter ));

        }

     }

}
