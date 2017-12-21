package com.test;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Test extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Pane parent = new FlowPane();
		Label label = new Label("label!!!");
		Button button = new Button("Click!!!");

		parent.getChildren().addAll(label, button);
		
		button.setOnAction(new EventHandler<ActionEvent>( ) {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Clicking the Button");
				System.out.println(event.getSource());
				
			}
		});

		Scene scene = new Scene(parent);

		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
