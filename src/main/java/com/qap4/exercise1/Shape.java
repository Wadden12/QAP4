package com.qap4.exercise1;

public  abstract class Shape {
    private ShapeName name;
    private String colour;
    private boolean filled;
    private String stringFilled;

    // constructor

    public Shape() {
        this.name = ShapeName.UNKNOWN;
        this.colour= "Not Available";
        this.filled = false;
    }


    public Shape(ShapeName name, String colour, boolean filled) {
        setName(name);
        setColour(colour);
        setFilled(filled);
    }

//    Getters


    public ShapeName getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public boolean isFilled() {
        return filled;
    }


    //Setters


    public void setName(ShapeName name) {
        this.name = name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    public void stringFilled(){
        if(isFilled()){
            this.stringFilled = "is filled";
        }else{
            this.stringFilled = " is not filled";
        }
    }

    // abstract method to bs used by shape children
    abstract double getPerimeter();

    abstract double getArea();


    @Override
    public String toString(){
        return( "Name: " + this.name +" Colour is  " + this.colour +
                " the shape " + this.stringFilled + " has a Area of " +getArea() + "and a perimeter of " + getPerimeter());
    }


}
