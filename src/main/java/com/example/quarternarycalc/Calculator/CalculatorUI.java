package com.example.quarternarycalc.Calculator;

import javax.swing.*;
import java.awt.*;
public class CalculatorUI extends JFrame {
    JButton btnAdding,
            btnSubtracting,
            btnDividing,
            btnMultiplying,
            btnClear,
            btnDelete,
            btnEquals,
            btnSquareroot,
            btnSquare;
    JButton numBtn[];
    JTextField output;


    public CalculatorUI(){
        super("Quarternary Calculator");
        JPanel mainPanel = new JPanel();

        // Creates the rows needed for calculator, only need 4 rows
        JPanel row1 = new JPanel();
        JPanel row2 = new JPanel();
        JPanel row3 = new JPanel();
        JPanel row4 = new JPanel();

        //Creates the non number Buttons
        output = new JTextField(10);
        btnDelete = new JButton("Del");
        btnDividing = new JButton("÷");
        btnAdding = new JButton("+");
        btnMultiplying = new JButton("*");
        btnClear = new JButton("AC");
        btnSubtracting = new JButton("-");
        btnEquals = new JButton("=");
        btnSquareroot = new JButton("√");
        btnSquare = new JButton("^2");


        //needs to add action listeners/action performed to buttons to make them function
        //initializes the number buttons
        numBtn = new JButton[13];
        for (int count = 0; count < numBtn.length - 1; count++) {
            numBtn[count] = new JButton(String.valueOf(count));
            numBtn[count].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 120));
        }

        //styles other buttons with font and size
        btnClear.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 100));
        btnDividing.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 100));
        btnSubtracting.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 100));
        btnEquals.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 100));
        btnMultiplying.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 100));
        btnDelete.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 100));
        btnAdding.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 100));
        btnSquareroot.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 100));
        btnSquare.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 100));


        //styles the display of the output
        output.setMaximumSize(new Dimension(500, 150));
        output.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 100));
        output.setText(" ");

        //layout of each row and sets the row, can be moved around
        row1.setLayout(new BoxLayout(row1, BoxLayout.LINE_AXIS));
        row2.setLayout(new BoxLayout(row2, BoxLayout.LINE_AXIS));
        row3.setLayout(new BoxLayout(row3, BoxLayout.LINE_AXIS));
        row4.setLayout(new BoxLayout(row4, BoxLayout.LINE_AXIS));

        //add buttons to the row
        row1.add(btnClear);
        row1.add(btnDelete);
        row1.add(btnSquareroot);
        row1.add(btnSquare);
        row2.add(btnAdding);
        row2.add(btnSubtracting);
        row2.add(btnMultiplying);
        row2.add(btnDividing);
        row2.add(btnEquals);
        row3.add(numBtn[0]);
        row3.add(numBtn[1]);
        row3.add(numBtn[2]);
        row3.add(numBtn[3]);

        //adds output and the rows to Panel
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        mainPanel.add(output);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        mainPanel.add(row1);
        mainPanel.add(row2);
        mainPanel.add(row3);
        mainPanel.add(row4);


        this.add(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ends program once calculator is closed
        this.setVisible(true); //makes it visible
        this.setSize(660, 700);//sets size

    }

    public static void main(String[] arg){
        new CalculatorUI();




    }

}
