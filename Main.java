package com.company;

//create a gui to do list and save it to a file

import javax.swing.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;


public class Main extends FrameWin  {

        public static void main(String[] args) {
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    // run and display the program
                    FrameWin open = new FrameWin();
                    open.createAndShowGui();

                }
            });

        }





}
