/*
 * CMSC 330 Project 1
 * @author natalievogel
 * 9/10/2023
 * SolidPolygon.java
 * 
 * subclass of Image
 * creates Polygon object and draws filled shapes
 * 
 */

import java.awt.*;

// Class that defines all solid polygons

abstract class SolidPolygon extends Polygon_ {

    // Constructor that calls super constructor

    public SolidPolygon(Color color, int vertexCount) {
        super(color, vertexCount);
    }

    // Draws and fills polygon ...
    
    @Override
    public void drawPolygon(Graphics graphics, Polygon polygon) {
        graphics.drawPolygon(polygon);
		graphics.fillPolygon(polygon);    // fill in color	
    }
}
