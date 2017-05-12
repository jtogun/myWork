package Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CE203_2016_Ex1 {
// code below will create all the necessary objects including the buttons, text fields, labels and the frame
    public CE203_2016_Ex1() {
        JFrame body = new JFrame();
        body.setLayout(new BorderLayout());
        body.setTitle("Exercise 1");
        body.setSize(500, 400);

        JButton butGenerate = new JButton("Generate");
        JButton butReset = new JButton("Reset");
        JTextField tfR = new JTextField(3);
        JTextField tfG = new JTextField(3);
        JTextField tfB = new JTextField(3);
        JLabel lInfo = new JLabel("CE203 Assignment 1, submitted by Oluwatosin Jordan Ogungbo, 1505673");

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(1, 4, 10, 0));
        controlPanel.add(tfR);
        controlPanel.add(tfG);
        controlPanel.add(tfB);
        controlPanel.add(butGenerate);

        body.add(butReset, BorderLayout.NORTH);
        body.add(controlPanel, BorderLayout.SOUTH);
        body.setVisible(true);
        body.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel text = new JPanel();
        text.setLayout(new GridLayout(0, 1));
        text.add(lInfo);
        lInfo.setForeground(Color.red);
        lInfo.setFont(new Font("Ariel", Font.PLAIN, 14));
        body.add(text, BorderLayout.CENTER);

// after the objects have been made, code is added to make the do stuff
        try {

            butReset.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tfR.setText("");
                    tfG.setText("");
                    tfB.setText("");
                    lInfo.setForeground(Color.red);
                    lInfo.setText("CE203 Assignment 1, submitted by Oluwatosin Jordan Ogungbo, 1505673");
                }
            });
//above code is for the reset button when clears all texts and changes the text to the original one
            butGenerate.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String tR = tfR.getText();
                    int R = Integer.parseInt(tR);

                    String tG = tfG.getText();
                    int G = Integer.parseInt(tG);

                    String tB = tfB.getText();
                    int B = Integer.parseInt(tB);

                    lInfo.setText("Oluwatosin Jordan Ogungbo, 1505673");

                    if (R < 0) {
                        tfR.setText("200");
                        R = 200;
                    } else if (R > 255) {
                        tfR.setText("255");
                        R = 255;
                    }

                    if (G < 0) {
                        tfG.setText("200");
                        G = 200;
                    } else if (G > 255) {
                        tfG.setText("255");
                        G = 255;
                    }
                    if (B < 0) {
                        tfB.setText("200");
                        B = 200;
                    } else if (B > 255) {
                        tfB.setText("255");
                        B = 255;
                    }

                    lInfo.setForeground(new Color(R, G, B));
                }
            });

//above code is to change the color of the text also making sure that no number below 0 or above 255 is entered
        } catch(Exception e){}

    }



    public static void main(String[] args) {
        new CE203_2016_Ex1();
    }
}


