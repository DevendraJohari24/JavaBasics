/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swingdemo;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author akats
 */
public class FirstGUI {
    public static void main(String[] args) {
        Abc obj = new Abc();
       
        
        
    }
}

// Swing all components start with J-> means Java
// JFrame -> class 

class Abc extends JFrame{ // It follows card layout
    public Abc(){
        // Write this code inside Constructor
        JLabel l = new JLabel("Hello World");
        add(l);
        JLabel l1 = new JLabel("Welcome Devendra");
        add(l1);
       
        
        setLayout(new FlowLayout()); // Flow Layout, Grid Layout, null layout, Card layout
        setVisible(true); // Set Visible 
        setSize(400, 400); // Set Size
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}
