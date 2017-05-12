package Assignment;

import javax.swing.*;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import java.awt.*;
import java.util.*;
import java.awt.event.*;


public class CE203_2016_Ex2 {
    ArrayList<String> wordList = new ArrayList<String>();
//make jframe where buttons, text and textfield will be
    public CE203_2016_Ex2 (){
        JFrame body = new JFrame();
        body.setLayout(new BorderLayout());
        body.setTitle("Exercise 2");
        body.setSize(600,600);

        JButton butAdd = new JButton("Add");
        JButton butSL = new JButton("Begin with specific letter");
        JButton butSearch = new JButton("Search");
        JButton butROne = new JButton("Remove first occurrence");
        JButton butRAll = new JButton("Remove all occurrences");
        JButton butClear = new JButton("Clear list");
        JTextField tfWord = new JTextField("");
        JLabel lText = new JLabel("Oluwatosin Jordan Ogungbo, 1505673");


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3,6,5,5));
        mainPanel.add(butAdd);
        mainPanel.add(butSL);
        mainPanel.add(butSearch);
        mainPanel.add(butROne);
        mainPanel.add(butRAll);
        mainPanel.add(butClear);

//move objects into places on jframe
        body.add(mainPanel, BorderLayout.NORTH);
        body.add(tfWord, BorderLayout.SOUTH);
        body.add(lText , BorderLayout.CENTER);
        body.setVisible(true);
        body.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//add code to do things to the text the user enters
        butAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tfWord.getText().matches("^[a-zA-Z]+$")) {
                    wordList.add(tfWord.getText());
                }else {
                    lText.setText("Sorry but "+ tfWord.getText() + " is not a word");
                }
            }
        });

        butSL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        butSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = wordList.size();
                int occ = Collections.frequency(wordList, tfWord.getText());
                lText.setText("The word occurs " + occ + " times");

                if (occ==0){
                    lText.setText("The word "+ tfWord.getText() +" hasn't been added. The total amount of words are: "+ x);
                }
            }
        });

        butROne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        butRAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wordList.removeAll(Collections.singleton(tfWord.getText()));
            }
        });


        butClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wordList.clear();
            }
        });

    }
    public static void main(String[] args) {

        new CE203_2016_Ex2();
    }
}
