package calculator;


import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.util.Arrays;

public class Calculator extends JFrame {
    static JTextField equationTextField;
    private JPanel textFieldPanel;
    private JPanel buttonPanel;

    public Calculator() {
        super("Calculator");
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        createTextFieldPanel();
        createButtonPanel();

        add(equationTextField);
        add(buttonPanel);

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void createTextFieldPanel() {
        equationTextField = new JTextField();
        equationTextField.setName("EquationTextField");
        equationTextField.setBounds(50, 20, 200, 50);
    }

    private void createButtonPanel() {

        CalculatorButton b0 = new CalculatorButton("0", "Zero");
        ///CalculatorButton b1 = new CalculatorButton("1", "One");
        CalculatorButton b2 = new CalculatorButton("2", "Two");
        CalculatorButton b3 = new CalculatorButton("3", "Three");
        CalculatorButton b4 = new CalculatorButton("4", "Four");
        CalculatorButton b5 = new CalculatorButton("5", "Five");
        CalculatorButton b6 = new CalculatorButton("6", "Six");
        CalculatorButton b7 = new CalculatorButton("7", "Seven");
        CalculatorButton b8 = new CalculatorButton("8", "Eight");
        CalculatorButton b9 = new CalculatorButton("9", "Nine");

        CalculatorButton bAdd = new CalculatorButton("+", "Add");
        CalculatorButton bSubtract = new CalculatorButton("-", "Subtract");
        CalculatorButton bMultiply = new CalculatorButton("x", "Multiply");
        CalculatorButton bDivide = new CalculatorButton("/", "Divide");

        CalculatorButton bEqual = new CalculatorButton("=", "Equals");
        JButton hiddenButton = new JButton();
        hiddenButton.setVisible(false);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));

        buttonPanel.add(b7);
        buttonPanel.add(b8);
        buttonPanel.add(b9);
        buttonPanel.add(bDivide);

        buttonPanel.add(b4);
        buttonPanel.add(b5);
        buttonPanel.add(b6);
        buttonPanel.add(bMultiply);


        JButton b1 = new JButton("1");
        b1.setName("One");
        b1.addActionListener(e -> {
            Calculator.equationTextField.setText(Calculator.equationTextField.getText() + "1");
        });
        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(bAdd);

        buttonPanel.add(hiddenButton);
        buttonPanel.add(b0);
        buttonPanel.add(bEqual);
        buttonPanel.add(bSubtract);

        buttonPanel.setBounds(10, 100, 270, 250);
    }
}


