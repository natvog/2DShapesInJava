/*
 * CMSC 330 Project 1
 * @author natalievogel
 * 9/10/2023
 * Parallelogram.java
 * 
 * subclass of SolidPolygon
 * creates parallelogram with color, point, height, width and offset in scene file
 * 
 */

import java.awt.*;

//Class that defines a filled Parallelogram ...
class Parallelogram extends SolidPolygon {

 // Constructor that initializes the vertices of the Parallelogram ...
 public Parallelogram(Color color, Point upperLeft, Point lowerRight, int xoffset) {
     super(color, 4);   // color, num of sides (vertices)
     int[] x_points = {upperLeft.x, lowerRight.x + xoffset, lowerRight.x, upperLeft.x - xoffset};
		int[] y_points = {upperLeft.y, upperLeft.y, lowerRight.y, lowerRight.y};
     createPolygon(x_points, y_points);
 }
}
