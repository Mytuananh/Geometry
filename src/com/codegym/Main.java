package com.codegym;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        shape shape = new shape();
        System.out.println(shape);

        shape shape1 = new shape("red", false);
        System.out.println(shape1);

        square square = new square();
        System.out.println(square);

        square square1 = new square(2.5);
        System.out.println(square1);
    }
}
