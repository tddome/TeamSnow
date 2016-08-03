/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamsnow;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import java.awt.Graphics2D;
import java.awt.RenderingHints;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

/**
 *
 * @author Troy
 */
public class MyPanel extends JPanel {
    private String bar;
    private int squareX = 65;
    private int squareY = 65;
    private int squareW = 35;
    private int squareH = 35;
    
    public MyPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
        
        
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                moveSquare(e.getX(),e.getY());
            }
        });
        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                moveSquare(e.getX(),e.getY());
            }
        });
    }
    
    public MyPanel(String s) {
        setBorder(BorderFactory.createLineBorder(Color.black));
        bar = s;
        
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                moveSquare(e.getX(),e.getY());
            }
        });
        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                moveSquare(e.getX(),e.getY());
            }
        });
    }
    
    private void moveSquare(int x, int y) {
        int OFFSET = 1;
        if((squareX!=x) || (squareY!=y)) {
            repaint(squareX,squareY,squareW+OFFSET,squareH+OFFSET);
            squareX=x;
            squareY=y;
            repaint(squareX,squareY,squareW+OFFSET,squareH+OFFSET);
        }
    }
    
    public Dimension getPreferredSize() {
        return new Dimension(660, 250);
    }
    
    private void drawString(Graphics g, String text, int x, int y) {
        for (String line : text.split("\n"))
            g.drawString(line, x, y += g.getFontMetrics().getHeight());
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Font font = new Font("Chiller", Font.BOLD, 24);
        Graphics2D g2 = (Graphics2D) g;
        
        //once used, make a shape since it's safe to
        g.setColor(Color.BLUE);
        g.fillRect(squareX,squareY,squareW,squareH);
        g.setColor(Color.BLACK);
        g.drawRect(squareX,squareY,squareW,squareH);
        
        //write with new font
        g2.setFont(font);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        if(bar == null)
            g2.drawString("Hiya", 10, 100);
        else
            drawString(g2, bar, 10, 100);
        
        /*Draw text
        if(bar == null)
            g.drawString("This is my custom panel!",10,100);
        else
            g.drawString(bar,10,100);
        */
    }
}
