package com.qap4.exercise1;

public class ShapeFactory {

    private Helper validator;

   // this is the triangle factory
    public static Triangle createTriangle( String colour, boolean filled, double side1, double side2, double side3){
      boolean check;
      // check to make sure valid triangle
      check =  Helper.isValidTriangle(side1, side2, side3);

      if(!check){
          throw new IllegalArgumentException("Error invalid Triangle sides input");
      }
        // checking to see what type of triangle to create based on checking the sides.

      if(side1 == side2 && side2 == side3){
          return new EquilateralTriangle(colour, filled, side1);
      } else if (side1 == side2 || side2 == side3 || side1 == side3){

         if(side1 == side2){
                return  new IsoscelesTriangle(colour, filled, side3, side1);
        }
         else if(side2 == side3){
                return  new IsoscelesTriangle(colour, filled, side1, side2);
             }else{
                return  new IsoscelesTriangle(colour,filled, side2, side3);
         }
      }else{
          return  new ScaleneTriangle(colour, filled, side1,side2,side3);
      }

    }
}
