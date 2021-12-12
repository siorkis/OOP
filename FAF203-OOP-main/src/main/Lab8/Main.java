package Lab8;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Basic Calculator v1.0");
		
		TextField num1 = new TextField();
		TextField num2 = new TextField();
		Label result = new Label();
		Label error = new Label();
		
		error.setTextFill(Color.web("#ff0000"));
		error.setFont(new Font(30.0));
		result.setFont(new Font(20.0));
		
		Button btn = new Button();
		btn.setText("Divide");
		btn.setOnAction(event ->
		{
			try
			{
				result.setText("");
				error.setText("");
				
				if (num1.getText().isEmpty())
				{
					throw new Exception("The first input is empty");
				}
				
				if (num2.getText().isEmpty())
				{
					throw new Exception("The second input is empty");
				}
				
				float num1Val = Float.parseFloat(num1.getText());
				float num2Val = Float.parseFloat(num2.getText());
				
				if (num2Val == 0f)
				{
					throw new ArithmeticException("Don't divide by zero");
				}
				
				if (num2Val == 13f)
				{
					throw new Unlucky("Don't divide by 13. Satan will take your soul");
				}
				
				float resultVal = num1Val / num2Val;
				result.setText( Float.toString(resultVal) );
			}
			catch(NumberFormatException e)
			{
				error.setText("It looks like parsing the inputs failed. Maybe you accidentaly put a letter there?");
			}
			catch(Exception e)
			{
				error.setText(e.getMessage());
			}
		});
		
		VBox root = new VBox(20);

		root.getChildren().addAll(num1, num2, btn, result, error);
		primaryStage.setScene(new Scene(root, 600, 250));
		primaryStage.show();
	}
}