package com.qap4.exercise1;

public interface Shape extends Scalable {
    // Interface to handle shape details for all shapes
    ShapeName getName();
    String getColour();
   boolean isFilled();

  void setColour(String colour);
  void setFilled(boolean filled);
  double getArea();
  double getPerimeter();

}
