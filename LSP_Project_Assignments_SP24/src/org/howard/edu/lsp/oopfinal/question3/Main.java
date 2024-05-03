package org.howard.edu.lsp.oopfinal.question3;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory(); // Create an instance of the ShapeFactory.

        // Create a circle and draw it.
        Shape c = shapeFactory.createShape("circle");
        c.draw();

        // Create a rectangle and draw it.
        Shape r = shapeFactory.createShape("rectangle");
        r.draw();
    }
}