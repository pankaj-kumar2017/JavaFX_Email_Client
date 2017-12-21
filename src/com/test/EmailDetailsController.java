package com.test;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.web.WebView;

public class EmailDetailsController implements Initializable {
	
	private Singleton singleton;
	
	@FXML
    private WebView webView;

    @FXML
    private Label subjectLabel;

    @FXML
    private Label senderLabel;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		singleton = Singleton.getInstance();
		System.out.println("EmailDetailsController initialized");
		
		subjectLabel.setText("Subject: " + singleton.getMessage().getSubject());
		senderLabel.setText("Sender: " + singleton.getMessage().getSender());
		
		webView.getEngine().loadContent(singleton.getMessage().getContent());
		
	}

}
