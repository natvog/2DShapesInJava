/*
 * CMSC 330 Project 1
 * @author natalievogel
 * 9/10/2023
 * RegularPolygon.java
 * 
 * subclass of SolidPolygon
 * creates hexagon shape with color, point, height, width, number of sides, and radius in scene file
 */

import java.awt.*;
import javax.swing.JOptionPane;

//Class that defines a filled RegularPolygon REGULARPOLYGON ...
class RegularPolygon extends SolidPolygon {
	
	// Constructor that initializes the vertices of the RegularPolygon ...
	public RegularPolygon(Color color, Point midPoint, int numSides, int rad) {
		
		super(color, numSides);   // color, num of sides (vertices)
     
		// the amount to rotate for each vertex (in radians)
    	double theta = 2.0 * Math.PI / numSides;

    	// compute x and y coordinates, centered at the origin
    	int[] x_points = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    	int[] y_points = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    	
    	// throw exception and display pop up error if numSides > 10
    	try {
    	for (int i = 0; i < numSides; i++) {
    		double x = midPoint.x + (rad * Math.cos(i * theta));
    		double y = midPoint.y + (rad * Math.sin(i * theta));
    		x_points[i] = (int) Math.round(x);
    		y_points[i] = (int) Math.round(y);
    	}
    	createPolygon(x_points, y_points);
    	} catch (Exception inputError) {
			JOptionPane.showMessageDialog(null, "Invalid Regular Polygon! 10 side limit.", "Error", JOptionPane.ERROR_MESSAGE);
    	}
	}
		
}
