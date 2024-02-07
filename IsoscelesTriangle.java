/*
 * CMSC 330 Project 1
 * @author natalievogel
 * 9/10/2023
 * IsoscelesTriangle.java
 * 
 * subclass of SolidPolygon
 * creates isosceles triangle with color, point, height, and width in scene file
 * 
 */

// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// August 2021

import java.awt.*;

// Class that defines a filled IsoscelesTriangle ...
class IsoscelesTriangle extends SolidPolygon {

    // Constructor that initializes the vertices of the IsoscelesTriangle ...
    public IsoscelesTriangle(Color color, Point upperLeft, int height, int width) {
        super(color, 3);
        int[] x_points = {upperLeft.x, upperLeft.x - width/2, upperLeft.x + width/2};
        int[] y_points = {upperLeft.y, upperLeft.y + height, upperLeft.y + height};
        createPolygon(x_points, y_points);
    }
}
