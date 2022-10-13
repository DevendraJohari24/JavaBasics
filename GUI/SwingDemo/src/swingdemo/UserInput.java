/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swingdemo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author akats
 */
public class UserInput {
    public static void main(String[] args) {
         RadioDemo obj = new RadioDemo();
    }
 
}

class RadioDemo extends JFrame{
    JTextField t1;
    JButton b;
    JRadioButton r1, r2;
    JLabel l;
    JCheckBox c1, c2;
    
    public RadioDemo(){
        t1 = new JTextField(25);
        b = new JButton("Ok");
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        l = new JLabel("Greeting");
        c1 = new JCheckBox("Dancing");
        c2 = new JCheckBox("Singing");
        ButtonGroup bg = new ButtonGroup();
        
        bg.add(r1);
        bg.add(r2);
        
        add(t1);
        add(b);
        add(r1);
        add(r2);
        add(c1);
        add(c2);
        add(b);
        add(l);
        
        c1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                System.out.println("Dancer");
            }
        });
        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String name = t1.getText();
                if(r1.isSelected()){
                    name = "Mr. " + name;
                }else{
                    name = "Mrs. " + name;
                }
                
                if(c1.isSelected() && c2.isSelected()){
                    name = name + " is Dancer & Singer";
                    
                }  else if(c1.isSelected()){
                    name = name + " is Dancer";
                }else if(c2.isSelected()){
                    name = name + " is Singer";
                }
                 
   
                l.setText(name);
            }
        });
        setLayout(new FlowLayout()); // Flow Layout, Grid Layout, null layout, Card layout
        setVisible(true); // Set Visible 
        setSize(400, 400); // Set Size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}