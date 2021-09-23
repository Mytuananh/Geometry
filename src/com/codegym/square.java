package com.codegym;

public class square extends Rectangle {
    private double side = 1.0;

    public square() {
    }

    public square(double side) {
        super(side, side);
    }

    public square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public void setWidth(double with) {
        setSide(with);
    }
    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A square with side = " + getSide() + " ,which is subclass of " + super.toString();
    }
}
