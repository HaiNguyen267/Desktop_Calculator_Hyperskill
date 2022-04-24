package calculator;


import javax.swing.*;
import java.awt.event.ActionEvent;

public class CalculatorButton extends JButton {
    private String symbol;

    public CalculatorButton(String symbol, String buttonName) {
        super(symbol);
        this.symbol = symbol;
        setName(buttonName);
        addActionListener(this::performAction);
    }

    private void performAction(ActionEvent e) {
        String text = getTextFromTextField();
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        if (!symbol.equals("=")) {
            setTextForTextField(text + symbol);
        } else {
            int result = calculate(text);
            setTextForTextField(String.format("%s = %d", text, result));
        }
    }


    private String getTextFromTextField() {
        return Calculator.equationTextField.getText();
    }

    private void setTextForTextField(String text) {
        Calculator.equationTextField.setText(text);
    }

    private int calculate(String input) {
        String[] parts = input.split("[+\\-x/]");
        int first = Integer.parseInt(parts[0]);
        int second = Integer.parseInt(parts[1]);

        char operation = input.charAt(parts[0].length()); // the operation symbol is right after the first number

        int result = 0;

        switch (operation) {
            case '+': result = first + second; break;
            case '-': result = first - second; break;
            case 'x': result = first  * second; break;
            case '/': result = first / second; break;
        }

        return result;
    }
}


