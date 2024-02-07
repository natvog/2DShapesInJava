/*
 * CMSC 330 Project 1
 * @author natalievogel
 * 9/10/2023
 * Text.java
 * 
 * subclass of Image
 * draws Text to display image
 * 
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

// Abstract class for text

class Text extends Image {
	
	public Point location;
	public String text;

	// Constructor to initialize the color, location, and text to be displayed

	public Text(Color color, Point location, String text) {
		super(color);
		this.location = location;
		this.text = text;
	}

	// Overrides the draw method to display text on the screen

	@Override
	public void draw(Graphics graphics) {
		colorDrawing(graphics);
		graphics.drawString(text, location.x, location.y);
	}

}