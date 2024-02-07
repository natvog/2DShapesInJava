/*
 * CMSC 330 Project 1
 * @author natalievogel
 * 9/10/2023
 * RightTriangle.java
 * 
 * subclass of HollowPolygon
 * creates right triangle with color, point, height, and width in scene file
 * 
 */

// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// August 2021

import java.awt.*;

// Class that defines a hollow right triangle

class RightTriangle extends HollowPolygon {

    // Constructor that initializes the vertices of the right triangle

    public RightTriangle(Color color, Point upperLeft, int height, int width) {
        super(color, 3);
        int[] x_points = {upperLeft.x, upperLeft.x, upperLeft.x + width};
        int[] y_points = {upperLeft.y, upperLeft.y + height, upperLeft.y + height};
        createPolygon(x_points, y_points);
    }
}
