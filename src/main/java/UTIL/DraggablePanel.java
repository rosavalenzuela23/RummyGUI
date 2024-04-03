/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTIL;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

/**
 *
 * @author natsu
 */
public class DraggablePanel extends JPanel{
    
    private Point previusPoint;
    private final Point location;
    
    
    public DraggablePanel() {
        super();
        
        this.setBounds(0, 0, 200, 200);
        this.location = new Point(0, 0);
        
        this.addMouseMotionListener(new DragListener());
        this.addMouseListener(new ClickListener());
        
    }
    
    @Override
    public void paint(Graphics g) {
       
        this.setLocation(location);
                        
        super.paintComponent(g);
    }
    
    private class ClickListener extends MouseAdapter {
        
        @Override
        public void mousePressed(MouseEvent evt) {
            previusPoint = evt.getPoint();
        }
        
    }
    
    public void onMouseDragged(MouseEvent evt) {
        Point currentPoint = evt.getPoint();
        
        this.location.translate(
                (int) (currentPoint.getX() - previusPoint.getX() ), 
                (int) (currentPoint.getY() - previusPoint.getY() )
        );
        
        this.repaint();
    }
    
    private class DragListener extends MouseMotionAdapter {
        
        @Override
        public void mouseDragged(MouseEvent evt) {
            onMouseDragged(evt);
        }
        
    }
    
}
