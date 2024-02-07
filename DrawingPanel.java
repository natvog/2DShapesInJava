/*
 * CMSC 330 Project 1
 * @author natalievogel
 * 9/10/2023
 * DrawingPanel.java
 * 
 * panel for all images
 * 
 */

// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// August 2021

import java.awt.*;
import java.util.*;
import javax.swing.*;

// Class that defines the panel for drawing the images

@SuppressWarnings("serial")

class DrawingPanel extends JPanel {

    private ArrayList<Image> images = new ArrayList<>();

    // Adds a graphic object to the drawing panel

    public void addImage(Image image) {

        images.add(image);
      }

    // Draws all the images on the drawing panel

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        for (Image image : images)
            image.draw(graphics);
    }
}
