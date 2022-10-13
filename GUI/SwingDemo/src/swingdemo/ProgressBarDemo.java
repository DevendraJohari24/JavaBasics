/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swingdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.Timer;

/**
 *
 * @author akats
 */
public class ProgressBarDemo {
    public static void main(String[] args) {
        X obj = new X();
        
    }
}


class X extends JFrame implements ActionListener{
    int i;
    JButton b;
    JProgressBar p;
    Timer t;
    public X(){
         b = new JButton("Add Form");
         p = new JProgressBar(0, 20);
        i=0;
        t = new Timer(100, this);
        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                   t.start();
            }
        });
        
        add(b);
        add(p);
        
        setLayout(new FlowLayout()); // Flow Layout, Grid Layout, null layout, Card layout
        setVisible(true); // Set Visible 
        setSize(400, 400); // Set Size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(i==20){
                    new Addition();
                    dispose();
               }
          i++;
          p.setValue(i);
    }
}