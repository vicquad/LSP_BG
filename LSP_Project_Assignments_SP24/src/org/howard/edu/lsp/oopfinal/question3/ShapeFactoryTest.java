package org.howard.edu.lsp.oopfinal.question3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShapeFactoryTest {
    @Test
    public void testCreateCircle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape("circle");
        assertNotNull(circle);
        assertTrue(circle instanceof Circle);
    }

    @Test
    public void testCreateRectangle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.createShape("rectangle");
        assertNotNull(rectangle);
        assertTrue(rectangle instanceof Rectangle);
    }
}
