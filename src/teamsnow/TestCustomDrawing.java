/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamsnow;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Troy
 */
public class TestCustomDrawing {
    
    private static String foo;
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
           public void run() {
               createGUI();
           } 
        });
    }
    
    public static void createGUI() {
        JFrame foo = new JFrame("8/3 - Testing Out In-Class Methods");
        foo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String s = createTest();
        foo.add(new MyPanel(s));
        foo.pack();
        foo.setVisible(true);
    }
    
    public static String createTest() {
        String s = "";
        s += "Hello world!";
        Date date = new Date();
        s += "\nThe current time is: "+date.getTime()+"\n";
        SimpleDateFormat f = new SimpleDateFormat("MM-dd-yyyy', and currently it is 'HH:mm:ss z");
        String suh = f.format(date);
        s += "For readability, the date is: "+suh+"";
        
        return s;
    }
}
