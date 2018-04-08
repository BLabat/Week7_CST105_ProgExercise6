/** Program: ProgrammingExercise 8 exercise 6
 * File: CheckerBoard.Java
 * Summary: Displays CheckerBoard
 * Author: Brandon Labat
 * Date: April 8, 2018
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CheckerBoard extends Application {
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		boolean isBlack = false;
		for(int i = 0; i <8; i++) {
			for (int j = 0; j < 8; j++) {
				Rectangle rec = new Rectangle (50, 50, (isBlack) ? Color.BLACK : Color.WHITE);
				pane.add(rec, j, i);
				isBlack = !isBlack;
			}
				isBlack = !isBlack;
		}
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Checkerboard");
		primaryStage.setMinHeight(400);
		primaryStage.setMinWidth(400);
		primaryStage.show();
	}
}
