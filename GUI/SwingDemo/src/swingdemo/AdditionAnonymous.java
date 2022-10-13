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
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author akats
 */
public class AdditionAnonymous {
    public static void main(String[] args) {
        AddGUI obj = new AddGUI();
    }
}

class AddGUI extends JFrame{
    JTextField t1, t2;
    JButton b;
    JLabel l;
    
    public AddGUI(){
         t1 = new JTextField(20);
         t2 = new JTextField(20);
         b = new JButton("OK");
         l = new JLabel("Result");

        add(t1);
        add(t2);
        add(b);
        add(l);
        
        
        b.addActionListener(ae -> {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());

            int value = num1 + num2;
            l.setText(value + "");
        });
        
        setLayout(new FlowLayout()); // Flow Layout, Grid Layout, null layout, Card layout
        setVisible(true); // Set Visible 
        setSize(400, 400); // Set Size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
   
}
