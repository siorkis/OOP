package com.oop.lab9;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MainController extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("by FoxFurry");

        GridPane mainGrid = new GridPane();

        TextField   numOne = new TextField(),
                    numTwo = new TextField(),
                    result = new TextField();

        Button  plus = new Button("+"),
                minus = new Button("-"),
                mult = new Button("*"),
                div = new Button("/");

        int gap = 10,
            padding = 15,
            numOfColumns = 4,
            numOfRows = 3;

        numOne.setPromptText("First number");
        numTwo.setPromptText("Second number");

        result.setPromptText("Result");
        result.setEditable(false);

        mainGrid.setAlignment(Pos.CENTER);
        mainGrid.setHgap(gap);
        mainGrid.setVgap(gap);
        mainGrid.setPadding(new Insets(padding, padding, padding, padding));

        for(int i = 0; i < numOfColumns; i++){
            mainGrid.getColumnConstraints().add(new ColumnConstraints());
            mainGrid.getColumnConstraints().get(i).setPercentWidth(24);
            mainGrid.getColumnConstraints().get(i).setHgrow(Priority.SOMETIMES);
        }

        for(int i = 0; i < numOfRows; i++){
            mainGrid.getRowConstraints().add(new RowConstraints());
            mainGrid.getRowConstraints().get(i).setPercentHeight(7);
            mainGrid.getRowConstraints().get(i).setVgrow(Priority.SOMETIMES);
        }
        mainGrid.getRowConstraints().get(2).setPercentHeight(20);

        mainGrid.add(numOne, 0, 0, 2, 1);
        mainGrid.add(numTwo, 2, 0, 2, 1);
        mainGrid.add(result, 0, 2, 4, 1);

        mainGrid.add(plus, 0, 1);
        mainGrid.add(minus, 1 ,1);
        mainGrid.add(mult, 2, 1);
        mainGrid.add(div, 3 , 1);

        MainCalculator.actionChecker(numOne, numTwo, result, plus);
        MainCalculator.actionChecker(numOne, numTwo, result, minus);
        MainCalculator.actionChecker(numOne, numTwo, result, mult);
        MainCalculator.actionChecker(numOne, numTwo, result, div);

        Scene scene = new Scene(mainGrid, 400, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
