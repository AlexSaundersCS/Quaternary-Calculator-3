package com.example.quarternarycalc.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CalculatorUI extends JFrame implements ActionListener {
    JButton btnAdding,
            btnSubtracting,
            btnDividing,
            btnMultiplying,
            btnClear,
            btnDelete,
            btnEquals,
            btnSquareroot,
            btnSquare,
            btnZero,
            btnOne,
            btnTwo,
            btnThree;
    JTextField output;
    CalculatorController controller;

    public CalculatorUI(){
        super("Quarternary Calculator");
        controller = new CalculatorController();
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
        btnZero = new JButton("0");
        btnOne = new JButton("1");
        btnTwo = new JButton("2");
        btnThree = new JButton("3");


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
        btnZero.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 120));
        btnOne.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 120));
        btnTwo.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 120));
        btnThree.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 120));

        output.addActionListener(this);
        btnDelete.addActionListener(this);
        btnDividing.addActionListener(this);
        btnAdding.addActionListener(this);
        btnMultiplying.addActionListener(this);
        btnClear.addActionListener(this);
        btnSubtracting.addActionListener(this);
        btnEquals.addActionListener(this);
        btnSquareroot.addActionListener(this);
        btnSquare.addActionListener(this);
        btnZero.addActionListener(this);
        btnOne.addActionListener(this);
        btnTwo.addActionListener(this);
        btnThree.addActionListener(this);


        //styles the display of the output
        output.setMaximumSize(new Dimension(500, 150));
        output.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 100));
        output.setEditable(false);
        output.addActionListener(this);

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
        row3.add(btnZero);
        row3.add(btnOne);
        row3.add(btnTwo);
        row3.add(btnThree);

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
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() ==btnDelete ){
            controller.handleDelete();
        }if(e.getSource() ==btnDividing ){
            controller.handleBinaryOperationPressed(CalcOperation.Divide);
            output.setText(controller.getNumber2().toString().replace(",", "")  //remove the commas
                    .replace("[", "")  //remove the right bracket
                    .replace("]", "")  //remove the left bracket
                    .trim());
        }
        if(e.getSource() ==btnAdding ){
            controller.handleBinaryOperationPressed(CalcOperation.Add);
            output.setText(controller.getNumber2().toString()
                    .replace(",", "")  //remove the commas
                    .replace("[", "")  //remove the right bracket
                    .replace("]", "")  //remove the left bracket
                    .trim());
        }
        if(e.getSource() ==btnMultiplying ) {
            controller.handleBinaryOperationPressed(CalcOperation.Multiply);
            output.setText(controller.getNumber2().toString().replace(",", "")  //remove the commas
                    .replace("[", "")  //remove the right bracket
                    .replace("]", "")  //remove the left bracket
                    .trim());
        }
        if(e.getSource() ==btnSubtracting ) {
            controller.handleBinaryOperationPressed(CalcOperation.Subtract);
            output.setText(controller.getNumber2().toString().replace(",", "")  //remove the commas
                    .replace("[", "")  //remove the right bracket
                    .replace("]", "")  //remove the left bracket
                    .trim());
        }
        if(e.getSource() ==btnEquals ) {
            controller.handleEqualPress();
            output.setText(controller.getResult().toString()
                    .replace(",", "")  //remove the commas
                    .replace("[", "")  //remove the right bracket
                    .replace("]", "")  //remove the left bracket
                    .trim());
            System.out.println(controller.getNumber1());
            System.out.println(controller.getOperation());
            System.out.println(controller.getNumber2());
            System.out.println(controller.getResult());
        }
        if(e.getSource() ==btnClear ) {
            controller.handleClear();
        }
        if(e.getSource() ==btnSquare ) {
            controller.handleBinaryOperationPressed(CalcOperation.Exponent);
        }
        if(e.getSource() ==btnSquareroot ){
            controller.handleSquareRootPressed();
        }
        if(e.getSource() ==btnZero ){
            controller.handleNumberPressed(0);
        }
        if(e.getSource() ==btnOne ){
            controller.handleNumberPressed(1);
        }
        if(e.getSource() ==btnTwo ){
            controller.handleNumberPressed(2);
        }
        if(e.getSource() ==btnThree ){
            controller.handleNumberPressed(3);
        }
        if(controller.getOperation() == null && controller.getNumber2().isEmpty()) {
            output.setText(controller.getNumber1().toString()
                    .replace(",", "")  //remove the commas
                    .replace("[", "")  //remove the right bracket
                    .replace("]", "")  //remove the left bracket
                    .trim());
        }
        if(controller.getOperation() != null && controller.getOperation() != CalcOperation.Exponent && controller.getOperation() != CalcOperation.Root  ){
            output.setText(controller.getNumber2().toString()
                    .replace(",", "")  //remove the commas
                    .replace("[", "")  //remove the right bracket
                    .replace("]", "")  //remove the left bracket
                    .trim());
        }if(controller.getOperation() != null && !controller.getResult().isEmpty()){
            output.setText(controller.getResult().toString()
                    .replace(",", "")  //remove the commas
                    .replace("[", "")  //remove the right bracket
                    .replace("]", "")  //remove the left bracket
                    .trim());
        }

    }

    public static void main(String[] arg){
        new CalculatorUI();
    }


}
