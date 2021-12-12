package com.oop.lab9;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainCalculator {

    public static void actionChecker(TextField numOneF, TextField numTwoF, TextField resultField, Button button) {
        button.setOnAction(actionEvent ->
        {
            try
            {
                calculate(numOneF, numTwoF, resultField, button.getText());
            }
            catch (UnluckyException unlucky)
            {
                resultField.setText(unlucky.message);
            }
            catch (InvalidOperation invalidOperation)
            {
                resultField.setText(invalidOperation.message);
            }
            catch (NumberFormatException invalidFormat)
            {
                resultField.setText("Something is wrong with number format");
            }
        });
    }


    private static void calculate(TextField num1, TextField num2, TextField resultField, String operand) throws UnluckyException, InvalidOperation {
        float numOne, numTwo, result;

        numOne = Float.parseFloat(num1.getText());
        numTwo = Float.parseFloat(num2.getText());

        result = switch (operand) {
            case "*" -> numOne * numTwo;
            case "/" -> numOne / numTwo;
            case "+" -> numOne + numTwo;
            case "-" -> numOne - numTwo;
            case "13" -> throw new UnluckyException();
            default -> throw new InvalidOperation();
        };

        resultField.setText(String.valueOf(result));
    }


}

