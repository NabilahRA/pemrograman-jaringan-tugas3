/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.tugas3;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

/**
 *
 * @author asus
 */
public class PemjarTugas13 {

    public static void main(String[] args) {
        BufferedImage capture = null;
        int width = 400;
        int height = 400;
        try {
            Robot robo = new Robot();
                         
            robo.delay(1000);             
                         
            capture = robo.createScreenCapture(new Rectangle(100, 100, width, height));
            if (capture != null) {
                canvas panel = new canvas(capture);
                JFrame frame = new JFrame("Test Capture");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(panel);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        } catch (AWTException ex) {
        }
    }
}
