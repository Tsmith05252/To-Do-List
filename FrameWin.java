package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

//this class creates the window and the buttons

public class FrameWin extends JFrame{


   JButton addButton = new JButton ("Add Task");
   JButton deleteButton = new JButton("Delete Task");

    JLabel message = new JLabel("This purpose of this program is to create a simple to do list application ");

    JList list = new JList();

    FrameWin(){

    // Default Constructor

    }


    public void createAndShowGui(){
        // this method create the content in the main window

        // create the frame
        JFrame window = new JFrame("To-Do-List");
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);

        window.setLocationRelativeTo(null);
        window.pack();

        // create the panel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // create the components and set them within the panel

        JTextField textField = new JTextField(20);
        textField.setBounds(100, 20, 165, 25);

        panel.add(addButton);
        panel.add(deleteButton);
        panel.add(textField);


        window.getContentPane().add(panel, "Center");

        // show the frame with everything in it (panel + components included)
        window.setSize(400, 300);
        window.setVisible(true);

    } //end the CreateAndShowGui method

    


} // end the FrameWin Class


