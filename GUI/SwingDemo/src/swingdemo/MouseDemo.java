/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swingdemo;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JFrame;

/**
 *
 * @author akats
 */
public class MouseDemo {
    public static void main(String[] args) {
         Xyz obj = new Xyz();
    }
}


class Xyz extends JFrame{
    public Xyz(){
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                int x = e.getX();
                int y = e.getY();
                System.out.println(x + " , " + y);
            }
        });
        
        setLayout(new FlowLayout()); // Flow Layout, Grid Layout, null layout, Card layout
        setVisible(true); // Set Visible 
        setSize(400, 400); // Set Size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}